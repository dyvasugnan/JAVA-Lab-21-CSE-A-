import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CurrencyConverter extends JFrame {
    JTextField t1, t2;

    CurrencyConverter() {
        JLabel l1 = new JLabel("Amount");
        JLabel l2 = new JLabel("Converted");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        JPanel p = new JPanel(new GridLayout(4, 2));
        JButton b1 = new JButton("Rupee to Dollar");
        JButton b2 = new JButton("Dollar to Rupee");
        JButton b3 = new JButton("Clear");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double rupees = Double.parseDouble(t1.getText());
                    double dollars = rupees / 74.5;  
                    t2.setText(String.format("%.2f", dollars));
                } catch (NumberFormatException ex) {
                    t2.setText("Invalid input");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dollars = Double.parseDouble(t1.getText());
                    double rupees = dollars * 74.5;  
                    t2.setText(String.format("%.2f", rupees));
                } catch (NumberFormatException ex) {
                    t2.setText("Invalid input");
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });

        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        add(p);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
    }
}
