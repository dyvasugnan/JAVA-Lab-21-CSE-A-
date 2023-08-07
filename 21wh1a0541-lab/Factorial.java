package javaprograms;
import java.awt.*;
import java.awt.event.*;
public class Factorial extends Frame implements ActionListener{
		Button b1,b2;
		TextField n,f;
		Label l1,l2;
        Factorial(){
        	this.setLayout(null);
        	b1 = new Button("COMPUTE");
        	b2 = new Button("CLEAR");
        	l1 = new Label("Enter num");
			l2 = new Label("Factorial");
			
        	n = new TextField();
        	f = new TextField();
        	
			n.setBounds(100, 150, 150, 50);
			f.setBounds(100, 250, 150, 50);
			
			b1.setBounds(150, 450, 100, 50);
			b2.setBounds(250,450,100,50);
			
			l1.setBounds(45,150,100,50);
			l2.setBounds(50,250,100,50);
			this.add(b2);
			this.add(b1);
			this.add(n);
			this.add(f);
			this.add(l1);
			this.add(l2);
			b1.addActionListener(this);
			b2.addActionListener(this);
			n.addActionListener(this);
			f.addActionListener(this);	
        }
public void actionPerformed(ActionEvent ae) {
	String str = ae.getActionCommand();
	if(str == "COMPUTE") {
		int a = Integer.parseInt(n.getText());
		int fact = 1;
		for(int i=a;i>1;i--) {
			fact = fact * i;
		}
		f.setText(String.valueOf(fact));
	}
	 if (str == "CLEAR") {
		n.setText("");
		f.setText("");
	}
}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.setTitle("Factorial");
		f.setSize(400, 400);
		f.setBackground(Color.MAGENTA);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}