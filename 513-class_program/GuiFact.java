package javalab;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GuiFact extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField t1,t2;
	GuiFact(){
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.black);
		b1 = new JButton("Comp");
		b2 = new JButton("ClearAll");
		t1 = new JTextField();
		t2 = new JTextField();
		
		b1.setBounds(60,150,100,30);
		b2.setBounds(300,150,100,30);
		t1.setBounds(60,300,60,30);
		t2.setBounds(300,300,60,30);
		
		c.add(b1);
		c.add(b2);
		c.add(t1);
		c.add(t2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = e.getActionCommand();
		if(str == "Comp") {
			int a = Integer.parseInt(t1.getText());
			int fact=1;
			for(int i=1;i<=a;i++) {
				fact*=i;
			}
			t2.setText(String.valueOf(fact));
		}else if(str == "ClearAll"){ 
			t1.setText("");
			t2.setText("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiFact g = new GuiFact();
		g.setTitle("Factorial");
		g.setSize(500,400);
		g.setVisible(true);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
