import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RupeeConv extends JFrame implements ActionListener{
		JButton b1,b2,b3;
		JTextField t1,t2;
		JLabel l1,l2;
		RupeeConv(){
			setLayout(null);
			Container c = getContentPane();
			b1 = new JButton("Rs. to $");
			b2 = new JButton("$ to Rs.");
			b3 = new JButton("Clear");
			t1 = new JTextField();
			t2 = new JTextField();
			l1 = new JLabel("Number");
			l2 = new JLabel("Result");
			t1.setEditable(true);
			t2.setEditable(true);
			b1.setBounds(100,250,100,50);
			b2.setBounds(250,250,100,50);
			b3.setBounds(170,320,100,50);
			t1.setBounds(200,100,100,50);
			t2.setBounds(200,150,100,50);
			l1.setBounds(100,100,100,50);
			l2.setBounds(100,150,110,50);
			c.add(b1);
			c.add(t1);
			c.add(b2);
			c.add(t2);
			c.add(b3);
			c.add(l1);
			c.add(l2);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			t1.addActionListener(this);
			t2.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String s = ae.getActionCommand();
			if(s.equals("Rs. to $")) {
				double num = Double.parseDouble(t1.getText());
				double ans = num/83;				
				t2.setText(ans+"");
			}
			else if(s.equals("$ to Rs.")){
				double num = Double.parseDouble(t1.getText());
				double ans =num*83;
				t2.setText(ans+"");
			}
			else if(s.equals("Clear")) {
				t1.setText("");
				t2.setText("");
			}
		}
		public static void main(String args[]) {
			RupeeConv d = new RupeeConv();
			d.setTitle("Money Conversion");
			d.setVisible(true);
			d.setSize(600,600);
			d.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
}
