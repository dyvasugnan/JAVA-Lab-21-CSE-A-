package javalab;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener {
	
	TextField tf;
	double num1,num2,solution;
	char ch;
	
	public Calculator() {
		setTitle("CALCULATOR");
		setSize(400,400);
		setLayout(new BorderLayout());
		tf = new TextField();
		tf.setEditable(false);
		add(tf,BorderLayout.NORTH);
		
		Panel buttonPanel = new Panel(new GridLayout(4,4));
		String[] buttonLabels = {
				"7", "8", "9", "/",
				"4", "5", "6", "*",
				"1", "2", "3", "-",
				"AC", "0", "=", "+",
		};
		for(String label : buttonLabels) {
			Button button = new Button(label);
			button.addActionListener(this);
			buttonPanel.add(button);
		}
		add(buttonPanel, BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
	public void actionPerformed(ActionEvent ae) {
		  
		  String str = ae.getActionCommand();
		  
		  if(str.equals("+")) {
		   
		   ch = '+';
		   num1 = Integer.parseInt(tf.getText());
		   tf.setText("");
		  }
		  else if(str.equals("-")) {
		   ch = '-';
		   num1 = Integer.parseInt(tf.getText());
		   tf.setText("");
		  }
		  else if(str.equals("*")) {
		   ch = '*';
		   num1 = Integer.parseInt(tf.getText());
		   tf.setText("");
		  }
		  else if(str.equals("/")) {
		   ch = '/';
		   num1 = Integer.parseInt(tf.getText());
		   tf.setText("");
		  }
		  else if(str.equals("=")) {
		   num2 = Integer.parseInt(tf.getText());
		   switch(ch) { 
		    case '+' : solution = num1 + num2;
		     break;
		    case '-' : solution = num1 - num2;
		     break;
		    case '*' : solution = num1 * num2;
		     break;
		    case '/' : solution = num1 / num2;
		     break;
		   }
		   tf.setText(solution + "");
		   solution = 0;
		  }
		  else if(str.equals("AC")) {
		   
		   tf.setText("");
		   num1 = num2 = solution = 0;
		  }
		  else {
		   tf.setText(tf.getText() + str);
		  }
	}
	public static void main(String args[]) {
		  
		  Calculator c = new Calculator();
		  c.setTitle("CALCULATOR");
		  c.setSize(300,300);
		  c.setVisible(true);
	}
}
