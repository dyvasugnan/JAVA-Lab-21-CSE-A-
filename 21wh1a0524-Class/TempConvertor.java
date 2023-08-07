import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
public class TempConvertor extends JFrame implements ActionListener
{
	JButton b1,b2;
	JTextField n1,n2;
	JLabel l1,l2;
	TempConvertor()
	{ 
	
	    Container c = getContentPane();
		this.setLayout(null);
		b1=new JButton("Change");
		b2=new JButton("Clear");
		l1=new JLabel("Celcius");
		l2=new JLabel("Fahrenheit");
		n1=new JTextField();
		n2=new JTextField();
		c.add(b1);
		c.add(b2);
		c.add(n1);
		c.add(n2);
		c.add(l1);
		c.add(l2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		
		
		
		
		b1.setBounds(150, 450, 100, 50);
		b2.setBounds(150, 550,100,50);
		l1.setBounds(50, 150, 100, 50);
		n1.setBounds(200, 150, 100, 50);
		l2.setBounds(50, 250, 100, 50);
		n2.setBounds(200, 250, 100, 50);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str=="Change")
		{
			int a = Integer.parseInt(n1.getText());
			int ans=(a*(9/5)+32);
			n2.setText(String.valueOf(ans));
			
			
		
		}
		if(str=="Clear")
		{

			n1.setText(String.valueOf(""));
			n2.setText(String.valueOf(""));
			
		}
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		TempConvertor f = new TempConvertor();
		f.setTitle("Convertor");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}

