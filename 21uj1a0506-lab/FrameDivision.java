package javalab;
import java.awt.*;

import java.awt.event.*;

public class FrameDivision extends Frame implements ActionListener {
	Button b1,b2;
	TextField n1,res;
	Label num1,result;
	FrameDivision(){
		this.setLayout(null);
		b1 = new Button("compute");
		b2=new Button("Clear");
		num1 = new Label("Number 1");
		result = new Label("Factorial");
		n1 = new TextField();
		res = new TextField();
		num1.setBounds(100, 150, 100, 50);
		n1.setBounds(200, 150, 100, 50);
		
		
		result.setBounds(100, 350, 100, 50);
		res.setBounds(200, 350, 100, 50);
		b1.setBounds(150, 450, 100, 50);
		b2.setBounds(350,450,100,50);
		this.add(b1);
		this.add(b2);
		this.add(num1);
		this.add(result);
		this.add(n1);
		this.add(res);
		b1.addActionListener(this);
		b2.addActionListener(this);
		n1.addActionListener(this);
		res.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		int i,fact = 1;
		int number = 5;
		for( i=1;i<=number;i++) {
			fact = fact * i;
			
		}
		if(str=="Clear") {
			n1.setText("");
			res.setText("");
			
			
		}
			
		}
	

public static void main(String[] args) {
	FrameDivision f = new FrameDivision();
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


