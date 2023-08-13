package javaclass;
import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;
import java.awt.event.*;

public class Fact extends JFrame {
    private JTextField nf;
    private JTextField f;
    public Fact() {
        setTitle("Factorial Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JButton calculateButton = new JButton("Compute");
        nf = new JTextField(20);
        nf.setEditable(false);
        f = new JTextField(20);
        f.setEditable(false);

        calculateButton.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(Fact.this, "Enter a number:");
            if (input != null) {
                try {
                    int n = Integer.parseInt(input);
                    if (n < 0) {
                        throw new IllegalArgumentException("Enter a non-negative integer");
                    }
//timer
                    Timer timer = new Timer(1000, new ActionListener() {
                        int currentNumber = 1;
                        BigInteger currentFactorial = BigInteger.ONE;
                        public void actionPerformed(ActionEvent e) {
                            if (currentNumber <= n) {
                                nf.setText(Integer.toString(currentNumber));
                                currentFactorial = currentFactorial.multiply(BigInteger.valueOf(currentNumber));
                                f.setText(currentFactorial.toString());
                                currentNumber++;
                            } else {
                                ((Timer) e.getSource()).stop();
                                clearFields();
                            }
                        }
                    });

                    timer.start();
           
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Fact.this, "Enter a valid integer.");
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(Fact.this, ex.getMessage());
                }
            }
        });
        
//to organise in a frame
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(calculateButton);

        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new GridLayout(2, 2));
        fieldsPanel.add(new JLabel("Number:"));
        fieldsPanel.add(nf);
        fieldsPanel.add(new JLabel("Factorial:"));
        fieldsPanel.add(f);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(panel, BorderLayout.NORTH);
        contentPane.add(fieldsPanel, BorderLayout.CENTER);
    }
//to clear output after timer
    private void clearFields() {
        nf.setText("");
        f.setText("");
    }
   //main 
    public static void main(String[] args) {
    	 Fact calculator = new Fact();
         calculator.setVisible(true);
    }
}
