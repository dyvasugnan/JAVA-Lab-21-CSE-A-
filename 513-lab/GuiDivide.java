package javalab;
import java.awt.*;
import java.awt.event.*;
public class GuiDivide extends Frame implements ActionListener {
	//here u make the con, with what the window is supposed to contain
	Button b1,b2;
	TextField n1,n2,result;
	Label num1,num2,num3;
	
	GuiDivide(){
		this.setLayout(null);
		b1 = new Button("Division");
		b2 = new Button("ClearAll");
		
		num1 = new Label("Number 1");
		num2 = new Label("Number 2");
		num3 = new Label("Result");
		
		n1 = new TextField();
		n2 = new TextField();
		result = new TextField();
		
		//set bounds for labels, buttons and text field
		
		b1.setBounds(150, 450, 100, 50);
		b2.setBounds(250, 450, 100, 50);
		num1.setBounds(100, 150, 100, 50);
		n1.setBounds(200, 150, 100, 50);
		
		num2.setBounds(100, 250, 100, 50);
		n2.setBounds(200, 250, 100, 50);
		
		num3.setBounds(100, 350, 100, 50);
		result.setBounds(200, 350, 150, 50);
		
		//add em to frame
		this.add(b1);
		this.add(b2);
		this.add(num1);
		this.add(num2);
		this.add(result);
		this.add(n1);
		this.add(n2);
		this.add(num3);
		
		
		//listeners for their tasks
		b1.addActionListener(this);
		b2.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		result.addActionListener(this);
	}
	
	//operation of the listeners
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		if(s == "ClearAll"){ //can use str.equals("ClearAll")
			n1.setText("");
			n2.setText("");
			result.setText("");
		}else if(s == "Division") {
			
			try {
				int x = Integer.parseInt(n1.getText());
				int y = Integer.parseInt(n2.getText());
				int z = x/y;
				result.setText(String.valueOf(z));
			}
			catch(NumberFormatException e){
				result.setText("Only numeric inputs");
			}
			catch(ArithmeticException e1){
				result.setText("Division by zero is invalid");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here u mention the window layout and window closing
		GuiDivide f = new GuiDivide();
		f.setTitle("Dividing numbers");
		f.setSize(400,600);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}

}
