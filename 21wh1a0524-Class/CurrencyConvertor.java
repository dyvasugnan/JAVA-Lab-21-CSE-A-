import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
public class CurrencyConvertor extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	JTextField n1,n2;
	JLabel l1,l2;
	CurrencyConvertor()
	{ 
	
	    Container c = getContentPane();
		this.setLayout(null);
		b1=new JButton("₹ to $");
		b3=new JButton("$ to ₹");
		b2=new JButton("Clear");
		l1=new JLabel("EnterAmount");
		l2=new JLabel("Answer");
		n1=new JTextField();
		n2=new JTextField();
		
		c.add(b1);
		c.add(b3);
		c.add(b2);
		c.add(n1);
		c.add(n2);
		c.add(l1);
		c.add(l2);
		b1.addActionListener(this);
		b3.addActionListener(this);
		b2.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		
		
		
		
		b1.setBounds(150, 450, 100, 50);
		b3.setBounds(150, 550,100,50);
		b2.setBounds(150, 650,100,50);
		l1.setBounds(100, 150, 100, 50);
		n1.setBounds(200, 150, 100, 50);
		l2.setBounds(100, 250, 100, 50);
		n2.setBounds(200, 250, 100, 50);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str=="₹ to $")
		{
			int a = Integer.parseInt(n1.getText());
			double ans=(a*0.0121);
			n2.setText(String.valueOf(ans));
			
			
		
		}
		if(str=="Clear")
		{

			n1.setText(String.valueOf(""));
			n2.setText(String.valueOf(""));
			
			
		}
		if(str=="$ to ₹")
		{
			int b=Integer.parseInt(n1.getText());
			double res=(b*82.73);
			n2.setText(String.valueOf(res));
			
		}
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		CurrencyConvertor f = new CurrencyConvertor();
		f.setTitle("Convertor");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}

