package javaclass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CurrencyC extends JFrame implements ActionListener{
public static void main(String args[]) {
	CurrencyC cc=new CurrencyC();
	cc.setLayout(null);
	cc.setTitle("Currency Converter");
	cc.setSize(400,400);

	cc.getContentPane().setBackground(Color.GRAY);
	cc.setVisible(true);
	cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
//jbutton convert2
JButton b1,b2,b3;
JTextField t1,t2;
JLabel l1,l2;
CurrencyC(){
	//convert2=new JButton("D->R");
	b1=new JButton("R->D");
	b2=new JButton("D->R");
	b3=new JButton("CLEAR");
	
    b2.setBounds(50, 100, 100, 20);
    b1.setBounds(200, 100, 100, 20);
    b3.setBounds(120,150,100,20);
    this.add(b1);
    this.add(b2);
    this.add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    
    t1=new JTextField();
    t2=new JTextField();
    t1.setBounds(50,50,100,20);
    t2.setBounds(200,50,100,20);
    this.add(t1);
    this.add(t2);
    t1.addActionListener(this);
    t2.addActionListener(this);
    
    l1=new JLabel("DOLLAR");
    l2=new JLabel("RUPEE");
    l1.setBounds(50,25,100,20);
    l2.setBounds(200,25,100,20);
    this.add(l1);
    this.add(l2);
}
public void actionPerformed(ActionEvent ae) {
	String s=ae.getActionCommand();
	
	if(s.equals("D->R")) {
		//try {
		double d=Double.parseDouble(t1.getText());
	    double d1=(d/82.74);
	    t2.setText(String.valueOf(d1));
	}
	//}
//	catch(NumberFormatException nfe) {
	//t2.setText("Incorrect input");
	//}
	else if(s.equals("R->D")){
	//try {
	double r=Double.parseDouble(t2.getText());
	double r1=(r*82.74);
	t1.setText(String.valueOf(r1));
	//}
	}
	else if(s.equals("CLEAR")) {
		t1.setText(" ");
		t2.setText(" ");
	}
	//catch(NumberFormatException nfe) {
	//t1.setText("Incorrect Input");

	
}
}
