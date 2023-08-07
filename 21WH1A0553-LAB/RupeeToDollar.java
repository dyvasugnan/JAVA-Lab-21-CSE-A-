package clss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RupeeToDollar extends JFrame implements ActionListener {
    private JButton convert, clear;
    private JTextField rupeeField, dollarField;

    public RupeeToDollar() {
        this.setLayout(null);

        convert = new JButton("Convert");
        convert.setBounds(100, 180, 100, 50);
        convert.setBackground(Color.GRAY);
        this.add(convert);

        clear = new JButton("Clear");
        clear.setBounds(250, 180, 100, 50);
        clear.setBackground(Color.GRAY);
        this.add(clear);

        rupeeField = new JTextField();
        rupeeField.setBounds(100, 100, 100, 50);
        this.add(rupeeField);

        dollarField = new JTextField();
        dollarField.setBounds(250, 100, 100, 50);
        dollarField.setEditable(false);
        this.add(dollarField);

        JLabel rupeeLabel = new JLabel("INR");
        rupeeLabel.setBounds(205, 110, 30, 30);
        this.add(rupeeLabel);

        JLabel dollarLabel = new JLabel("USD");
        dollarLabel.setBounds(355, 110, 30, 30);
        this.add(dollarLabel);

        convert.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Convert")) {
            try {
                double rupees = Double.parseDouble(rupeeField.getText());
                double conversionRate = 0.014; 
                double dollars = rupees * conversionRate;
                dollarField.setText(String.format("%.2f", dollars));
            } catch (NumberFormatException e) {
                dollarField.setText("Invalid Input");
            }
        }
        if (str.equals("Clear")) {
            rupeeField.setText("");
            dollarField.setText("");
        }
    }

    public static void main(String[] args) {
    	RupeeToDollar converter = new RupeeToDollar();
        converter.setTitle("Currency Converter");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Path\\To\\Your\\Icon.png");
        converter.setIconImage(icon);
        converter.setSize(430, 400);
        converter.setBackground(Color.WHITE);
        converter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        converter.setVisible(true);
    }
}

