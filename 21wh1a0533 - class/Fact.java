package javaclass;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fact extends JFrame {
	    private JTextField inputField;
	    private JTextArea numbersArea;
	    private JTextArea factorialsArea;
	    private JButton computeButton;
	    private int currentIteration;
	    private Timer timer;

	    public Fact() {
	        setTitle("Factorial Calculator");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        inputField = new JTextField(10);

	        JPanel topPanel = new JPanel();
	        topPanel.add(new JLabel("Enter a number: "));
	        topPanel.add(inputField);
	        add(topPanel, BorderLayout.NORTH);

	        JPanel centerPanel = new JPanel(new GridLayout(2, 1)); 
	        numbersArea = new JTextArea(5, 20);
	        factorialsArea = new JTextArea(5, 20);
	        numbersArea.setEditable(false);
	        factorialsArea.setEditable(false);

	        Font outputFont = new Font("Monospaced", Font.PLAIN, 18);
	        numbersArea.setFont(outputFont);
	        factorialsArea.setFont(outputFont);

	        centerPanel.add(new JLabel("Number"));
	        centerPanel.add(new JScrollPane(numbersArea));
	        centerPanel.add(new JLabel("Factorial"));
	        centerPanel.add(new JScrollPane(factorialsArea));
	        add(centerPanel, BorderLayout.CENTER);

	        computeButton = new JButton("Compute");
	        computeButton.setEnabled(false);
	        computeButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                computeFactorials();
	            }
	        });

	        JPanel bottomPanel = new JPanel();
	        bottomPanel.add(computeButton);
	        add(bottomPanel, BorderLayout.SOUTH);

	        inputField.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                computeButton.setEnabled(true); 
	            }
	        });

	        pack();
	        setPreferredSize(new Dimension(400, 300)); 
	        setLocationRelativeTo(null);
	    }

	    private void computeFactorials() {
	        final int inputNumber = Integer.parseInt(inputField.getText());
	        currentIteration = 1;
	        timer = new Timer(1000, new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                if (currentIteration <= inputNumber) {
	                    numbersArea.setText(Integer.toString(currentIteration));
	                    int factorial = calculateFactorial(currentIteration);
	                    factorialsArea.setText(Integer.toString(factorial));
	                    currentIteration++;
	                } else {
	                    timer.stop();
	                    numbersArea.setText("");
	                    factorialsArea.setText("");
	                }
	            }
	        });
	        timer.start();
	    }

	    private int calculateFactorial(int n) {
	        int factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new Fact().setVisible(true);
	            }
	        });
	    }
	}