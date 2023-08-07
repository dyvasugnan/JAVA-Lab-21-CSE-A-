package javalab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Temperature extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	JTextField n,res;
	JLabel num1,num2;
	Temperature() {
		Container c = new Container(); 
		this.setLayout(null);
		b1 = new JButton("Fahrenheit");
		b2 = new JButton("Celcius");
		b3 = new JButton("Clear");
		num1 = new JLabel("   Number : ");  
		num2 = new JLabel("   Result");
		n = new JTextField();
		res = new JTextField();
		num1.setBounds(550, 150, 99, 50);
		n.setBounds(650, 150, 100, 50);
		num2.setBounds(540, 350, 99, 50);
		res.setBounds(640, 350, 123, 50);
		b1.setBounds(520, 250, 100, 50);
		b2.setBounds(650, 250, 100, 50);
		b3.setBounds(780, 250, 100, 50);
		
		this.add(b1);
		this.add(n);
		this.add(res);
		this.add(b2);
		this.add(num1);
		this.add(num2);
		this.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		n.addActionListener(this);
		res.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Fahrenheit") {
			float cel = Float.parseFloat(n.getText());
			double fah = (cel* 1.8) + 32;
			res.setText(String.valueOf(fah));
		}
		if(str == "Celcius") {
			float fa = Float.parseFloat(n.getText());
			double ce =  (fa - 32) * 5/9;
			res.setText(String.valueOf(ce));
		}
		if(str == "Clear") {
			n.setText("");
			res.setText("");
		}
	}
	
	public static void main(String args[]) {
		Temperature f =new Temperature();
		f.setTitle("Convert Temperature");
		f.setSize(400,400);
		f.setVisible(true);
		f.setBackground(Color.LIGHT_GRAY);
		/*f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});*/
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
