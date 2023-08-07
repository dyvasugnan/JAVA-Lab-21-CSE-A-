package javalab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DollarToRuppee extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	JTextField t1,t2;
	Container c;

	DollarToRuppee() {
		// TODO Auto-generated constructor stub
		c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(null);
		t1= new JTextField();
		t2=new JTextField();
		b1=new JButton("$->R");
		b2=new JButton("R->$");
		b3=new JButton("clear");
		
		t1.setBounds(100,100,100,50);
		t2.setBounds(200,100,100,50);
		b1.setBounds(100,200,100,50);
		b2.setBounds(200,200,100,50);
		b3.setBounds(150,300,100,50);
		
		
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
		String s=ae.getActionCommand();
		if(s=="$->R") {
			String s1=t1.getText();
			int n=Integer.parseInt(s1);
			int res=83*n;
			t2.setText(String.valueOf(res));
			c.setBackground(Color.green);
			
			}
		if(s=="R->$") {
			String s1=t1.getText();
			int n=Integer.parseInt(s1);
			int res=(n/83);
			t2.setText(String.valueOf(res));
			c.setBackground(Color.pink);
			
		}
		if(s=="clear") {
			t1.setText(" ");
			t2.setText(" ");
			c.setBackground(Color.lightGray);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DollarToRuppee f= new DollarToRuppee ();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
