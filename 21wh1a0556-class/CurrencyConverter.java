import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField tf1, tf2;
    JLabel l1, l2;
    JComboBox<String> Box;

   CurrencyConverter() {
        this.setTitle("Currency Converter");
        this.setSize(450,350);
        this.setLayout(null);

        l1 = new JLabel("Enter Amount");
        l1.setBounds(100, 50, 150, 30);
        tf1 = new JTextField();
        tf1.setBounds(250, 50, 150, 30);
        l2 = new JLabel("Result:");
        l2.setBounds(100, 150, 100, 30);
        tf2 = new JTextField();
        tf2.setBounds(200, 150, 100, 30);
        b1 = new JButton("Convert");
        b1.setBounds(100, 200, 100, 30);
        b1.setBackground(Color.gray);
        b2 = new JButton("Clear");
        b2.setBounds(200, 200, 100, 30);
        b2.setBackground(Color.gray);
   
        String[] s = {"USD to INR", "INR to USD"};
        Box = new JComboBox<>(s);
        Box.setBounds(100, 100, 200, 30);
        this.add(Box);
        
        this.add(l1);
        this.add(tf1);
        this.add(l2);
        this.add(tf2);
        this.add(b1);
        this.add(b2);

        tf1.addActionListener(this);      
        tf2.addActionListener(this);
        b1.addActionListener(this);      
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                double amount = Double.parseDouble(tf1.getText());
                String select = (String) Box.getSelectedItem();
                double convert;

                if (select.equals("USD to INR")) {
                    convert = usdToInr(amount);
                    tf2.setText(String.format("%.2f INR", convert));
                } else if (select.equals("INR to USD")) {
                    convert = inrTousd(amount);
                    tf2.setText(String.format("%.3f USD", convert));
                }
            } catch (NumberFormatException ex) {
                tf2.setText("Invalid input.");
            }
        } else if (ae.getSource() == b2) {
            tf1.setText("");
            tf2.setText("");
        }
    }

    double usdToInr(double usd) {
        return usd * 82.78;
    }

    double inrTousd(double inr) {
        return inr * 0.012;
    }

    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
