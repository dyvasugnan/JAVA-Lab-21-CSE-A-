package javaClass;

import java.awt.*;// abstract window toolkit
import java.awt.event.*;


class FrameDiv extends Frame implements ActionListener {
		Button b1,b2;
		TextField tf1,tf2,tf3;
		Label l1,l2,l3;
		FrameDiv(){
			this.setLayout(null);
			b1 = new Button("Div");
			b2 = new Button("CLEAR");

			l1 = new Label("Number 1");
			l2 = new Label("Number 2");
			l3 = new Label("Result");
		tf1 = new TextField();
			tf2 = new TextField();
			tf3 = new TextField();
			l1.setBounds(100, 150, 100, 50);
			tf1.setBounds(200,150,250,50);
			
			l2.setBounds(100,250,100,50);
			tf2.setBounds(200, 250, 250, 50);
			
			l3.setBounds(100, 350, 100, 50);
			tf3.setBounds(200, 350, 250, 50);
			
			b1.setBounds(100,450,80,50);
			b2.setBounds(200,450,80,50);
			
			this.setBackground(Color.pink);
			
			this.add(b1);
			this.add(b2);
			this.add(l1);
			this.add(l2);
			this.add(l3);
			this.add(tf1);
			this.add(tf2);
			this.add(tf3);
		
			b1.addActionListener(this);
			b2.addActionListener(this);
			tf1.addActionListener(this);
			tf2.addActionListener(this);
			tf3.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			 if(str == "Div"){
				try{
					int a = Integer.parseInt(tf1.getText());
					int b = Integer.parseInt(tf2.getText());
					if(b ==0) {
						tf3.setText("Cannot divide by Zero!");
					}else {
						int c= a/b;
						tf3.setText(String.valueOf(c));
					}
				}catch(NumberFormatException ex) {
					tf3.setText("Invaild input!");
				}catch(ArithmeticException ex) {
					tf3.setText("Divide by zero error!");
				}
					}
	 if(str == "CLEAR"){
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
	public static void main(String[] args) {
		FrameDiv f = new FrameDiv();
		f.setTitle(" MyCalculator");
		f.setSize(400, 400);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}