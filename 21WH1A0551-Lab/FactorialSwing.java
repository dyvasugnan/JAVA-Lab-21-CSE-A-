package labprograms;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FactorialSwing extends JFrame implements ActionListener{
	JButton com, clear;
	JTextField f1, f2;
	JLabel n, res;
	JTable tab;
	FactorialSwing(){
		Container c = getContentPane();
		this.setLayout(null);
		com = new JButton("Compute"); 
		clear = new JButton("Clear");
		n = new JLabel("Number");
		res = new JLabel("Result");
		f1 = new JTextField();
		f2 = new JTextField();
		com.setBounds(250,350,100,50);
		clear.setBounds(450,350,100,50);
		n.setBounds(250,300,100,50);
		res.setBounds(450,300,100,50);
		f1.setBounds(250,250,100,50);
		f2.setBounds(450,250,100,50);
		this.add(com);
		this.add(clear);
		this.add(n);
		this.add(res);
		this.add(f1);
		this.add(f2);
		com.addActionListener(this);
		clear.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str=="Compute") {
				long n = Integer.parseInt(f1.getText());
				long ans = 1;
				for(long i =1; i<=n; i++) {
					ans *= i;
				}
				f2.setText(String.valueOf(ans));
			}
			if(str == "Clear") {
				f1.setText("");
				f2.setText("");
			}
	}
	public static void main(String args[]) {
		FactorialSwing fs = new FactorialSwing();
		fs.setSize(600,600);
		fs.setVisible(true);
		fs.setBackground(Color.BLACK);
		fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}