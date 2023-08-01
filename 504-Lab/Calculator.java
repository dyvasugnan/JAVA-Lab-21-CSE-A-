package moulikaLab;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
	TextField one;
	Label l1;
	Panel p;
	
	Calculator(){
		
		one = new TextField();
		one.setPreferredSize(new Dimension(150, 80));
		
		p= new Panel();
		p.setLayout(new GridLayout(4,4));
		this.setBackground(Color.LIGHT_GRAY);
		p.setPreferredSize(new Dimension(300, 300));
		l1 = new Label("You can do any basic arithmetic operations");
		this.add(l1, BorderLayout.SOUTH);
		Font font = new Font("Arial", Font.PLAIN, 22); 
        l1.setFont(font);
		this.add(one, BorderLayout.BEFORE_FIRST_LINE);
	
		b1 = new Button("7");
		b2 = new Button("8");
		b3 = new Button("9");
		b4 = new Button("+");
		b5 = new Button("4");
		b6 = new Button("5");
		b7 = new Button("6");
		b8 = new Button("-");
		b9 = new Button("3");
		b10 = new Button("2");
		b11 = new Button("1");
		b12 = new Button("*");
		b13 = new Button("0");
		b14 = new Button("CLR");
		b15 = new Button("=");
		b16 = new Button("/");
		
	
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		this.add(p, BorderLayout.CENTER);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		
		Panel centerPanel = new Panel(new GridBagLayout());
        centerPanel.add(p);
        
        this.add(centerPanel, BorderLayout.CENTER);
        
        
        
	} 
	
	
	public void actionPerformed(ActionEvent ae) {
	    String str = ae.getActionCommand();

	    if (str.matches("[0-9.]") || str.matches("[+\\-*/]")) {
	        
	        one.setText(one.getText().concat(str));
	        
	    } 
	    if (str.equals("CLR")) {
	        
	        one.setText(" ");
	    }
	    else if (str.equals("=")) {
	        
	        try {
	            String expression = one.getText();
	            double result = evaluateExpression(expression);
	            one.setText(String.valueOf(result));
	        } catch (ArithmeticException e) {
	            one.setText("Error: Division by zero");
	        } catch (NumberFormatException e) {
	            one.setText("Error: Invalid expression");
	        }
	    }
	    
	}

	private double evaluateExpression(String expression) {
	    try {
	        char operator = ' ';
	        double result = 0.0;
	        int operatorIndex = -1;

	        if (expression.contains("+")) {
	            operator = '+';
	            operatorIndex = expression.indexOf("+");
	        } else if (expression.contains("-")) {
	            operator = '-';
	            operatorIndex = expression.indexOf("-");
	        } else if (expression.contains("*")) {
	            operator = '*';
	            operatorIndex = expression.indexOf("*");
	        } else if (expression.contains("/")) {
	            operator = '/';
	            operatorIndex = expression.indexOf("/");
	        } else if (expression.contains("%")) {
	            operator = '%';
	            operatorIndex = expression.indexOf("%");
	        }

	        if (operatorIndex > 0 && operatorIndex < expression.length() - 1) {
	            double operand1 = Double.parseDouble(expression.substring(0, operatorIndex));
	            double operand2 = Double.parseDouble(expression.substring(operatorIndex + 1));

	            switch (operator) {
	                case '+':
	                    result = operand1 + operand2;
	                    break;
	                case '-':
	                    result = operand1 - operand2;
	                    break;
	                case '*':
	                    result = operand1 * operand2;
	                    break;
	                case '/':
	                    if (operand2 == 0) {
	                        throw new ArithmeticException();
	                    }
	                    result = operand1 / operand2;
	                    break;
	                case '%':
	                    result = operand1 % operand2;
	                    break;
	            }
	        }

	        return result;
	    } catch (Exception e) {
	        throw new NumberFormatException("Invalid expression");
	    }
	}

	
	
	public static void main(String [] args) {
		Calculator c = new Calculator();
		c.setVisible(true);
		c.setSize(500, 500);
		c.setTitle("My Calculator");
		c.setBackground(null);
		c.setBackground(Color.DARK_GRAY);
		c.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
				
	}

}
