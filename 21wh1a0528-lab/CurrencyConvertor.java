
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CurrencyConvertor extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JTextField f1,f2;
	JLabel l1,l2;
	
	CurrencyConvertor(){
		
					
		this.setLayout(null);				
		
		l1 = new JLabel("Rupee (₹)");
		l1.setBounds(100,40,100,100);
		f1 = new JTextField();
		f1.setBounds(100,100,100,40);
		l2 = new JLabel("Dollar ($)");
		l2.setBounds(240,40,100,100);
		f2 = new JTextField();
		f2.setBounds(240,100,100,40);
		b1 = new JButton("₹ to $");
		b1.setBounds(100,220,100,40);
		b2 = new JButton("$ to ₹");
		b2.setBounds(240,220,100,40);
		b3 = new JButton("Clear");
		b3.setBounds(170,300,100,40);
	
		
		Container c=getContentPane();
		
		c.add(l1);
		c.add(l2);
		c.add(f1);
		c.add(f2);
		c.add(l1);
		c.add(l2);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);
				
	}

	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		
		if(ae.getSource()==b1) {
			try{
			double n=Double.parseDouble(f1.getText());			
			f2.setText(String.valueOf(n*0.012));
			}
			catch(NumberFormatException e){
				f2.setText("Invalid");
			}
		}
		else if(ae.getSource()==b2) {
			try{
			double n=Double.parseDouble(f2.getText());			
			f1.setText(String.valueOf(n*82.72));
			}
			catch(NumberFormatException e){
				f1.setText("Invalid");
			}
		}
		else if(ae.getSource()==b3) {
			f1.setText("");
			f2.setText("");
		}
	}
	
	public static void main(String[] args) {
		CurrencyConvertor c= new CurrencyConvertor();
		c.setTitle("Currency Convertor");
		c.setSize(500,400);
		c.setVisible(true);
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			
		

	}

}

