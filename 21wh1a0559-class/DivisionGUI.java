package javalab;
import java.awt.*;
import java.awt.event.*;
public class Division extends Frame implements ActionListener {
	Button b1,b2;
	TextField n1,n2,res;
	Label num1,num2,result;
	public Division(){
		this.setLayout(null);
		b1 = new Button("Div");
		b2 = new Button("Clear");
		num1 = new Label("       Number 1:");
		num2 = new Label("       Number 2:");
		result = new Label("         Result:");
		
		n1 = new TextField();
		n2 = new TextField();
		res = new TextField();
		num1.setBounds(550, 150, 99, 50);
		n1.setBounds(650, 150, 100, 50);
		num2.setBounds(550, 220, 99, 50);
		n2.setBounds(650, 220, 100, 50);
		result.setBounds(540, 380, 99, 50);
		res.setBounds(640, 380, 123, 50);
		
		b1.setBounds(520, 300, 100, 50);
		b2.setBounds(680, 300, 100, 50);
		
		this.add(b1);
		this.add(num1);
		this.add(num2);
		this.add(result);
		this.add(n1);
		this.add(n2);
		this.add(res);
		this.add(b2);

		b1.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		res.addActionListener(this);
		b2.addActionListener(this);
	}
	public static boolean isFloat(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Div") {
			String s1 = n1.getText();
			String s2 = n2.getText();
			if(isFloat(s1) && isFloat(s2)) {
				float a = Float.parseFloat(s1);
				float b = Float.parseFloat(s2);
				if(b != 0) {
					this.setBackground(Color.green);
					float c = a/b;
					res.setText(String.valueOf(c));
				}
				else { 
					this.setBackground(Color.RED);
					res.setText("Division Not Possible!");
				}
				if(str == "Clear") {
					n1.setText("");
					n2.setText("");
					res.setText("");
				}
			}
			else {
				this.setBackground(Color.RED);
				res.setText("       Invalid Input!");
			}
		}
		if(str == "Clear") {
			this.setBackground(Color.LIGHT_GRAY);
			n1.setText("");
			n2.setText("");
			res.setText("");
		}
	}
	public static void main(String args[]) {
		Division f =new Division();
		f.setTitle("DIVISION");
		f.setSize(400,400);
		f.setVisible(true);
		f.setBackground(Color.LIGHT_GRAY);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
