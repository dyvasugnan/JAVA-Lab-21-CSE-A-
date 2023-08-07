package javaclass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TemperatureSwing extends JFrame implements ActionListener{
	JButton b1, b2;
	JTextField t1, t2;
	JLabel l1, l2;
	JComboBox box1;
	TemperatureSwing(){
		this.setLayout(null);
		b1 = new JButton("Convert");
		b1.setBounds(100,240,100,50);
		b1.setBackground(Color.green);
		this.add(b1);
		
		b2 = new JButton("Clear");
        b2.setBounds(260, 240, 100, 50);
        b2.setBackground(Color.red);
        this.add(b2);
        
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
        box1 = new JComboBox(s1);
        box1.setBounds(150,20,150,20);
        this.add(box1);
        
        b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
        
	}
	
	public void actionPerformed(ActionEvent ae) {
		String temp = (String) box1.getSelectedItem();
        String str = ae.getActionCommand();
        if (temp.equals("Celsius to Fahrenheit") && str.equals("Convert")){
        	try {
        	double c = Double.parseDouble(t1.getText());
            double f = (double)(c*1.8+32);
            t2.setText(String.valueOf(f));
        	}
        	catch(NumberFormatException nfe){
				t2.setText("Wrong Input");
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
            t1.setText(" ");
            t2.setText(" ");
        }
    }
	public static void main(String[] args) {
		TemperatureSwing t = new TemperatureSwing();
        t.setSize(460, 430);
        t.getContentPane().setBackground(Color.black);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
