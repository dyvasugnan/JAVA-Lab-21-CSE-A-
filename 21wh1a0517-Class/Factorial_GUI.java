package javalab;

import java.awt.*;
import java.awt.event.*;

public class Factorial_GUI extends Frame implements ActionListener{
	TextField tf;
	Button b;
	Label l1, l2, l3;
	Factorial_GUI(){  
		l1 = new Label("Factorial_Calculation");
		l2 = new Label("Enter number");
		l3= new Label();
		tf = new TextField();
		b = new Button("Factorial");  
		l1.setBounds(550, 80, 200, 25);
		l2.setBounds(550, 150, 200, 50);//enter number
		l3.setBounds(550, 450, 200, 50);//result
		tf.setBounds(550, 250, 200, 50);//enter value space
		b.setBounds(550, 350, 200, 50);//factorial  
		add(l1);
		add(l2);
		add(l3);
		add(tf);
		add(b);
		setTitle("Factorial_Cal");
		setSize(250,210);
		setLayout(null);  
		setVisible(true); 
		b.addActionListener(this);
		this.setBackground(Color.black);
		addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e)
            {  
                dispose();  
            }  
        });
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			int num = Integer.parseInt(tf.getText());
			l3.setText("Factorial of "+num+" is "+getFactorial(num));
		}
	}

	public int getFactorial(int n)
	{
		int fact = 1;
		for(int i = n; i > 0; --i)
		{
			fact *= i;
		}
		return(fact);
	}
	public static void main(String[] args)
	{
		Factorial_GUI f = new Factorial_GUI();
	}
}