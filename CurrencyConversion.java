package inheritance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CurrencyConversion extends JFrame implements ActionListener{
    JButton b1, b3, b5;
    JTextField t1, t2;
    JLabel l1,l2;

    CurrencyConversion() {
        Container c = getContentPane();
        c.setLayout(null);
        b1 = new JButton("Rupees");
        b3 = new JButton("Dollar");
        b5 = new JButton("clear");
        t1 = new JTextField();
        t2 = new JTextField();
        l1 = new JLabel("num");
        l2 = new JLabel("ans");
        t1.setBounds(100, 150, 100, 50);
        t2.setBounds(100, 150, 100, 50);
        l1.setBounds(100, 100, 100, 50);
        b1.setBounds(100, 350, 100, 50);
        l2.setBounds(100, 200, 100, 50);
        b3.setBounds(100, 450, 100, 50);
        b5.setBounds(100, 550, 100, 50);
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
        
        if (s.equals("Rupees")) {
            float ft = Float.parseFloat(t1.getText());
            float t = Math.round(ft *82.77);      
            t2.setText(String.valueOf(t));
        }
        if (s.equals("Dollar")) {
            float ft = Float.parseFloat(t1.getText());
            float t = ft/82.77f;
            t2.setText(String.valueOf(t));
        }
        if (s.equals("clear")) {
            t1.setText("");
            t2.setText("");
        }
    }

public static void main(String[] args) {
    CurrencyConversion cc = new CurrencyConversion();
    cc.setSize(500, 600);  
    cc.setTitle("Money Converter");
    cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    cc.setVisible(true);
}
}