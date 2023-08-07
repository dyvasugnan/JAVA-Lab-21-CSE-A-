package java_lab;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DollarsToRupees extends JFrame implements ActionListener{
		JLabel l1, l2;
		JTextField t1, t2;
		JButton b1, b2, b3;
		DollarsToRupees(){
			Container c = getContentPane();
			c.setLayout(null);
			this.setLayout(null);
			l1 = new JLabel("Input");
			l2 = new JLabel("Output");
			t1 = new JTextField();
			t2 = new JTextField();
			b1 = new JButton("Dollars");
			b2 = new JButton("Rupees");
			b3 = new JButton("Clear");
			l1.setBounds(150, 50, 100, 50);
			t1.setBounds(300, 50, 100, 50);
			l2.setBounds(150,100,100,50);
			t2.setBounds(300,100,100,50);
			b1.setBounds(160,250,100,50);
			b2.setBounds(160,350,100,50);
			b3.setBounds(160,450,100,50);
	
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
			if(str=="Dollars") {
				float a = Float.parseFloat(t1.getText());			
				float c = (a*3)/350;
				t2.setText(String.valueOf(c));
			}
			if(str == "Rupees") {
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
			DollarsToRupees d = new DollarsToRupees();
			d.setVisible(true);
			d.setSize(500, 500);
			d.setTitle("Money Conversions");
			d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}

