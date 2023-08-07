package javalab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class CelsiusToFahrenheit extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	JLabel l1,l2;
	JTextField t1,t2;
	Container c;
	

	CelsiusToFahrenheit() {
		// TODO Auto-generated constructor stub
		 c= getContentPane();
		c.setBackground(Color.PINK);
		c.setLayout(null);
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("CtoF");
		b2= new JButton("FtoC");
		b3=new JButton("clear");
		
		t1.setBounds(100, 100, 100, 50);
		t2.setBounds(200, 100, 100, 50);
		b1.setBounds(100, 200, 100, 50);
		b2.setBounds(200, 200, 100, 50);
		b3.setBounds(150, 300, 100, 50);
		
		c.add(t1);
		c.add(t2);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="CtoF") {
			String s1=t1.getText();
			int n=Integer.parseInt(s1);
			int res=(n*(9/5))+32;
			t2.setText(String.valueOf(res));
			c.setBackground(Color.CYAN);
		}
		if(str=="FtoC") {
			String s2=t1.getText();
			int n=Integer.parseInt(s2);
			int res=(5/9)*(n-32);
			t2.setText(String.valueOf(res));
			c.setBackground(Color.yellow);
		}
		if(str=="clear") {
			t1.setText(" ");
			t2.setText(" ");
			c.setBackground(Color.magenta);
			
		}

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CelsiusToFahrenheit f=new CelsiusToFahrenheit();
		f.setSize(400,400);
		f.setVisible(true);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
