package moulikaLab;

import java.awt.*;
import java.awt.event.*;

public class DivGui extends Frame implements ActionListener{
	Button b1, b2, b3;
	TextField n1, n2, res;
	Label Num1, Num2, Result, Title;
	DivGui(){
		this.setLayout(null);
		b1 = new Button("Divide");
		b2 = new Button("Clear");
		b3 = new Button("Subtract");
		Num1 = new Label("Nunber 1");
		Num2 = new Label("Number 2");
		Result = new Label("Result");
		Title = new Label("Division ");
		n1 = new TextField();
		n2 = new TextField();
		res = new TextField();
		Title.setBounds(150, 50, 100, 50);
		Num1.setBounds(100, 150, 100, 50);
		n1.setBounds(200, 150, 150, 50);
		
		Num2.setBounds(100, 250, 100, 50);
		n2.setBounds(200, 250, 150, 50);
		
		Result.setBounds(100, 350, 100, 50);
		res.setBounds(200, 350, 150, 50);
		
		b1.setBounds(150, 450, 100, 50);
		b3.setBounds(300, 450, 100, 50);
		
		b2.setBounds(150, 550, 100, 50);
		
		this.setBackground(Color.lightGray);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(Num1);
		this.add(Num2);
		this.add(Result);
		this.add(Title);
		this.add(n1);
		this.add(n2);
		this.add(res);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Divide") {
			try {
                int a = Integer.parseInt(n1.getText());
                int b = Integer.parseInt(n2.getText());

                if (b == 0) {
                    res.setText("Cannot divide by zero!");
                } else {
                    int c = a / b;
                    res.setText(String.valueOf(c));
                }
            } catch (NumberFormatException ex) {
                res.setText("Invalid input!");
            } catch (ArithmeticException ex) {
                res.setText("Divide by zero error! ");
            }
		}
		if(str == "Subtract") {
			int a = Integer.parseInt(n1.getText());
            int b = Integer.parseInt(n2.getText());
            int c = a-b;
            res.setText(String.valueOf(c));
		}
		if(str == "Clear") {
			n1.setText("");
			n2.setText("");
			res.setText("");
		}
	}
	
	public static void main(String[] args) {
		DivGui d = new DivGui();
		d.setSize(400, 400);
		d.setVisible(true);
		d.setTitle("Exception Handle case");
		d.addWindowListener(new WindowAdapter () {
			public void windowClosing (WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
