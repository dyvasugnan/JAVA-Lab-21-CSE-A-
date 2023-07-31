import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;
public class FrameClass extends Frame implements ActionListener {
	
	TextField tf;
	double num1,num2,res;
	char oper;
	
	public FrameClass() {
		setTitle("Calculator");
		setSize(400,500);
		setLayout(new BorderLayout());
		tf = new TextField();
		tf.setEditable(false);
		add(tf,BorderLayout.NORTH);
		
		Panel buttonPanel = new Panel(new GridLayout(4,4));
		String[] buttonLabels = {"1", "2", "3", "0","4","5", "6", "-", "7","8", "9", "/",
				"+", "*", "=","C"};
		for(String label : buttonLabels) {
			Button button = new Button(label);
			button.addActionListener(this);
			buttonPanel.add(button);
		}
		add(buttonPanel, BorderLayout.CENTER);
		

        setVisible(true);
    }
	public void actionPerformed(ActionEvent ae) {
		  
		  String str = ae.getActionCommand();
		  
		  if(str.equals("+")) {
		   
		   oper = '+';
		   num1 = Integer.parseInt(tf.getText());
		   tf.setText("+");
		  }
		  else if(str.equals("%")) {
			   
			   oper = '%';
			   num1 = Integer.parseInt(tf.getText());
			   tf.setText("%");
		  }
		  else if(str.equals("-")) {
		   oper = '-';
		   num1 = Integer.parseInt(tf.getText());
		   tf.setText("-");
		  }
		  else if(str.equals("*")) {
		   oper = '*';
		   num1 = Integer.parseInt(tf.getText());
		   tf.setText("*");
		  }
		  else if(str.equals("/")) {
		   oper = '/';
		   num1 = Integer.parseInt(tf.getText());
		   tf.setText("/");
		  }
		  else if(str.equals("=")) {
		   
		   num2 = Integer.parseInt(tf.getText());
		   
		   switch(oper) {
		    
		    case '+' : res = num1 + num2;
		     break;
		    case '-' : res = num1 - num2;
		     break;
		    case '*' : res = num1 * num2;
		     break;
		    /*case '%' : res = num1 % num2;
		    break;*/
		    case '/' : res = num1 / num2;
		     break;
		   }
		   tf.setText(res + "");
		   res = 0;
		  }
		  else if(str.equals("C")) {
		   
		   tf.setText("");
		   num1 = num2 = res = 0;
		  }
		  else {
		   tf.setText(tf.getText() + str);
		  }
	}
	public static void main(String args[]) {
		  
		  FrameClass f = new FrameClass();
		  f.setTitle("CALCULATOR");
		  f.setSize(250,300);
		  f.setVisible(true);
		  f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
	}
}