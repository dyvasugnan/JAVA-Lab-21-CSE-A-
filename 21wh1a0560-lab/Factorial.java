package javaclass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Factorial extends JFrame implements ActionListener {
	Container c;
	JLabel num,fact;
	JButton com,clr;
	JTextField n,f;
	public Factorial() {
		c = getContentPane();
		this.setLayout(null);
		num = new JLabel(" Number  ");
		fact = new JLabel("Factorial  ");
		com = new JButton("Compute");
		clr = new JButton("Clear");
		n = new JTextField();
		f = new JTextField();
		
		num.setBounds(60,60,80,40);
		n.setBounds(180,60,80,40);
		fact.setBounds(60,130,80,40);
		f.setBounds(180,130,80,40);
		com.setBounds(60,200,80,40);
		clr.setBounds(180,200,80,40);
		
		c.add(com);
		c.add(clr);
		c.add(f);
		c.add(fact);
		c.add(n);
		c.add(num);
		
		com.addActionListener(this);
		clr.addActionListener(this);
		n.addActionListener(this);
		f.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Compute") {
			int numb = Integer.parseInt(n.getText());
			int fact = 1;
			for(int i=2;i<=numb;i++) {
				fact *= i;
			}
			f.setText(String.valueOf(fact));
		}
		if(str == "Clear") {
			f.setText(" ");
			n.setText(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial ft = new Factorial();
		ft.setSize(300,300);
		ft.setVisible(true);
		ft.setTitle("FACTORIAL");
		ft.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
