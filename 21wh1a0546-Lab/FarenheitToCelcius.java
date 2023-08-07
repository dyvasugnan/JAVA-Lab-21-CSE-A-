/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

package javagui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FarenheitToCelcius extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	JTextField n,res;
	JLabel result,temp;
	FarenheitToCelcius() {
		Container c = getContentPane();
		this.setLayout(null);
		b1 = new JButton("farenheit");
		b2 = new JButton("celcius");
		b3 = new JButton("Clear");
		
		result = new JLabel("Result");
		temp = new JLabel("Temperature");
		n = new JTextField();
		res = new JTextField();
		//res2 = new JTextField();
		
		res.setBounds(520, 400, 100, 50);
		result.setBounds(500,350,100,50);
		temp.setBounds(500, 180, 99, 50);
		n.setBounds(600, 180, 100, 50);
		//res2.setBounds(670, 150, 100, 50);
		b1.setBounds(520, 230, 100, 50);
		b2.setBounds(680, 230, 100, 50);
		b3.setBounds(730, 400, 100, 50);
		
		this.add(b1);
		this.add(b3);
		this.add(n);
		this.add(res);
		//this.add(res2);
		this.add(b2);
		this.add(result);
		this.add(temp);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		n.addActionListener(this);
		res.addActionListener(this);
		//res2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "farenheit") {
			long a = Integer.parseInt(n.getText());
			long celci = (a - 32) * 5/9;			
			res.setText(String.valueOf(celci));
		}
		if(str == "celcius") {
			long a = Integer.parseInt(n.getText());
			long celci = (a * 9/5) + 32;			
			res.setText(String.valueOf(celci));
		}
		if(str == "Clear") {
			n.setText("");
			res.setText("");
			//res1.setText("");
			//res2.setText("");
		}
	}
	
	public static void main(String args[]) {
		FarenheitToCelcius f =new FarenheitToCelcius();
		f.setTitle("Temperature conversion");
		f.setSize(400,400);
		f.setVisible(true);
		
	}
}