
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Temperature extends JFrame implements ActionListener{
		JButton F2C,C2F,clear;
		JTextField cel,far;
		JLabel l1,l2;
		Temperature(){
			F2C = new JButton("toCelsius");
			C2F = new JButton("toFahrenheit");
			clear = new JButton("Clear");
			cel = new JTextField();
			far = new JTextField();

			l1 = new JLabel("Celsius");
			l2 = new JLabel("Fahreheit");

			l1.setBounds(100, 150,100, 50);
			l2.setBounds(300,150,100,50);

			cel.setBounds(100,200,100,100);
			far.setBounds(300,200,100,100);
			
			clear.setBounds(200,500,100,100);


			F2C.setBounds(150, 400, 100, 100);
			C2F.setBounds(300,400,100,100);

			Container c = getContentPane();
			c.setLayout(null);
			c.add(l1);
			c.add(l2);
			c.add(cel);
			c.add(far);
			c.add(F2C);
			c.add(C2F);
			c.add(clear);

			cel.addActionListener(this);
			far.addActionListener(this);
			F2C.addActionListener(this);
			C2F.addActionListener(this);
			clear.addActionListener(this);
		}


		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str=="toCelsius"){
				double d = Double.parseDouble(far.getText());
				double ans;
				ans = (d-32)*(5.0/9);
				cel.setText(Double.toString(ans));

			}
			else if(str=="toFahrenheit"){
				double d = Double.parseDouble(cel.getText());
				double ans;
				ans = (d * 9/5) + 32;
				far.setText(Double.toString(ans));

			}
			else if(str=="Clear"){
				cel.setText("");
				far.setText("");
			}


		}
	public static void main(String[] args) {
		Temperature t = new Temperature();
		t.setSize(600,600);
		t.setVisible(true);
		t.setTitle("TemperatureConversion");
		t.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
