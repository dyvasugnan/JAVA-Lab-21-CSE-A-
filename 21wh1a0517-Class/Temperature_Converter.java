package javalab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temperature_Converter extends JFrame implements ActionListener {
    JButton b, b1;
    JTextField Jtf, Jtf1;
    JLabel l1, l2;
    JComboBox<String> Box;

    Temperature_Converter() {
        setTitle("Temperature_Converter");
        setBounds(100, 100, 300, 250);
        setLayout(null);

        l1 = new JLabel("Enter Temperature:");
        l1.setBounds(100, 150, 200, 50);
        add(l1);

        Jtf = new JTextField();
        Jtf.setBounds(300, 150, 200, 50);
        add(Jtf);

        String[] conversion = {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
        Box = new JComboBox<>(conversion);
        Box.setBounds(120, 250, 350, 50);
        add(Box);

        l2 = new JLabel("Result:");
        l2.setBounds(100, 450, 200, 50);
        add(l2);

        Jtf1 = new JTextField();
        Jtf1.setBounds(300, 450, 200, 50);
        Jtf1.setEditable(false);
        add(Jtf1);

        b = new JButton("Convert");
        b.setBounds(150, 350, 100, 50);
        b.setBackground(Color.white);
        add(b);
        b.addActionListener(this);

        b1 = new JButton("Clear");
        b1.setBounds(300, 350, 100, 50);
        b1.setBackground(Color.white);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            try {
                double temperature = Double.parseDouble(Jtf.getText());
                String select = (String) Box.getSelectedItem();
                double converttemp;

                if (select.equals("Celsius to Fahrenheit")) {
                    converttemp = celsiusToFahrenheit(temperature);
                    Jtf1.setText(String.format("%.2f°F", converttemp));
                } else if (select.equals("Fahrenheit to Celsius")) {
                    converttemp = fahrenheitToCelsius(temperature);
                    Jtf1.setText(String.format("%.2f°C", converttemp));
                }
            } catch (NumberFormatException ex) {
                Jtf1.setText("Invalid input.");
            }
        } else if (e.getSource() == b1) {
            Jtf.setText("");
            Jtf1.setText("");
        }
    }

    double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
    	Temperature_Converter tc = new Temperature_Converter();
        tc.setVisible(true);
        tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}