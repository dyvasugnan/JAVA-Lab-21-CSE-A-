
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TemperatureConvertor extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	JTextField f1,f2;
	JLabel l1,l2;
	
	TemperatureConvertor(){
		
					
		this.setLayout(null);				
		
		l1 = new JLabel("Celsius (°C)");
		l1.setBounds(100,40,100,100);
		f1 = new JTextField();
		f1.setBounds(100,100,100,40);
		l2 = new JLabel("Fahrenheit (°F)");
		l2.setBounds(240,40,100,100);
		f2 = new JTextField();
		f2.setBounds(240,100,100,40);
		b1 = new JButton("°C to °F");
		b1.setBounds(100,220,100,40);
		b2 = new JButton("°F to °C");
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
			float c=Float.parseFloat(f1.getText());
			float f=((9.0f/5.0f)* c) + 32;
			f2.setText(String.valueOf(f));
			}
			catch(NumberFormatException e){
				f2.setText("Invalid");
			}
		}
		else if(ae.getSource()==b2) {
			try{
			float f=Float.parseFloat(f2.getText());
			float c = (f - 32) * (5.0f / 9.0f);
			f1.setText(String.valueOf(c));
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
		TemperatureConvertor c= new TemperatureConvertor();
		c.setTitle("Tempurature Convertor");
		c.setSize(500,400);
		c.setVisible(true);
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}

