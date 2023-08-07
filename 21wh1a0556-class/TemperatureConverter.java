import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField tf1, tf2;
    JLabel l1, l2;
    JComboBox<String> Box;

    TempConverter() {
        setTitle("Temperature Converter");
        setLayout(null);

        l1 = new JLabel("Enter Temperature");
        l1.setBounds(100, 50, 150, 30);
        tf1 = new JTextField();
        tf1.setBounds(250, 50, 150, 30);
        l2 = new JLabel("Result:");
        l2.setBounds(100, 150, 100, 30);
        tf2 = new JTextField();
        tf2.setBounds(200, 150, 100, 30);
        
        this.add(l1);
        this.add(tf1);
        this.add(l2);
        this.add(tf2);
        
        String[] s = {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
        Box = new JComboBox<>(s);
        Box.setBounds(100, 100, 200, 30);
        this.add(Box);
       
        b1 = new JButton("Convert");
        b1.setBounds(100, 200, 100, 30);
        b1.setBackground(Color.LIGHT_GRAY);
        b2 = new JButton("Clear");
        b2.setBounds(200, 200, 100, 30);
        b2.setBackground(Color.LIGHT_GRAY);
        
        this.add(b1);
        this.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        tf1.addActionListener(this);
        tf1.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                double temp = Double.parseDouble(tf1.getText());
                String select = (String) Box.getSelectedItem();
                double convert;

                if (select.equals("Celsius to Fahrenheit")) {
                    convert = celsiusToFahrenheit(temp);
                    tf2.setText(String.format("%.2f°F", convert));
                } else if (select.equals("Fahrenheit to Celsius")) {
                    convert = fahrenheitToCelsius(temp);
                    tf2.setText(String.format("%.2f°C", convert));
                }
            } catch (NumberFormatException ex) {
                tf2.setText("Invalid input.");
            }
        } else if (ae.getSource() == b2) {
            tf1.setText("");
            tf2.setText("");
        }
    }

    double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        TempConverter tc = new TempConverter();
        tc.setSize(450,350);
        tc.setVisible(true);
        tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
