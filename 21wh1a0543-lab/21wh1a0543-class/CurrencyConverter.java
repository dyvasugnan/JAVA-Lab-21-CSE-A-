package classnotes_programs;

import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends Frame implements ActionListener {
     Label rupeesLabel, dollarsLabel;
     TextField rupeesField, dollarsField;
     Button convertButton, clearButton;

    private static final double EXCHANGE_RATE = 0.014; // 1 INR = 0.014 USD

    public CurrencyConverter() {
        
        setTitle("Currency Converter");
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        
        rupeesLabel = new Label("Enter amount in INR:");
        rupeesField = new TextField();
        dollarsLabel = new Label("Equivalent amount in USD:");
        dollarsField = new TextField();
        dollarsField.setEditable(false);
        convertButton = new Button("Convert");
        clearButton = new Button("Clear");

        
        add(rupeesLabel);
        add(rupeesField);
        add(dollarsLabel);
        add(dollarsField);
        add(convertButton);
        add(clearButton);

        
        convertButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == convertButton) {
            
                double rupees = Double.parseDouble(rupeesField.getText());
                double dollars = rupees * EXCHANGE_RATE;
                dollarsField.setText(String.format("%.2f USD", dollars));
            
        } 
        else if (event.getSource() == clearButton) {
           
            rupeesField.setText("");
            dollarsField.setText("");
        }
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
