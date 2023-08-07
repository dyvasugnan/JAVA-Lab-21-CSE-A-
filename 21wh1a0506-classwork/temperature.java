package javaclass;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temperature extends JFrame implements ActionListener{
	JButton convert, clr;
	JTextField t1, t2;
	JLabel l1, l2;
	JComboBox comboBox1;
	Temperature(){
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
        
        l1 = new JLabel("Celsius");
        l1.setBounds(130, 140, 100, 50);
        this.add(l1);
        
        l2 = new JLabel("Fahrenheit");
        l2.setBounds(280, 140, 100, 50);
        this.add(l2);
        
        String s1[] = {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
        comboBox1 = new JComboBox(s1);
        comboBox1.setBounds(150,20,150,20);
        this.add(comboBox1);
        
        convert.addActionListener(this);
		clr.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
        
	}
	
	public void actionPerformed(ActionEvent ae) {
		//(32°F − 32) × 5/9 = 0°C
		//(0°C × 9/5) + 32 = 32°F
		String temp = (String) comboBox1.getSelectedItem();
        String str = ae.getActionCommand();
        if (temp.equals("Celsius to Fahrenheit") && str.equals("Convert")){
        	try {
        	double c = Double.parseDouble(t1.getText());
            double f = (double)(c*1.8+32);
            t2.setText(String.valueOf(f));
        	}
        	catch(NumberFormatException nfe){
				t2.setText("Incorrect Input type");
			}
        }
        else if(temp.equals("Fahrenheit to Celsius") && str.equals("Convert")){
        	try {
        		double f = Double.parseDouble(t2.getText());
                double c = (double)((f - 32)*5/9);
                t1.setText(String.valueOf(c));
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
		Temperature f = new Temperature();
		f.setTitle("Temperature converter");
        //Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\vnave\\OneDrive\\Desktop\\calc.png");
        //f.setIconImage(icon);
        f.setSize(460, 430);
        f.getContentPane().setBackground(Color.GRAY);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
