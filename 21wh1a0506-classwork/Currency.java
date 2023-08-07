package javaclass;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Currency extends JFrame implements ActionListener{
	JButton convert, clr;
	JTextField t1, t2;
	JLabel l1, l2;
	JComboBox comboBox1;
	Currency(){
		this.setLayout(null);
		
		convert = new JButton("Convert");
		convert.setBounds(100,240,100,50);
		convert.setBackground(Color.CYAN);
		this.add(convert);
		
		clr = new JButton("Clear");
        clr.setBounds(260, 240, 100, 50);
        clr.setBackground(Color.CYAN);
        this.add(clr);
        
        t1 = new JTextField();
        t1.setBounds(90, 100, 120, 50);
        this.add(t1);
        
        t2 = new JTextField();
        t2.setBounds(250, 100, 120, 50);
        this.add(t2);
        
        l1 = new JLabel("US Dollar");
        l1.setBounds(120, 140, 100, 50);
        this.add(l1);
        
        l2 = new JLabel("Indian Rupee");
        l2.setBounds(280, 140, 100, 50);
        this.add(l2);
        
        String s1[] = {"US Dollar to Indian Rupee", "Indian Rupee to US Dollar"};
        comboBox1 = new JComboBox(s1);
        comboBox1.setBounds(150,20,180,20);
        this.add(comboBox1);
        
        convert.addActionListener(this);
		clr.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
        
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String temp = (String) comboBox1.getSelectedItem();
        String str = ae.getActionCommand();
        if (temp.equals("US Dollar to Indian Rupee") && str.equals("Convert")){
        	try {
        	double d = Double.parseDouble(t1.getText());
            double r = (double)(d*82.74);
            t2.setText(String.valueOf(r));
        	}
        	catch(NumberFormatException nfe){
				t2.setText("Incorrect Input type");
			}
        }
        else if(temp.equals("Indian Rupee to US Dollar") && str.equals("Convert")){
        	try {
        		double r = Double.parseDouble(t2.getText());
                double d = (double)(r/82.74);
                t1.setText(String.valueOf(d));
        	}
        	catch(NumberFormatException nfe){
				t1.setText("Incorrect Input type");
			}
        }
        else if (str.equals("Clear")) {
            t1.setText("");
            t2.setText("");
        }
    }
	public static void main(String[] args) {
		Currency f = new Currency();
		f.setTitle("Currency converter");
        //Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\vnave\\OneDrive\\Desktop\\calc.png");
        //f.setIconImage(icon);
        f.setSize(460, 430);
        f.getContentPane().setBackground(Color.GRAY);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

