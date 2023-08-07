


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MoneyConverter extends JFrame implements ActionListener{
		JButton R2D,D2R,clear;
		JTextField rup,doll;
		JLabel l1,l2;
		MoneyConverter(){
			R2D = new JButton("toDollar");
			D2R = new JButton("toRupee");
			clear = new JButton("Clear");
			rup = new JTextField();
			doll = new JTextField();

			l1 = new JLabel("Rupee");
			l2 = new JLabel("Dollar");

			l1.setBounds(100, 150,100, 50);
			l2.setBounds(300,150,100,50);

			rup.setBounds(100,200,100,100);
			doll.setBounds(300,200,100,100);
			
			clear.setBounds(200,580,100,100);


			R2D.setBounds(150, 400, 100, 100);
			D2R.setBounds(300,400,100,100);

			Container c = getContentPane();
			c.setLayout(null);
			c.add(l1);
			c.add(l2);
			c.add(rup);
			c.add(doll);
			c.add(R2D);
			c.add(D2R);
			c.add(clear);

			rup.addActionListener(this);
			doll.addActionListener(this);
			R2D.addActionListener(this);
			D2R.addActionListener(this);
			clear.addActionListener(this);
		}


		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str=="toRupee"){
				double d = Double.parseDouble(doll.getText());
				double ans;
				ans = d*82.75;

				rup.setText(Double.toString(ans));

			}
			else if(str=="toDollar"){
				double d = Double.parseDouble(rup.getText());
				double ans;
				ans = (d * 0.012);
				doll.setText(Double.toString(ans));

			}
			else if(str=="Clear"){
				rup.setText("");
				doll.setText("");
			}


		}
	public static void main(String[] args) {
		MoneyConverter t = new MoneyConverter();
		t.setSize(600,800);
		t.setVisible(true);
		t.setTitle("TemperatureConversion");
		t.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
