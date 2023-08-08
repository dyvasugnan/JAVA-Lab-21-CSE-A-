import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends Frame implements ActionListener {
    Label amountLabel, resultLabel;
    TextField amountField, resultField;
    Button toDollarButton, toRupeeButton, clearButton;

    CurrencyConverter() {
        this.setLayout(null);

        amountLabel = new Label("Amount:");
        resultLabel = new Label("Converted Amount:");

        amountField = new TextField();
        resultField = new TextField();

        toDollarButton = new Button("INR to USD");
        toRupeeButton = new Button("USD to INR");
        clearButton = new Button("Clear");

        amountLabel.setBounds(50, 50, 100, 30);
        amountField.setBounds(150, 50, 100, 30);

        toDollarButton.setBounds(100, 100, 100, 30);
        toRupeeButton.setBounds(250, 100, 100, 30);

        resultLabel.setBounds(50, 150, 150, 30);
        resultField.setBounds(200, 150, 100, 30);

        clearButton.setBounds(150, 200, 100, 30);

        this.add(amountLabel);
        this.add(amountField);
        this.add(toDollarButton);
        this.add(toRupeeButton);
        this.add(resultLabel);
        this.add(resultField);
        this.add(clearButton);

        toDollarButton.addActionListener(this);
        toRupeeButton.addActionListener(this);
        clearButton.addActionListener(this);

        this.setTitle("Currency Converter");
        this.setSize(400, 300);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if (action.equals("INR to USD")) {
            double inrAmount = Double.parseDouble(amountField.getText());
            double usdAmount = inrAmount / 74.0; // Assuming 1 USD = 74 INR
            resultField.setText(String.format("%.2f", usdAmount));
        } else if (action.equals("USD to INR")) {
            double usdAmount = Double.parseDouble(amountField.getText());
            double inrAmount = usdAmount * 74.0; // Assuming 1 USD = 74 INR
            resultField.setText(String.format("%.2f", inrAmount));
        } else if (action.equals("Clear")) {
            amountField.setText("");
            resultField.setText("");
        }
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
