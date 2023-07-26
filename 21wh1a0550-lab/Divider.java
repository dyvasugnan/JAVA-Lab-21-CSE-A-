package javalab;

import java.awt.*;
import java.awt.event.*;

public class Divider extends Frame implements ActionListener {
		Button b1,b2;
		TextField n1,n2,res;
		Label num1,num2,result;
		Divider(){
			this.setLayout(null);
			b1 = new Button("Divide");
			b2 = new Button("Clear");
			num1 = new Label("Number 1");
			num2 = new Label("Number 2");
			result = new Label("Result");
			n1 = new TextField();
			n2 = new TextField();
			res = new TextField();
			num1.setBounds(100,150,100,50);
			n1.setBounds(200,150,100,50);
			num2.setBounds(100,250,100,50);
			n2.setBounds(200,250,100,50);
			result.setBounds(100,350,100,50);
			res.setBounds(100,350,100,50);
			b1.setBounds(95,450,100,50);
			b2.setBounds(205,450,100,50);
			this.add(num1);
			this.add(num2);
			this.add(result);
			this.add(n1);
			this.add(n2);
			this.add(res);
			this.add(b1);
			this.add(b2);
			n1.addActionListener(this);
			n2.addActionListener(this);
			res.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "Divide"){
				try {
					int a = Integer.parseInt(n1.getText());
					int b = Integer.parseInt(n2.getText());
					int c = a+b ;
					res.setText(String.valueOf(c));
				}
				catch(NumberFormatException e) {
					res.setText("input");
				}
				catch(ArithmeticException arex) {
					res.setText("Division by Zero");
				}
			}
			else if(str == "clear");
				n1.setText("");
				n2.setText("");
				res.setText("");
			}
			public static void main(String args[]) {
				Divider f = new Divider();
				f.setTitle("DIVIDER");
				f.setSize(400, 400);
				f.setVisible(true);
				f.addWindowListener(new WindowAdapter() {
					public void WindowClosing(WindowEvent we) {
						System.exit(0);
					}
				});
			}
	}
				
