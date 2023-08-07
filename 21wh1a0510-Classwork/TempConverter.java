import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConverter extends JFrame {
    private JTextField c, f;

    public TempConverter() {
        setTitle("Temp Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel cLabel = new JLabel("Celsius:");
        c = new JTextField(10);

        JLabel fLabel = new JLabel("Fahrenheit:");
        f = new JTextField(10);

        JButton cToFButton = new JButton("C to F");
        cToFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(c.getText());
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    f.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input for Celsius temperature.");
                }
            }
        });

        JButton fToCButton = new JButton("F to C");
        fToCButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(f.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    c.setText(String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input for Fahrenheit temperature.");
                }
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                c.setText("");
                f.setText("");
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.add(cLabel);
        panel.add(c);
        panel.add(fLabel);
        panel.add(f);
        panel.add(cToFButton);
        panel.add(fToCButton);
        panel.add(clearButton);

        getContentPane().add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TempConverter();
    }
}
