package javalab;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Button;
import java.awt.Container;
import java.awt.Label;
import java.awt.TextField;
public class SwingGui extends JFrame implements ActionListener {
	JButton b1,b2;
	JTextField t1,t2;
	JLabel l1,l2;
	SwingGui(){
		Container c =  getContentPane();
		c.setLayout(null);
		b1 = new JButton("Compute");
		b2 = new JButton("Clear");
		l1 = new JLabel("Enter");
		l2 = new JLabel("Output");
		t1 = new JTextField( );
		t2 = new JTextField( );
		l1.setBounds(100, 150, 100, 50);
		t1.setBounds(100, 250, 100, 50);
		l2.setBounds(100,350,100,50);
		t2.setBounds(100,450,100,50);
		b1.setBounds(200,500,100,50);
		b2.setBounds(300,500,100,50);
		this.add(l1);
		this.add(l2);
		this.add(t1);
		this.add(t2);
		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae) {
			String str  = ae.getActionCommand();
			if(str == "Compute") {
				int n = Integer.parseInt(t1.getText());
				int fact = 1;
				for(int i=1;i<=n;i++) {
					fact=fact*i;
				}
				t2.setText(String.valueOf(fact));
			}
			if(str=="Clear") {
				t1.setText("");
				t2.setText("");
			}
		}	
   public static void main(String args[]){
	SwingGui s = new SwingGui();
	    s.setTitle("Fatorial");
	    s.setSize(400,400);
	    s.setVisible(true);
	    s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
	
		
	

