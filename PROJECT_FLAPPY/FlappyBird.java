package PROJECT_FLAPPY.BirdGame;


import PROJECT_FLAPPY.BirdGame.Renderer;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import javax.imageio.ImageIO;
/**
 *
 * @author chinm
 */
public final class FlappyBird implements ActionListener,KeyListener{
     public static void main(String[] args) throws Exception {
        flappybird = new FlappyBird();
    }

    public static FlappyBird flappybird;
    public Renderer renderer;
    public Rectangle bird;
    public int ticks, yMotion, score;
    public ArrayList<Rectangle> obstaclesList;
    public Random random;
    public boolean gameOver, gameStarted;

    public final int SCREEN_WIDTH = 800, SCREEN_HEIGHT = 800;

    //bird image
    private int lives = 3;
    private BufferedImage birdImage;
    private int highScore = 0;
    private int messageDisplayTime= 0;
    private int highScoreReached = 0;
    private int obstacleStopTicks = 0;
    private boolean pauseObstacles = false;
   // private ArrayList<Rectangle> lastCollisionObstacles = new ArrayList<>(); // To store the last obstacles that caused a collision
   
    private Rectangle lastCollisionObstacle;
    public FlappyBird() {
        lives = 3;
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);
        renderer = new Renderer();
        random = new Random();

        jframe.add(renderer);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        jframe.addKeyListener(this);
        jframe.setResizable(false);
        jframe.setTitle("Flappy Bird Game");
        jframe.setVisible(true);

        try{
            birdImage = ImageIO.read(new File("PROJECT_FLAPPY/image.png"));
        }
        catch(IOException e){
            e.printStackTrace();
        }

        bird = new Rectangle(SCREEN_WIDTH / 2 - 10, SCREEN_HEIGHT / 2 - 10, 50, 50);
        obstaclesList = new ArrayList<>();

        addObstacle(true);
        addObstacle(true);
        addObstacle(true);
        addObstacle(true);

