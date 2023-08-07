package java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Currencyconv extends JFrame implements ActionListener{
	JButton convert, clear;
	JTextField n1, n2;
	JLabel l1, l2;
	JComboBox comboBox1;
	Currencyconv(){
		this.setLayout(null);
		
		convert = new JButton("Convert");
		convert.setBounds(100,240,100,50);
		convert.setBackground(Color.green);
		this.add(convert);
		
		clear = new JButton("Clear");
        clear.setBounds(260, 240, 100, 50);
        clear.setBackground(Color.red);
        this.add(clear);
        
        n1 = new JTextField();
        n1.setBounds(90, 100, 120, 50);
        this.add(n1);
        
        n2 = new JTextField();
        n2.setBounds(250, 100, 120, 50);
        this.add(n2);
        
        l1 = new JLabel("Dollar");
        l1.setBounds(120, 140, 100, 50);
        this.add(l1);
        
        l2 = new JLabel("Rupee");
        l2.setBounds(280, 140, 100, 50);
        this.add(l2);
        
        String s1[] = {"US Dollar to Indian Rupee", "Indian Rupee to US Dollar"};
        comboBox1 = new JComboBox(s1);
        comboBox1.setBounds(150,20,180,20);
        this.add(comboBox1);
        
        convert.addActionListener(this);
		clear.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
        
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String temp = (String) comboBox1.getSelectedItem();
        String str = ae.getActionCommand();
        if (temp.equals("Dollar to Rupee") && str.equals("Convert")){
        	try {
        	double d = Double.parseDouble(n1.getText());
            double r = (double)(d*82.74);
            n2.setText(String.valueOf(r));
        	}
        	catch(NumberFormatException nfe){
				n2.setText("Wrong Input");
			}
        }
        else if(temp.equals("Indian to Dollar") && str.equals("Convert")){
        	try {
        		double r = Double.parseDouble(n2.getText());
                double d = (double)(r/82.74);
                n1.setText(String.valueOf(d));
        	}
        	catch(NumberFormatException nfe){
				n1.setText("Wrong Input");
			}
        }
        else if (str.equals("Clear")) {
            n1.setText(" ");
            n2.setText(" ");
        }
    }
	public static void main(String[] args) {
		Currencyconv f = new Currencyconv();
		f.setTitle("Currency converter");
        f.setSize(460, 430);
        f.getContentPane().setBackground(Color.pink);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
