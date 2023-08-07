package javalab;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TemperatureConversion extends JFrame implements ActionListener {
    JButton b1, b3, b5;
    JTextField t1, t2;
    JLabel l1,l2;

    TemperatureConversion() {
        Container c = getContentPane();
        c.setLayout(null);
        b1 = new JButton("Fahrenheit");
        b3 = new JButton("Celsius");
        b5 = new JButton("clear");
        t1 = new JTextField();
        t2 = new JTextField();
        l1 = new JLabel("num");
        l2 = new JLabel("ans");
        t1.setBounds(100, 150, 100, 50);
        t2.setBounds(100, 250, 100, 50);
        l1.setBounds(100, 100, 100, 50);
        b1.setBounds(100, 300, 100, 50);
        l2.setBounds(100, 200, 100, 50);
        b3.setBounds(100, 400, 100, 50);
        b5.setBounds(100, 500, 100, 50);
        c.add(b1);
        c.add(b3);
        c.add(b5);
        c.add(l1);
        c.add(l2);
        c.add(t1);
        c.add(t2);
        b1.addActionListener(this);
        b3.addActionListener(this);
        b5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("Fahrenheit")) {
            float f = Float.parseFloat(t1.getText());
            float t = (f * 9) / 5;
            float r = t + 32;
            t2.setText(String.valueOf(r));
        }
        if (s.equals("Celsius")) {
            float f = Float.parseFloat(t1.getText());
            float t = f - 32;
            float r = (t * 5) / 9;
            t2.setText(String.valueOf(r));
        }
        if (s.equals("clear")) {
            t1.setText("");
            t2.setText("");
        }
    }

public static void main(String[] args) {
    TemperatureConversion tc = new TemperatureConversion();
    tc.setSize(500, 600);  
    tc.setTitle("Temperature Converter");
    tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tc.setVisible(true);
}
}
