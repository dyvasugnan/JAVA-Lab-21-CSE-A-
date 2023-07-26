package javalab;

import java.awt.*;// abstract window toolkit
import java.awt.event.*;

public class ButtonsAndTextfields  extends Frame implements ActionListener {
	Button b1;
	TextField tf1,tf2,tf_result;
	Label l1,l2,l_result;
	ButtonsAndTextfields(){
		this.setLayout(null);
		b1 = new Button("Add");
		l1 = new Label("Number 1");
		l2 = new Label("Number 2");
		l_result = new Label("Result");
		tf1 = new TextField();
		tf2 = new TextField();
		tf_result = new TextField();
		l1.setBounds(100, 150, 100, 50);
		tf1.setBounds(200, 150, 100, 50);
		
		l2.setBounds(100, 250, 100, 50);
		tf2.setBounds(200, 250, 100, 50);
				
		l_result.setBounds(100, 450, 100, 50);
		tf_result.setBounds(200, 450, 100, 50);
		b1.setBounds(150, 350, 100, 50);
		
		this.add(b1);
		this.add(tf1);
		this.add(tf2);
		this.add(tf_result);
		this.add(l1);
		this.add(l2);
		this.add(l_result);
		b1.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf_result.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Add") {
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int c = a+b ;
			tf_result.setText(String.valueOf(c));
		}
			
		}
	

public static void main(String[] args) {
	ButtonsAndTextfields btf = new ButtonsAndTextfields();
	btf.setTitle("Addition Using Buttons&TextField");
	btf.setSize(400, 400);
	btf.setVisible(true);
	btf.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
 

	
}
