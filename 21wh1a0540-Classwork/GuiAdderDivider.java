package javaclass;
import java.awt.*;// abstract window toolkit
import java.awt.event.*;


public class GuiAdderDivider extends Frame implements ActionListener{
	public static void main(String args[]) {
		GuiAdderDivider f=new GuiAdderDivider();
		f.setTitle("GuiAdderDivider");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	Button b1,b2,b3;
	TextField n1,n2,res;
	Label num1,num2,result;
	GuiAdderDivider(){
		this.setLayout(null);
		b1 = new Button("Add");
		b2 = new Button("CLEAR");
		b3 = new Button("Div");

		num1 = new Label("Number 1");
		num2 = new Label("Number 2");
		result = new Label("Result");
		n1 = new TextField();
		n2 = new TextField();
		res = new TextField();
		num1.setBounds(125, 150, 100, 50);
		n1.setBounds(100, 200, 100, 25);
		
		num2.setBounds(325, 150, 100, 50);
		n2.setBounds(300, 200, 100, 25);
		
		result.setBounds(220, 300, 100, 50);
		res.setBounds(180, 350, 200, 25);
		b1.setBounds(100, 450, 100, 50);

		b2.setBounds(350,450,100,50);
		b3.setBounds(220,450,100,50);
		this.add(b3);
		this.add(b2);
		this.add(b1);
		this.add(num1);
		this.add(num2);
		this.add(result);
		this.add(n1);
		this.add(n2);
		this.add(res);
		b3.addActionListener(this);
		b2.addActionListener(this);
		b1.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		res.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Add") {
			try{
				
			int a = Integer.parseInt(n1.getText());
			int b = Integer.parseInt(n2.getText());
			
			int c = a+b ;
			res.setText(String.valueOf(c));
			}
			catch(NumberFormatException e){
				res.setText("Invalid input");
			}
		}
		else if(str == "CLEAR"){
			n1.setText("");
			n2.setText("");
			res.setText("");
		}
		else if(str == "Div"){
			try{
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a/b;
				res.setText(String.valueOf(c));
			}
			catch(NumberFormatException e){
				res.setText("Invalid input");
			}
			catch(ArithmeticException e1){
				res.setText("Division by zero is invalid");
			}
		}

	}

}
