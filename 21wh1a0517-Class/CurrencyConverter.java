package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter  extends JFrame implements ActionListener {
    JButton b, b1;
    JTextField tf, tf1;
    JLabel l, l1;
    JComboBox<String> Box;

   CurrencyConverter() {
        this.setTitle("Currency_Converter");
        this.setSize(400,400);
        this.setLayout(null);

        l = new JLabel("Enter Amount");
        l.setBounds(100, 150, 100, 50);
        tf = new JTextField();
        tf.setBounds(300, 150, 100, 50);//enter amount space
        l1 = new JLabel("Result");
        l1.setBounds(100, 450, 100, 50);
        tf1 = new JTextField();
        tf1.setBounds(300, 450, 100, 50);//result amount space
        b = new JButton("Convert");
        b.setBounds(100, 350, 100, 50);
        b.setBackground(Color.gray);
        b1 = new JButton("Clear");
        b1.setBounds(300, 350, 100, 50);
        b1.setBackground(Color.gray);
   
        String[] s = {"USD to INR", "INR to USD"};
        Box = new JComboBox<>(s);
        Box.setBounds(120, 250, 250, 50);//choice
        this.add(Box);
        
        this.add(l);
        this.add(tf);
        this.add(l1);
        this.add(tf1);
        this.add(b);
        this.add(b1);
        
        tf.addActionListener(this);      
        tf1.addActionListener(this);
        b.addActionListener(this);      
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            try {
                double amount = Double.parseDouble(tf.getText());
                String select = (String) Box.getSelectedItem();
                double convert;

                if (select.equals("USD to INR")) {
                    convert = usdToInr(amount);
                    tf1.setText(String.format("%.2f INR", convert));
                } else if (select.equals("INR to USD")) {
                    convert = inrTousd(amount);
                    tf1.setText(String.format("%.3f USD", convert));
                }
            } catch (NumberFormatException ex) {
                tf1.setText("Invalid input.");
            }
        } else if (ae.getSource() == b1) {
            tf.setText("");
            tf1.setText("");
        }
    }

    double usdToInr(double usd) {
        return usd * 82.78;
    }

    double inrTousd(double inr) {
        return inr * 0.012;
    }

    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}