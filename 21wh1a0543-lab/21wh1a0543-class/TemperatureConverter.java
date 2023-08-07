package awtprograms;

import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends Frame implements ActionListener {
     Label inputLabel, outputLabel;
     TextField inputField, outputField;
     Button convertButton, clearButton;

     TemperatureConverter() {
        
        setTitle("Temperature Converter");
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        inputLabel = new Label("Enter temperature:");
        inputField = new TextField();
        outputLabel = new Label("Converted temperature:");
        outputField = new TextField();
        outputField.setEditable(false);
        convertButton = new Button("Convert");
        clearButton = new Button("Clear");

        add(inputLabel);
        add(inputField);
        add(outputLabel);
        add(outputField);
        add(convertButton);
        add(clearButton);

        convertButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == convertButton) {
            
                double inputTemperature = Double.parseDouble(inputField.getText());
                double convertedTemperature;

                
                convertedTemperature = (inputTemperature * 9 / 5) + 32;
                outputField.setText(String.format("%.2f °F", convertedTemperature));
      
        }
        
        else if (event.getSource() == clearButton) {
            
            inputField.setText("");
            outputField.setText("");
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
