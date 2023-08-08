package cse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Currency extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	JTextField t1,t2;
	Currency() {
		Container c = getContentPane();
		c.setLayout(null);
		t1= new JTextField();
		t2=new JTextField();
		b1=new JButton("Dollar to Rupee");
		b2=new JButton("Rupee to Dollar");
		b3=new JButton("CLEAR");
		t1.setBounds(100,120,100,50);
		t2.setBounds(250,120,100,50);
		b1.setBounds(100,200,100,50);
		b2.setBounds(240,200,100,50);
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
		if(s=="Dollar to Rupee") {
			int n=Integer.parseInt(t1.getText());
			int res=83*n;
			t2.setText(String.valueOf(res));

			}
		if(s=="Rupee to Dollar") {
			int n=Integer.parseInt(t1.getText());
			int res=(n/83);
			t2.setText(String.valueOf(res));

		}
		if(s=="CLEAR") {
			t1.setText(" ");
			t2.setText(" ");
		}
	}

	public static void main(String[] args) {
		Currency cu= new Currency ();
		cu.setTitle("Currency");
		cu.setSize(450,450);
		cu.setVisible(true);
		cu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}