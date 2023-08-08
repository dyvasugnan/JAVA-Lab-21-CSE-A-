import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Temp extends JFrame {
    JTextField t1, t2;

    Temp() {
        JLabel l1 = new JLabel("Temperature");
        JLabel l2 = new JLabel("Converted");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        JPanel p = new JPanel(new GridLayout(4, 2));
        JButton b1 = new JButton("C to F");
        JButton b2 = new JButton("F to C");
        JButton b3 = new JButton("Clear");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(t1.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    t2.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    t2.setText("Invalid input");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(t1.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    t2.setText(String.format("%.2f", celsius));
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
        Temp converter = new Temp();
    }
}
