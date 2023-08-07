package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConvert extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JTextField n,res;
	JLabel num1,num2;
	CurrencyConvert() {
		Container c = new Container(); 
		this.setLayout(null);
		b1 = new JButton("Rupee");
		b2 = new JButton("Dollar");
		b3 = new JButton("Clear");
		num1 = new JLabel("   Number : ");  
		num2 = new JLabel("     Result : ");
		n = new JTextField();
		res = new JTextField();
		num1.setBounds(550, 150, 100, 50);
		n.setBounds(650, 150, 100, 50);
		num2.setBounds(540, 350, 100, 50);
		res.setBounds(640, 350, 150, 50);
		b1.setBounds(520, 250, 100, 50);
		b2.setBounds(650, 250, 100, 50);
		b3.setBounds(780, 250, 100, 50);
		
		this.add(b1);
		this.add(n);
		this.add(res);
		this.add(b2);
		this.add(num1);
		this.add(num2);
		this.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		n.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Dollar") {
			float rup = Float.parseFloat(n.getText());
			double dol = rup*0.012;
			res.setText(String.valueOf(dol));
		}
		if(str == "Rupee") {
			float dol = Float.parseFloat(n.getText());
			double rup =  dol*82.73;
			res.setText(String.valueOf(rup));
		}
		if(str == "Clear") {
			n.setText("");
			res.setText("");
		}
	}
	
	public static void main(String args[]) {
		CurrencyConvert f =new CurrencyConvert();
		f.setTitle("Convert Currency");
		f.setSize(400,400);
		f.setVisible(true);
		f.setBackground(Color.LIGHT_GRAY);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
