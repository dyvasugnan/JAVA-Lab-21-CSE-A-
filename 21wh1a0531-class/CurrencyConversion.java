package javaclass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CurrencyConversion extends JFrame implements ActionListener{
	JButton convert, clear;
	JTextField t1, t2;
	JLabel l1, l2;
	JComboBox comboBox1;
	CurrencyConversion(){
		this.setLayout(null);
		convert = new JButton("Convert");
		convert.setBounds(100,240,100,50);
		convert.setBackground(Color.green);
		this.add(convert);
		clear = new JButton("Clear");
        clear.setBounds(260, 240, 100, 50);
        clear.setBackground(Color.red);
        this.add(clear);
        t1 = new JTextField();
        t1.setBounds(90, 100, 120, 50);
        this.add(t1);
        t2 = new JTextField();
        t2.setBounds(250, 100, 120, 50);
        this.add(t2);
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
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {	
		String temp = (String) comboBox1.getSelectedItem();
        String str = ae.getActionCommand();
        if (temp.equals("Dollar to Rupee") && str.equals("Convert")){
        	try {
        	double d = Double.parseDouble(t1.getText());
            double r = (double)(d*82.74);
            t2.setText(String.valueOf(r));
        	}
        	catch(NumberFormatException nfe){
				t2.setText("Wrong Input");
			}
        }
        else if(temp.equals("Indian to Dollar") && str.equals("Convert")){
        	try {
        		double r = Double.parseDouble(t2.getText());
                double d = (double)(r/82.74);
                t1.setText(String.valueOf(d));
        	}
        	catch(NumberFormatException nfe){
				t1.setText("Wrong Input");
			}
        }
        else if (str.equals("Clear")) {
            t1.setText(" ");
            t2.setText(" ");
        }
    }
	public static void main(String[] args) {
		CurrencyConversion c = new CurrencyConversion();
		c.setTitle("Currency converter");
        c.setSize(460, 430);
        c.getContentPane().setBackground(Color.black);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
