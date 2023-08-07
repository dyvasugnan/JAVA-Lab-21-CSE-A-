import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {
    private JTextField usd, inr;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usdLabel = new JLabel("US Dollar:");
        usd = new JTextField(10);

        JLabel inrLabel = new JLabel("Indian Rupee:");
        inr = new JTextField(10);

        JButton usdToInrButton = new JButton("USD to INR");
        usdToInrButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double dollar = Double.parseDouble(usd.getText());
                    double rupee = dollar * 73.5;  
                    inr.setText(String.format("%.2f", rupee));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input for US Dollar.");
                }
            }
        });

        JButton inrToUsdButton = new JButton("INR to USD");
        inrToUsdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double rupee = Double.parseDouble(inr.getText());
                    double dollar = rupee / 73.5;  
                    usd.setText(String.format("%.2f", dollar));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input for Indian Rupee.");
                }
            }
        });

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usd.setText("");
                inr.setText("");
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.add(usdLabel);
        panel.add(usd);
        panel.add(inrLabel);
        panel.add(inr);
        panel.add(usdToInrButton);
        panel.add(inrToUsdButton);
        panel.add(new JLabel());
        panel.add(clearButton);

        getContentPane().add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
