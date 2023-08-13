package javaclasswork;
import java.awt.*;
import java.awt.event.*;

public class ImageMovingGui extends Frame {
    int circleX = 950; 
    int circleY = 255; 
    int circleRadius = 40; 
    ImageMovingGui() {
        this.setLayout(null);

        Button leftButton = new Button("Left");
        Button rightButton = new Button("Right");
        Button upButton = new Button("Up");
        Button downButton = new Button("Down");

        leftButton.setBounds(180, 250, 100, 30);
		rightButton.setBounds(290, 250, 100, 30);
		upButton.setBounds(230, 190, 100, 30);
		downButton.setBounds(230, 310, 100, 30);

        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circleX -= 50;
                repaint();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circleX += 50;
                repaint();
            }
        });

        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circleY -= 50;
                repaint();
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                circleY += 50;
                repaint();
            }
        });

        this.add(leftButton);
        this.add(rightButton);
        this.add(upButton);
        this.add(downButton);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(circleX - circleRadius, circleY - circleRadius, 2 * circleRadius, 2 * circleRadius);
    }

    public static void main(String args[]) {
        ImageMovingGui mg = new ImageMovingGui();
        mg.setTitle("CircleMoving");
        mg.setSize(600, 500);
        mg.setVisible(true);
        mg.setLocation(500, 200);
        mg.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

		
	