package javalab;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConversion extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField t1,t2;
	JLabel l1,l2;
	CurrencyConversion(){
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.orange);
		
		b1 = new JButton("Convert");
		b2 = new JButton("ClearAll");
		
		t1 = new JTextField();
		t2 = new JTextField();
		
		l1 = new JLabel("Rupees : ");
		l2 = new JLabel("Dollars : ");
		
		l1.setBounds(50,50,100,50);
		l2.setBounds(50,200,70,50);
		
		t1.setBounds(140,50,70,50);
		t2.setBounds(140,200,70,50);
		
		b1.setBounds(100,300,100,50);
		b2.setBounds(220,300,100,50);
		
		
		c.add(l1);
		c.add(l2);
		c.add(b1);
		c.add(b2);
		c.add(t1);
		c.add(t2);
		
		b1.addActionListener(this);
        b2.addActionListener(this); 
		
	}

	public static void main(String[] args) {
		CurrencyConversion f = new CurrencyConversion();
		f.setTitle("Currency Conversion");
		f.setVisible(true);
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s=e.getActionCommand();
		if(s.equals("Convert")) {
			if (!t1.getText().isEmpty()) {
				double u = Double.parseDouble(t1.getText()); //t1 has f value
				double x = u/82.74;
				t2.setText(String.format("%.2f",x));
			}
			else if(!t2.getText().isEmpty()) {
				double v = Double.parseDouble(t2.getText());
				double y = v*82.74;
				t1.setText(String.format("%.2f",y));
			}
			
		}
		else if(s.equals("ClearAll")) {
			t1.setText("");
			t2.setText("");
			
		}
		
		}
	}

