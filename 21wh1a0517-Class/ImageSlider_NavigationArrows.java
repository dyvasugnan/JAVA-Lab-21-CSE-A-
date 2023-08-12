package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageSlider_NavigationArrows extends JFrame implements ActionListener {
    int x = 100;
    int y = 100;
    JLabel img;
    JButton up, down, left, right,reset; // Use JButton instead of Button for Swing

    ImageSlider_NavigationArrows() {
        ImageIcon i = new ImageIcon("C:\\Users\\Renukumar\\Pictures\\kushi\\Java_programs\\21wh1a0517java\\src\\java_logo.jpeg");
        img = new JLabel(i);

        up = new JButton("^");    // Use JButton instead of Button for Swing
        down = new JButton("v"); // Use JButton instead of Button for Swing
        left = new JButton("<"); // Use JButton instead of Button for Swing
        right = new JButton(">"); // Use JButton instead of Button for Swing
        reset = new JButton("Reset");
        Container c = getContentPane();

        c.setLayout(null);
        c.add(img);
        c.add(up);
        c.add(down);
        c.add(left);
        c.add(right);
        c.add(reset);
        
        img.setBounds(x, y, 1250, 550);
        up.setBounds(710, 590, 50, 50);
        down.setBounds(710, 710, 50, 50);
        left.setBounds(625, 650, 50, 50);
        right.setBounds(790, 650, 50, 50);
        reset.setBounds(690,650,90,50);
        up.addActionListener(this);
        down.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);
        reset.addActionListener(this);
        //this.setBackground(Color.black);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals(">")) { // Use .equals() to compare strings
            x = x + 10;
            img.setBounds(x, y, 1250, 550);
        } else if (str.equals("<")) {
            x = x - 10;
            img.setBounds(x, y, 1250, 550);
        } else if (str.equals("^")) {
            y = y - 10;
            img.setBounds(x, y, 1250, 550);
        } else if (str.equals("v")) {
            y = y + 10;
            img.setBounds(x, y, 1250, 550);
        }else if(str.equals("Reset")) {
        	x=100;
        	y=100;
        	img.setBounds(x,y,1250,550);
        }
    }

    public static void main(String[] args) {
    	ImageSlider_NavigationArrows isna = new ImageSlider_NavigationArrows();
        isna.setSize(400, 400);
        isna.setVisible(true);
        isna.setTitle("ImageSlider_NavigationArrows");
        isna.setDefaultCloseOperation(EXIT_ON_CLOSE);
        isna.setBackground(Color.LIGHT_GRAY);
    }
}
