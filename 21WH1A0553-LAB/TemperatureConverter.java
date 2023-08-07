package clss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {
    private JButton convert, clear;
    private JTextField fahrenheitField, celsiusField;

    public TemperatureConverter() {
        this.setLayout(null);

        convert = new JButton("Convert");
        convert.setBounds(100, 180, 100, 50);
        convert.setBackground(Color.GRAY);
        this.add(convert);

        clear = new JButton("Clear");
        clear.setBounds(250, 180, 100, 50);
        clear.setBackground(Color.GRAY);
        this.add(clear);

        fahrenheitField = new JTextField();
        fahrenheitField.setBounds(100, 100, 100, 50);
        this.add(fahrenheitField);

        celsiusField = new JTextField();
        celsiusField.setBounds(250, 100, 100, 50);
        celsiusField.setEditable(false);
        this.add(celsiusField);

        JLabel fLabel = new JLabel("°F");
        fLabel.setBounds(205, 110, 20, 30);
        this.add(fLabel);

        JLabel cLabel = new JLabel("°C");
        cLabel.setBounds(355, 110, 20, 30);
        this.add(cLabel);

        convert.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Convert")) {
            try {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                double celsius = (fahrenheit - 32) * 5.0 / 9.0;
                celsiusField.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException e) {
                celsiusField.setText("Invalid Input");
            }
        }
        if (str.equals("Clear")) {
            fahrenheitField.setText("");
            celsiusField.setText("");
        }
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.setTitle("Temperature Converter");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Path\\To\\Your\\Icon.png");
        converter.setIconImage(icon);
        converter.setSize(430, 400);
        converter.setBackground(Color.WHITE);
        converter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converter.setVisible(true);
    }
}
