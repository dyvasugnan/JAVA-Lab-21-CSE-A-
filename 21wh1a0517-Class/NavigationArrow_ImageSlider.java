package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavigationArrow_ImageSlider extends JFrame {
    private ImageIcon imageIcon;
    private JLabel imageLabel;

    private int imageX = 100;
    private int imageY = 100;

    public NavigationArrow_ImageSlider() {
        setTitle("Image Movement");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        imageIcon = new ImageIcon("C:\\Users\\Renukumar\\Pictures\\kushi\\Java_programs\\21wh1a0517java\\src\\java_logo.jpeg");
        imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(imageX, imageY, imageIcon.getIconWidth(), imageIcon.getIconHeight());

        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveImage(-10, 0);
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveImage(10, 0);
            }
        });

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveImage(0, -10);
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveImage(0, 10);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // Use a layout manager
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        buttonPanel.add(upButton);
        buttonPanel.add(downButton);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout()); // Use BorderLayout for the content pane
        contentPane.add(imageLabel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(contentPane); // Set the content pane with the layout

        // Remove getContentPane().setLayout(null);
    }

    private void moveImage(int deltaX, int deltaY) {
        imageX += deltaX;
        imageY += deltaY;

        imageLabel.setLocation(imageX, imageY);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	NavigationArrow_ImageSlider na = new NavigationArrow_ImageSlider();
                na.setVisible(true);
            }
        });
    }
}
