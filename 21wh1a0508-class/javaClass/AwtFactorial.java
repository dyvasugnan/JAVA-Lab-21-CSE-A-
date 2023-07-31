package javaClass;
import java.awt.*;
import java.awt.event.*;

class AwtFactorial extends Frame implements ActionListener{
	TextField tf;
	Button b;
	Label l1, l2, l3;
	AwtFactorial()
	{  
		l1 = new Label("AWT Factorial Program");
		l2 = new Label("Enter number");
		l3= new Label();
		tf = new TextField();
		b = new Button("Factorial");  
		l1.setBounds(30, 40, 200, 20);
		l2.setBounds(30, 70, 100, 20);
		l3.setBounds(30, 170, 200, 20);
		tf.setBounds(30, 90, 190, 30);
		b.setBounds(30, 130, 190, 30);  
		add(l1);
		add(l2);
		add(l3);
		add(tf);
		add(b);
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
		AwtFactorial f = new AwtFactorial();
	}
}