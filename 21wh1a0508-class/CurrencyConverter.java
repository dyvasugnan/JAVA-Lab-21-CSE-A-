package javaClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CurrencyConverter extends JFrame implements ActionListener {
    JButton b, clear;
    JTextField Jtf1, Jtf2;
    JLabel l1, l2;
    JComboBox<String> Box;

   CurrencyConverter() {
        setTitle("Currency Converter");
        setBounds(100, 100, 300, 250);
        setLayout(null);

        l1 = new JLabel("Enter Amount (AUD):");//Australian Dollar(AUD)
        l1.setBounds(20, 30, 130, 20);
        add(l1);

        Jtf1 = new JTextField();
        Jtf1.setBounds(150, 30, 120, 20);
        add(Jtf1);

        String[] conversion = {"AUD to INR", "INR to AUD"};//Indain Rupee(INR)
        Box = new JComboBox<>(conversion);
        Box.setBounds(50, 70, 200, 20);
        add(Box);

        l2 = new JLabel("Result:");
        l2.setBounds(20, 110, 50, 20);
        add(l2);

        Jtf2 = new JTextField();
        Jtf2.setBounds(70, 110, 200, 20);
        Jtf2.setEditable(false);
        add(Jtf2);

        b = new JButton("Convert");
        b.setBounds(50, 150, 100, 30);
        b.setBackground(Color.gray);
        add(b);
        b.addActionListener(this);

        clear = new JButton("Clear");
        clear.setBounds(170, 150, 100, 30);
        clear.setBackground(Color.gray);
        add(clear);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            try {
                double amount = Double.parseDouble(Jtf1.getText());
                String select = (String) Box.getSelectedItem();
                double convertedAmount;

                if (select.equals("AUD to INR")) {
                    convertedAmount = audToInr(amount);
                    Jtf2.setText(String.format("%.2f INR", convertedAmount));
                } else if (select.equals("INR to AUD")) {
                    convertedAmount = inrToAud(amount);
                    Jtf2.setText(String.format("%.2f AUD", convertedAmount));
                }
            } catch (NumberFormatException ex) {
                Jtf2.setText("Invalid input.");
            }
        } else if (e.getSource() == clear) {
            Jtf1.setText("");
            Jtf2.setText("");
        }
    }

    double audToInr(double aud) {
        // Use the current exchange rate or a fixed value for conversion
        // For example, 1 AUD = 54.37 INR
        return aud * 54.37;
    }

    double inrToAud(double inr) {
        // Use the current exchange rate or a fixed value for conversion
        // For example, 1 INR = 0.018 AUD
        return inr * 0.018;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        converter.setVisible(true);
        converter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
