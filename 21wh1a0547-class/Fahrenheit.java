package java_lab;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Container;
public class Fahrenheit extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JLabel l1,l2;
	JTextField t1,t2;
	Fahrenheit(){
		Container c = getContentPane();
		c.setLayout(null);
		this.setLayout(null);
		b1 = new JButton("Fahrenheit");
		b2 = new JButton("Celsius");
		b3 = new JButton("Clear");
		l1 = new JLabel("Enter");
		l2 = new JLabel("Output");
		t1 = new JTextField();
		t2 = new JTextField();
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
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str =  ae.getActionCommand();
		if(str == "Fahrenheit") {
            float n = Float.parseFloat(t1.getText());
            float Cels;    
            Cels  = ((n-32)*5)/9 ;
			t2.setText(String.valueOf(Cels));
		}
		if(str == "Celsius") {
			float n = Float.parseFloat(t1.getText());
			float Fah;
			Fah = ( (n*9)/5)+32;  
			t2.setText(String.valueOf(Fah));

		}
		if(str == "Clear") {
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String[] args) {
		 Fahrenheit f = new Fahrenheit();
		f.setTitle("Fohrenheit to Celsius");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
