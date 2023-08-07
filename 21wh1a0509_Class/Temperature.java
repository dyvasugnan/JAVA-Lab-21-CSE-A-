package java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Temperature extends JFrame implements ActionListener{
	JButton convert, clr;
	JTextField n1, n2;
	JLabel l1, l2;
	//@SuppressWarnings("rawtypes")
	JComboBox box1;
	//@SuppressWarnings({ "unchecked", "rawtypes" })
	Temperature(){
		this.setLayout(null);
		convert = new JButton("Convert");
		convert.setBounds(100,240,100,50);
		convert.setBackground(Color.green);
		this.add(convert);
		
		clr = new JButton("Clear");
        clr.setBounds(260, 240, 100, 50);
        clr.setBackground(Color.red);
        this.add(clr);
        
        n1 = new JTextField();
        n1.setBounds(90, 100, 120, 50);
        this.add(n1);
        
        n2 = new JTextField();
        n2.setBounds(250, 100, 120, 50);
        this.add(n2);
        
        l1 = new JLabel("Celsius");
        l1.setBounds(130, 140, 100, 50);
        this.add(l1);
        
        l2 = new JLabel("Fahrenheit");
        l2.setBounds(280, 140, 100, 50);
        this.add(l2);
        
        String s1[] = {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
        box1 = new JComboBox(s1);
        box1.setBounds(150,20,150,20);
        this.add(box1);
        
        convert.addActionListener(this);
		clr.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
        
	}
	
	public void actionPerformed(ActionEvent ae) {
		String temp = (String) box1.getSelectedItem();
        String str = ae.getActionCommand();
        if (temp.equals("Celsius to Fahrenheit") && str.equals("Convert")){
        	try {
        	double c = Double.parseDouble(n1.getText());
            double f = (double)(c*1.8+32);
            n2.setText(String.valueOf(f));
        	}
        	catch(NumberFormatException nfe){
				n2.setText("Wrong Input");
			}
        }
        else if(temp.equals("Fahrenheit to Celsius") && str.equals("Convert")){
        	try {
        		double f = Double.parseDouble(n2.getText());
                double c = (double)((f - 32)*5/9);
                n1.setText(String.valueOf(c));
        	}
        	catch(NumberFormatException nfe){
				n1.setText("Incorrect Input type");
			}
        }
        else if (str.equals("Clear")) {
            n1.setText(" ");
            n2.setText(" ");
        }
    }
	public static void main(String[] args) {
		Temperature f = new Temperature();
        f.setSize(460, 430);
        f.getContentPane().setBackground(Color.pink);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
