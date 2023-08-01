package javaclasswork;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
	
	TextField t;
	double firstnum,secondnum,ans;
	char op;
	
	public Calculator() {
		setTitle("CALCULATOR");
		setSize(300,400);
		setLayout(new BorderLayout());
		t = new TextField();
		t.setEditable(false);
		add(t,BorderLayout.NORTH);
		
		Panel buttonPanel = new Panel(new GridLayout(4,4));
		String[] buttonLabels = {
				"7", "8", "9", "/",
				"4", "5", "6", "*",
				"1", "2", "4", "-",
				"0", ".", "=", "+",
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
		   
		   op = '+';
		   firstnum = Integer.parseInt(t.getText());
		   t.setText("");
		  }
		  else if(str.equals("-")) {
		   op = '-';
		   firstnum = Integer.parseInt(t.getText());
		   t.setText("");
		  }
		  else if(str.equals("*")) {
		   op = '*';
		   firstnum = Integer.parseInt(t.getText());
		   t.setText("");
		  }
		  else if(str.equals("/")) {
		   op = '/';
		   firstnum = Integer.parseInt(t.getText());
		   t.setText("");
		  }
		  else if(str.equals("=")) {
		   
		   secondnum = Integer.parseInt(t.getText());
		   
		   switch(op) {
		    
		    case '+' : ans = firstnum + secondnum;
		     break;
		    case '-' : ans = firstnum - secondnum;
		     break;
		    case '*' : ans = firstnum * secondnum;
		     break;
		    case '/' : ans = firstnum / secondnum;
		     break;
		   }
		   t.setText(ans + "");
		   ans = 0;
		  }
		  else if(str.equals("C")) {
		   
		   t.setText("");
		   firstnum = secondnum = ans = 0;
		  }
		  else {
		   t.setText(t.getText() + str);
		  }
	}
	public static void main(String args[]) {
		  
		  Calculator c = new Calculator();
		  c.setTitle("CALCULATOR");
		  c.setSize(250,300);
		  c.setVisible(true);
	}
}