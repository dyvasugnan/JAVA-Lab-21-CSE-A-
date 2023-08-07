package javalab;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Factorial_Swing extends JFrame implements ActionListener{
	JTextField jtf;
	JButton jb1,jb2;
	JLabel jl1,jl2,jl3;
	Factorial_Swing(){  
		Container c = getContentPane();
		//l1 = new Label("Factorial_Calculation");
		jl1=new JLabel("Result");
		jl2 = new JLabel("Enter number");
		jl3= new JLabel();
		jtf = new JTextField();
		jb1 = new JButton("Compute");
		jb2=new JButton("clear");
		//l1.setBounds(550, 80, 200, 25);
		jl2.setBounds(550, 150, 200, 50);//enter number
		jl3.setBounds(550, 550, 200, 50);//result value
		jtf.setBounds(550, 250, 200, 50);//enter value space
		jb1.setBounds(550, 350, 200, 50);//compute 
		jb2.setBounds(550,700,200,50);//clear
		jl1.setBounds(550,450,200,50);//result value
		//add(l1);
		c.add(jl2);
		c.add(jl3);
		c.add(jtf);
		c.add(jb1);
		c.add(jb2);
		c.add(jl1);
		setTitle("Factorial_Cal");
		setSize(250,210);
		setLayout(null); 
		setVisible(true); 
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		this.setBackground(Color.black);
		addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e)
            {  
                dispose();  
            }  
        });
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb1)
		{
			int num = Integer.parseInt(jtf.getText());
			jl3.setText("Factorial of "+num+" is "+getFactorial(num));
		}
		if(ae.getSource()==jb2 ) {
			jtf.setText(" ");
			jl3.setText(" ");
			}
		/*else if(e.getSource()==b2) {
			tf.setText(" ");
		}*/
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



