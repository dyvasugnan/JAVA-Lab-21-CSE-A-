import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConversion extends JFrame implements ActionListener {
	
	JButton a1,a2,a3;
	JTextField t1,t2;
	
	CurrencyConversion() {
		Container co = getContentPane();
		c.setLayout(null);
		
		
		t1 = new JTextField();
		t2 = new JTextField();
		a1 = new JButton("Dollars to Rupees");
		a2 = new JButton("Rupees to Dollars");
		a3 = new JButton("ERASE");
		
		
		t1.setBounds(110,120,100,60);
		t2.setBounds(20,120,100,60);
		a1.setBounds(110,200,100,60);
		a2.setBounds(250,200,100,60);
		a3.setBounds(160,300,100,60);
		
		
		co.add(t1);
		co.add(t2);
		co.add(a1);
		co.add(a2);
		co.add(a3);
	
	
		t1.addActionListener(this);
		t2.addActionListener(this);
		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);

	}


	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
	
		if(str == "Dollars to Rupees") {
	
			int num = Integer.parseInt(t1.getText());
			int result = 83*num;
			t2.setText(String.valueOf(result));

			}
	
		if(str == "Rupees to Dollars") {
			int num = Integer.parseInt(t1.getText());
			int result = (num/83);
			t2.setText(String.valueOf(result));

		}
	
		if(str == "ERASE") {
			t1.setText(" ");
			t2.setText(" ");
		}
	}


	public static void main(String[] args) {
		CurrencyConversion cr = new CurrencyConversion ();
		cr.setTitle("Currency");
		cr.setSize(440,440);
		cr.setVisible(true);
		cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}