package labprograms;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class NFactorial extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField inputNumber, currentFactorial;
    JTextField resultText;

    JLabel l1, l2, l3;
    Timer updateTimer;
    int currentNumber;
    
    NFactorial() {
        this.setLayout(null);
        b1 = new JButton("Compute");
        b2 = new JButton("Clear");
        l1 = new JLabel("Enter Number");
        l2 = new JLabel("Current Factorial");
        l3 = new JLabel("N");
        inputNumber  = new JTextField();
        currentFactorial = new JTextField();
        resultText = new JTextField();
        Container c = getContentPane();
        l1.setBounds(100, 150, 120, 20);
        l2.setBounds(100, 220, 120, 20);
        l3.setBounds(100, 165 , 100, 50);
        inputNumber.setBounds(220, 150, 100, 20);
        currentFactorial.setBounds(220, 220, 100, 20);
        resultText.setBounds(220, 180, 100, 20);
        b1.setBounds(150, 300, 100, 50);
        b2.setBounds(280, 300, 100, 50);
        
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(inputNumber);
        this.add(currentFactorial);
        this.add(resultText);
        this.add(b1);
        this.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        updateTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResults();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Compute")) {
            try {
                currentNumber = 1;
                resultText.setText("");
                int a = Integer.parseInt(inputNumber.getText());
                if (a >= 1) {
                    updateTimer.start();
                }
            } catch (NumberFormatException ex) {
                resultText.setText("Invalid input");
            }
        } else if (str.equals("Clear")) {
            inputNumber.setText("");
            currentFactorial.setText("");
            resultText.setText("");
            updateTimer.stop();
        }
    }
    
    private void updateResults() {
        if (currentNumber <= Integer.parseInt(inputNumber.getText())) {
            long fact = 1;
            for (int i = 2; i <= currentNumber; i++) {
                fact *= i;
            }
            
            currentFactorial.setText(Long.toString(fact));
            resultText.setText(String.valueOf(currentNumber));
            currentNumber++;
        } else {
            updateTimer.stop();
        }
    }

    public static void main(String args[]) {
        NFactorial f = new NFactorial();
        f.setTitle("Factorial");
        f.setSize(400, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}