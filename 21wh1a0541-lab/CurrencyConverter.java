package javaprograms;

import java.awt.*;
import java.awt.event.*;
public class  CurrencyConverter extends  Frame implements ActionListener{
		Button b1,b2;
		TextField tf1,tf2;
		Label l1,l2;
		CurrencyConverter(){
        	this.setLayout(null);
        	b1 = new Button("convert");
        	b2 = new Button("clear");
        	l1 = new Label("Indian rupees");
			l2 = new Label("us dollers");
			
        	tf1 = new TextField();
        	tf2 = new TextField();
        	
			tf1.setBounds(100, 150, 150, 50);
			tf2.setBounds(100, 250, 150, 50);
			
			b1.setBounds(150, 450, 100, 50);
			b2.setBounds(250,450,100,50);
			
			l1.setBounds(30,150,100,50);
			l2.setBounds(18,250,100,50);
				
			this.add(b2);
			this.add(b1);
			this.add(tf1);
			this.add(tf2);
			this.add(l1);
			this.add(l2);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			tf1.addActionListener(this);
			tf2.addActionListener(this);	
        }
		
public void actionPerformed(ActionEvent ae) {
	String str = ae.getActionCommand();
	try {
		double amount = Double.parseDouble(tf1.getText());
        double result;
        if(str == "convertor") {
            result = amount * 82;
        } 
        else { 
            result = amount / 82;
        }
        tf2.setText(String.valueOf(result));
	}
	catch(NumberFormatException e) {
        tf2.setText("Invalid input");
    }
	 if (str == "clear") {
		tf1.setText("");
		tf2.setText("");
	}
}
	public static void main(String[] args) {
		CurrencyConverter c = new CurrencyConverter();
		c.setTitle("Currency Converter");
		c.setSize(400, 400);
		c.setBackground(Color.PINK);
		c.setVisible(true);
		c.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}