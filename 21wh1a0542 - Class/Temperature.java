package javagui;

import java.awt.*;
import java.awt.event.*;

public class Temperature extends Frame implements ActionListener {

	Button a1,a2;
	TextField t1,t2;
	Label l1,l2;
	
	Temperature(){
		this.setLayout(null);
	
		
		a1 = new Button("C-F");
		a2 = new Button("F-C");
		l1 = new Label("Temperature");
		l2 = new Label("Result");
		t1 = new TextField();
		t2 = new TextField();
		
		
		this.add(a1);
		this.add(a2);
		this.add(l1);
		this.add(l2);
		this.add(t1);
		this.add(t2);
	
	
		a1.addActionListener(this);
		a2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
		
		
		l1.setBounds(190,100,100,60);
		l2.setBounds(450,100,100,60);
		t1.setBounds(290,100,100,60);
		t2.setBounds(560,100,100,60);
		a1.setBounds(310,200,100,60);
		a2.setBounds(460,200,100,60);	
	}


	public void actionPerformed(ActionEvent ae) {
	
		String s = ae.getActionCommand();
		 int f,c,result;
		 int x = Integer.parseInt(t1.getText());
		if(s == "C-F") {
			f = (x*9/5)+32;
			result = f;
			t2.setText(String.valueOf(result));
		}
		else {
			c = (x-32)*5/9;
			result = c;
			t2.setText(String.valueOf(result));
		}
		
	}
public static void main(String[] args) {
	Temperature cf = new Temperature();
	cf.setTitle("Test");
	cf.setSize(400, 400);
	cf.setVisible(true);
	cf.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
   );
}
}