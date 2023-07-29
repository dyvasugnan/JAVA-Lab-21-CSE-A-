package labprograms;

import java.awt.*;
import java.awt.event.*;

public class Gui_Div extends Frame implements ActionListener {
	Button b1,c1;
	TextField n1, n2, res;
	Label num1, num2, result;
	public Gui_Div() {
		this.setLayout(null);
		b1 = new Button("Div");
		c1 = new Button("CLEAR");
		num1 = new Label("Number 1 ");
		num2 = new Label("Number 2 ");
		result = new Label("Result ");
		 n1 = new TextField();
		 n2 = new TextField();
		 res = new TextField();
		 num1.setBounds(100, 150, 100, 50);
		 n1.setBounds(200, 150, 100, 50);

		 num2.setBounds(100, 250, 100, 50);
		 n2.setBounds(200, 250, 100, 50);
		 
		 result.setBounds(100, 350, 100, 50);
		 res.setBounds(200, 350, 100, 50);
		 
		 b1.setBounds(150, 450, 100, 50);
		 c1.setBounds(150, 550, 100, 50);
		 
		 this.add(b1);
		 this.add(num1);
		 this.add(num2);
		 this.add(result);
		 this.add(n1);
		 this.add(n2);
		 this.add(res); 
		 this.add(c1);
		 b1.addActionListener(this);
		 n1.addActionListener(this);
		 n2.addActionListener(this);
		 res.addActionListener(this);
		 c1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Div") {
			if(isInteger(n1.getText()) && isInteger(n2.getText())) {
			int a =  Integer.parseInt(n1.getText());
			int b =  Integer.parseInt(n2.getText());
			if(b != 0) {
			float c = a / b;
			res.setText(String.valueOf(c));
			}
			else {
				res.setText("Error!(Div by 0)");
			}
		if(str == "CLEAR") {
			n1.setText("");
			n2.setText("");
			res.setText("");
		}
		}
		else {
			res.setText("Entered String!");
			
		}
		}
		if(str == "CLEAR") {
			n1.setText("");
			n2.setText("");
			res.setText("");
		}
	}
	public static boolean isInteger(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
	public static void main(String[] args) {
		Gui_Div f = new Gui_Div();
		f.setTitle("Division");
		f.setBackground(Color.gray);
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
