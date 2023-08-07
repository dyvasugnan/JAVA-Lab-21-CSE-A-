package javaclass;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class Factorial extends Frame implements ActionListener{
	Button comp, clr;
	TextField  t1, t2;
	Factorial(){
		this.setLayout(null);
		comp = new Button("Compute");
		comp.setBounds(100, 180, 100, 50);
		comp.setBackground(Color.CYAN);
		this.add(comp);
		
		clr = new Button("Clear");
		clr.setBounds(250,180,100,50);
		comp.setBackground(Color.CYAN);
		this.add(clr);
		
		t1 = new TextField();
		t1.setBounds(100,100,100,50);
		this.add(t1);
		
		t2 = new TextField();
		t2.setBounds(250,100,100,50);
		this.add(t2);
		
		comp.addActionListener(this);
		clr.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		int fact = 1;
		if(str == "Compute") {
			int a = Integer.parseInt(t1.getText());
			if(a > 0){
				for(int i=2; i<=a; i++)
					fact *= i;
			t2.setText(String.valueOf(fact));
			}
			else
				t2.setText("Invalid Input");
		}
		if(str == "Clear") {
			t1.setText("");
			t2.setText("");
		}
	}
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.setTitle("Factorial");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\vnave\\OneDrive\\Desktop\\calc.png");    
		f.setIconImage(icon);
		f.setSize(430,400);
		f.setBackground(Color.BLACK);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
		});
	}
}
