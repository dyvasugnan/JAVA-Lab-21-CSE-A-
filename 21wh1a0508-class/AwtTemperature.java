package javaClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AwtTemperature extends JFrame implements ActionListener {
    JButton b, clear;
    JTextField Jtf1, Jtf2;
    JLabel l1, l2;
    JComboBox<String> Box;

    AwtTemperature() {
        setTitle("Temperature Converter");
        setBounds(100, 100, 300, 250);
        setLayout(null);

        l1 = new JLabel("Enter Temperature:");
        l1.setBounds(20, 30, 130, 20);
        add(l1);

        Jtf1 = new JTextField();
        Jtf1.setBounds(150, 30, 120, 20);
        add(Jtf1);

        String[] conversion = {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
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
                double temperature = Double.parseDouble(Jtf1.getText());
                String select = (String) Box.getSelectedItem();
                double converttemp;

                if (select.equals("Celsius to Fahrenheit")) {
                    converttemp = celsiusToFahrenheit(temperature);
                    Jtf2.setText(String.format("%.2f°F", converttemp));
                } else if (select.equals("Fahrenheit to Celsius")) {
                    converttemp = fahrenheitToCelsius(temperature);
                    Jtf2.setText(String.format("%.2f°C", converttemp));
                }
            } catch (NumberFormatException ex) {
                Jtf2.setText("Invalid input.");
            }
        } else if (e.getSource() == clear) {
            Jtf1.setText("");
            Jtf2.setText("");
        }
    }

    double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Temperature converter = new Temperature();
        converter.setVisible(true);
        converter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