        timer.start();
    }

    public void addObstacle(boolean startGame) {

        int space = 300;
        int width = 100;
        int height = 50 + random.nextInt(300); // Min height 50, max height 300.

        if (startGame) {

            obstaclesList.add(new Rectangle(SCREEN_WIDTH + width + obstaclesList.size() * 300, SCREEN_HEIGHT - height - 120, width, height)); // Place
                                                                                                                    // a
                                                                                                                    // column/pipe.
            obstaclesList.add(new Rectangle(SCREEN_WIDTH + width + (obstaclesList.size() - 1) * 300, 0, width, SCREEN_HEIGHT - height - space)); // Place
                                                                                                                       // a
                                                                                                                       // column/pipe.
        } else {

            obstaclesList.add(new Rectangle(obstaclesList.get(obstaclesList.size() - 1).x + 600, SCREEN_HEIGHT - height - 120, width, height)); // Place
                                                                                                                       // a
                                                                                                                       // column/pipe.
            obstaclesList.add(new Rectangle(obstaclesList.get(obstaclesList.size() - 1).x, 0, width, SCREEN_HEIGHT - height - space)); // Place a
                                                                                                              // column/pipe.
        }

    }

    //changed
    // public void resetGame(){
    //     bird = new Rectangle(SCREEN_WIDTH/2 - 10, SCREEN_HEIGHT/2 - 10,50,50);
    //     obstaclesList.clear();
    //     yMotion = 0;
    // addObstacle(true);
    // addObstacle(true);
    // addObstacle(true);
    // addObstacle(true);
    
    // gameOver = false;
    // gameStarted = false; 
    // }

    public void paintObstacle(Graphics g, Rectangle column) {
        g.setColor(Color.green.darker().darker());
        g.fillRect(column.x, column.y, column.width, column.height);
    }

    public void makeJump() {

        if (gameOver) {
            bird = new Rectangle(SCREEN_WIDTH / 2 - 10, SCREEN_HEIGHT / 2 - 10, 50, 50);
            obstaclesList.clear();
            yMotion = 0;
            score = 0;
            addObstacle(true);
            addObstacle(true);
            addObstacle(true);
            addObstacle(true);
            gameOver = false;
        }

        if (!gameStarted) {
            gameStarted = true;
        } else if (!gameOver) {
            if (yMotion > 0) {
                yMotion = 0;
            }
            yMotion -= 10;
            // yMotion = 0;
            // yMotion -= 10;
        }
    }

    // To render multiple times, use our Renderer.
      @Override
    public void actionPerformed(ActionEvent arg0) {
        int speed = 10;
        ticks++;
        if (gameStarted && !gameOver) {
            if (!pauseObstacles) {
            for (int i = 0; i < obstaclesList.size(); i++) {
                Rectangle obstacle = obstaclesList.get(i);
                obstacle.x -= speed;
            }
            }

            if (ticks % 2 == 0 && yMotion < 15) {
                yMotion += 2;
            }
            // else{
            //     yMotion -= 2;
            // }

            for (int i = 0; i < obstaclesList.size(); i++) {
                if (!pauseObstacles) {
                Rectangle obstacle = obstaclesList.get(i);
                if (obstacle.x + obstacle.width < 0) {
                    obstaclesList.remove(obstacle);
                    if (obstacle.y == 0) {
                        addObstacle(false);
                    }
                }
            }
            }

            bird.y += yMotion;

            for (Rectangle obstacle : obstaclesList) {
                   
                if (obstacle.y == 0 && bird.x + bird.width / 2 > obstacle.x + obstacle.width / 2 - 10 && bird.x + bird.width / 2 < obstacle.x + obstacle.width / 2 + 10) {

                    score++;
                }

                if (obstacle.intersects(bird)) {
                        lives--;
                        
                     if(lives==0){  
                    gameOver = true;
                    highScoreReached = 0;
                    lives = 3;
                     }else{
                        bird = new Rectangle(SCREEN_WIDTH / 2 - 10, SCREEN_HEIGHT / 2 - 10, 50, 50);
                        yMotion = 0;
                        
                        pauseObstacles = true; // Pause obstacles
                    obstacleStopTicks = 5;
                    lastCollisionObstacle = obstacle;
                        }
                    //     else bird.y = SCREEN_HEIGHT-obstacle.height - 20;
                    //     yMotion = 0;

                    //  }

                    if (bird.x <= obstacle.x) {

                        bird.x = obstacle.x - bird.width;

                    } else {
                        
                        if (obstacle.y != 0) {
                            
                            bird.y = obstacle.y - bird.height;

                        } else if (bird.y < obstacle.height) {
                            
                            bird.y = obstacle.height;
                        }
                    }
                }
            
            }
            
           
            if (bird.y > SCREEN_HEIGHT - 120 || bird.y < 0) {

                gameOver = true;
            }

            if (bird.y + yMotion >= SCREEN_HEIGHT - 120) {

                bird.y = SCREEN_HEIGHT - 120 - bird.height;
            }

            if(score>highScore){
                highScore = score;
                 if(highScoreReached ==0 ){
                 messageDisplayTime = 60;
                 highScoreReached = 1;
                 }
            }


            //
            if (pauseObstacles && obstacleStopTicks > 0) {
                obstacleStopTicks--; // Decrease obstacle pause frames
                if (obstacleStopTicks == 0) {
                    pauseObstacles = false; // Resume obstacle movement after 60 frames
                    // for (Rectangle lastCollisionObstacle : lastCollisionObstacles) {
                    //     lastCollisionObstacle.x -= 300; // Move the last collision obstacles ahead
                    // }
                    // lastCollisionObstacles.clear(); 
                    if (lastCollisionObstacle != null) {
                        lastCollisionObstacle.x -= 300; // Move the last collision obstacle ahead
                        
                            // If it's an upper obstacle, also move the corresponding lower obstacle ahead
                        if(obstaclesList.indexOf(lastCollisionObstacle)%2!=0){
                            int lowerObstacleIndex = obstaclesList.indexOf(lastCollisionObstacle) - 1;
                            System.out.println(lowerObstacleIndex%2==0);
                            if (lowerObstacleIndex < obstaclesList.size()) {
                                Rectangle lowerObstacle = obstaclesList.get(lowerObstacleIndex);
                                lowerObstacle.x -= 300;
                            }
                        }else{
                            int lowerObstacleIndex = obstaclesList.indexOf(lastCollisionObstacle) + 1;
                             System.out.println(lowerObstacleIndex%2==0);
                            if (lowerObstacleIndex < obstaclesList.size()) {
                                Rectangle lowerObstacle = obstaclesList.get(lowerObstacleIndex);
                                lowerObstacle.x -= 300;
                            }
                        }
                    
                    }
                }
            }

        }

        if(messageDisplayTime>0){
            messageDisplayTime--;
        }
        renderer.repaint();
    }

    public void repaint(Graphics g) {
        // Background Color.
        g.setColor(Color.cyan);
        g.fillRect(0, 0, SCREEN_HEIGHT, SCREEN_WIDTH);

        // Add Ground.
        g.setColor(Color.orange);
        g.fillRect(0, SCREEN_HEIGHT - 120, SCREEN_WIDTH, 120);

        // Add Grass.
        g.setColor(Color.green);
        g.fillRect(0, SCREEN_HEIGHT - 120, SCREEN_WIDTH, 20);

        g.drawImage(birdImage, bird.x, bird.y, bird.width,bird.height,null);
        // Bird (player) icon.

        // g.setColor(Color.red);
        // g.fillRect(bird.x, bird.y, bird.height, bird.width);

        for (Rectangle obstacle : obstaclesList) {

            paintObstacle(g, obstacle);
        }

        g.setColor(Color.white);
        g.setFont(new Font("Arial", 1, 60));

        if (!gameStarted) {

            g.drawString("Click to Begin", 75, SCREEN_HEIGHT / 2 - 50);
        }
        if(messageDisplayTime>0){
            g.setColor(Color.red);
            g.setFont(new Font("Arial",Font.BOLD,30));
            g.drawString("High Score!!!",100,200);
        }
        if (gameOver) {
            g.setColor(Color.white);
            g.setFont(new Font("Arial",Font.ITALIC,50));

            g.drawString("TRY AGAIN", 100, SCREEN_HEIGHT / 2 - 50);

            g.setColor(Color.white);
            g.setFont(new Font("TimesNewRoman",Font.BOLD,40));

        
            g.drawString("Score : " + String.valueOf(score/2), 100,SCREEN_HEIGHT/2+50);
            g.drawString("High Score: " + String.valueOf(highScore/2), 100, SCREEN_HEIGHT / 2 + 150);
        }

        if (!gameOver && gameStarted) {
            g.setColor(Color.white);
            g.setFont(new Font("Arial",Font.BOLD,40));
            // g.drawString("Score: "+ String.valueOf(score/2), SCREEN_WIDTH / 2 - 25, 100);
            g.drawString("Score: "+ String.valueOf(score/2), 500, 100);
            
             g.drawString("lives : " + String.valueOf(lives),500,200); 
        }
    }


      @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() ==  KeyEvent.VK_SPACE) {
            makeJump();
            // yMotion -= 10;
           
        }
        // }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
        //     yMotion += 10;
            
        // }
    }

      @Override
    public void keyTyped(KeyEvent e) {}
      @Override
    public void keyReleased(KeyEvent e) {
    //     int key = e.getKeyCode();
    // if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
    //     yMotion = 0;
    // }

        // int key = e.getKeyCode();
        // if(key==KeyEvent.VK_UP){
        //     yMotion = 0;
        // }
        // else if(key==KeyEvent.VK_DOWN){
        //     yMotion = 0;
        // }
    }
    
}