package javalab;
import java.awt.*;
import java.awt.event.*;
public class CurrencyGUI extends Frame implements ActionListener{
	Button b1,b2;
	Label l1,l2;
	TextField t1,t2;
	CurrencyGUI(){
		this.setLayout(null);
		b1 = new Button("Convert");
		b2 = new Button("Clear");
		l1 = new Label("Rupees");
		l2 = new Label("Dollars");
		t1 = new TextField();
		t2 = new TextField();
		l1.setBounds(100,150,100,50);
		t1.setBounds(200,150,100,50);
		l2.setBounds(100,250,100,50);
		t2.setBounds(200,250,100,50);
		b1.setBounds(150,450,100,50);
		b2.setBounds(150,550,100,50);
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(b1);
		this.add(b2);
		t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Convert") {
			float rupees = Float.parseFloat(t1.getText());
		    float dollars = Float.parseFloat(t1.getText());
		    double D = rupees / 64;
		    t2.setText(String.valueOf(D));
		}
		if(str=="Clear"){
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String [] args) {	
		CurrencyGUI f=new CurrencyGUI();
		f.setTitle("Test");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
	}
}
