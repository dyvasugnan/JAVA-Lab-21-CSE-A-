package javaClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageMoveApp extends JFrame {
    private JLabel imageLabel;
    private int x = 200;
    private int y = 200;

    public ImageMoveApp() {
        setTitle("Image Move");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\DELL\\Downloads\\flower.jpg"));
            ImageIcon icon = new ImageIcon(scaleImage(image, 200, 200)); // Increase the image size here
            imageLabel = new JLabel(icon);
        } catch (IOException e) {
            e.printStackTrace();
            imageLabel = new JLabel("Image Not Found");
        }

        imageLabel.setBounds(x, y, 200, 200); // Adjust the size of the label to match the image size
        add(imageLabel);

        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        upButton.setBounds(400, 400, 50, 50);
		downButton.setBounds(400,500,50,50);
		leftButton.setBounds(300,450,50,50);
		rightButton.setBounds(500,450,50,50);

        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                y -= 10;
                updateLabelPosition();
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                y += 10;
                updateLabelPosition();
            }
        });

        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x -= 10;
                updateLabelPosition();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x += 10;
                updateLabelPosition();
            }
        });

        add(upButton);
        add(downButton);
        add(leftButton);
        add(rightButton);
    }

    private void updateLabelPosition() {
        imageLabel.setBounds(x, y, 200, 200); // Adjust the size of the label to match the image size
    }

    private BufferedImage scaleImage(BufferedImage image, int width, int height) {
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        graphics.drawImage(scaledImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageMoveApp().setVisible(true);
            }
        });
    }
}
