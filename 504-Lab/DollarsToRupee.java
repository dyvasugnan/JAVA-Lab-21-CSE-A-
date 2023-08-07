package moulikaLab;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DollarsToRupee extends JFrame implements ActionListener{
	JLabel l1, l2;
	JTextField t1, t2;
	JButton b1, b2, b3;
	DollarsToRupee(){
		Container c = getContentPane();
		c.setLayout(null);
		this.setLayout(null);
		l1 = new JLabel("Input");
		l2 = new JLabel("Output");
		t1 = new JTextField();
		t2 = new JTextField();
		b1 = new JButton("Rupees to Dollars");
		b2 = new JButton("Dollar to Rupees");
		b3 = new JButton("Clear");
		
		l1.setBounds(150, 80, 100, 50);
		t1.setBounds(300, 80, 100, 50);
		l2.setBounds(150, 160, 100, 50);
		t2.setBounds(300, 160, 100, 50);		
		b1.setBounds(150, 250, 200, 50);
		b2.setBounds(150, 340, 200, 50);
		b3.setBounds(150, 430, 200, 50);
		
		c.add(l1);
		c.add(l2);
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
		String str = ae.getActionCommand();
		if(str=="Rupees to Dollars") {
			float a = Float.parseFloat(t1.getText());			
			float c = (a*3)/350;
			t2.setText(String.valueOf(c));
		}
		if(str == "Dollar to Rupees") {
			float a = Float.parseFloat(t1.getText());
			float c = (a*8273)/100;
			t2.setText(String.valueOf(c));
		}
		if(str=="Clear") {
			t1.setText("");
			t2.setText("");
		}
			
	}

	public static void main(String[] args) {
		DollarsToRupee dr = new DollarsToRupee();
		dr.setVisible(true);
		dr.setSize(500, 500);
		dr.setTitle("Money Conversions");
		dr.setBackground(Color.LIGHT_GRAY);
		dr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
