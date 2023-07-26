package jwindowexample;


import java.awt.event.*;
import java.awt.*;


public class FrameClass extends Frame implements ActionListener {
		Button b1;
		Button clearButton;
		Button divButton;
		TextField n1,n2,res;
		Label num1,num2,result, noDivByZeroErrorMessageLabel;
		FrameClass(){
			this.setLayout(null);
			this.setBackground(Color.ORANGE);
			b1 = new Button("Add");
			clearButton = new Button("Clear");
			divButton = new Button("Div");
			num1 = new Label("Number 1");
			num2 = new Label("Number 2");
			result = new Label("Result");
			n1 = new TextField();
			n2 = new TextField();
			noDivByZeroErrorMessageLabel = new Label("Zero should not enter as div by zero is not possible");
			res = new TextField();
			num1.setBounds(100, 150, 100, 50);
			
			n1.setBounds(200, 150, 100, 50);
			
			num2.setBounds(100, 250, 100, 50);
			n2.setBounds(200, 250, 100, 50);
			
			result.setBounds(100, 350, 100, 50);
			noDivByZeroErrorMessageLabel.setBounds(100, 400, 400, 50);
			noDivByZeroErrorMessageLabel.setForeground(Color.RED);
			noDivByZeroErrorMessageLabel.hide();
			res.setBounds(200, 350, 100, 50);
			b1.setBounds(150, 450, 100, 50);
			divButton.setBounds(300, 450, 100, 50);
			clearButton.setBounds(450, 450, 100, 50);// this is to set position of the button
			
			this.add(b1);
			this.add(divButton);
			this.add(clearButton);
			this.add(num1);
			this.add(num2);
			this.add(result);
			this.add(n1);
			this.add(n2);
			this.add(res);
			this.add(noDivByZeroErrorMessageLabel);
			b1.addActionListener(this);
			clearButton.addActionListener(this);
			n1.addActionListener(this);
			n2.addActionListener(this);
			res.addActionListener(this);
			divButton.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "Add") {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a+b ;
				res.setText(String.valueOf(c));
			}
		    if(str == "Clear")
		    {
		    	n1.setText("");
		    	n2.setText("");
		    	res.setText("");
		    }
		    if(str == "Div")
		    {
		    	int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				if(b == 0)
				{
					noDivByZeroErrorMessageLabel.show();
				}
				else
				{
				int c = a/b ;
				res.setText(String.valueOf(c));
				noDivByZeroErrorMessageLabel.hide();
				}
		    }
			}
		
	
	public static void main(String[] args) {
		FrameClass f = new FrameClass();
		f.setTitle("Test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}