package javalab;
import java.awt.*;
import java.awt.event.*;
public class Adder extends Frame implements ActionListener {
	Button sum,clear;
	TextField n1,n2,res;
	Label num1,num2,result;
	Adder(){
		this.setLayout(null);
		sum = new Button("Add");
		clear = new Button("Cear");
		num1 = new Label("Number 1");
		num2 = new Label("Number 2");
		result = new Label("Result");
		n1 = new TextField();
		n2 = new TextField();
		res = new TextField();
		num1.setBounds(100,150,100,50);
		n1.setBounds(200,150,100,50);
		num2.setBounds(100,250,100,50);
		n2.setBounds(200,250,100,50);
		result.setBounds(100,350,100,50);
		res.setBounds(100,350,100,50);
		sum.setBounds(95,450,100,50);
		clear.setBounds(205,450,100,50);
		this.add(sum);
		this.add(clear);
		this.add(num1);
		this.add(num2);
		this.add(result);
		this.add(n1);
		this.add(n2);
		this.add(res);
		sum.addActionListener(this);
		clear.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		res.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Add") {
			int a = Integer.parseInt(n1.getText());
			int b = Integer.parseInt(n2.getText());
			int c = a+b ;
			res.setText(String.valueOf(c));
		}
		else if(str == "clear") {
			n1.setText("");
			n2.setText("");
			res.setText("");
		}
	}
		public static void main(String args[]) {
			Adder f = new Adder();
			f.setTitle("ADDER");
			f.setSize(400, 400);
			f.setVisible(true);
			f.addWindowListener(new WindowAdapter() {
				public void WindowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		}
}
			
	

