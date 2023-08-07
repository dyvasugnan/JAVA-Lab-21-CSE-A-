
import java.awt.*;
import java.awt.event.*;

public class Factorial extends Frame implements ActionListener{
	Button b1,b2;
	TextField f1,f2;
	Label l1,l2;
	
	Factorial(){
		
		this.setLayout(null);
		this.setBackground(Color.pink);
		b1 = new Button("Compute");
		b1.setBounds(100,400,100,50);
		b1.setFont(new Font("Arial", Font.PLAIN, 20));
		b2 = new Button("Clear");
		b2.setBounds(300,400,100,50);
		b2.setFont(new Font("Arial", Font.PLAIN, 20));
		l1 = new Label("Number");
		l1.setBounds(100,100,100,50);
		l1.setFont(new Font("Arial", Font.PLAIN, 20));
		l2 = new Label("Factorial");
		l2.setBounds(100,250,100,50);
		l2.setFont(new Font("Arial", Font.PLAIN, 20));
		f1 = new TextField();
		f1.setBounds(250,100,100,50);
		f2 = new TextField();
		f2.setBounds(250,250,100,50);
		
		
	
		this.add(b1);
		this.add(b2);
		this.add(f1);
		this.add(f2);
		this.add(l1);
		this.add(l2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);
				
	}

	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		
		if(str=="Compute") {
			int n=Integer.parseInt(f1.getText());
			int fact=1;
			for(int i=n;i>=1;i--) {
				fact *= i;
			}
			f2.setText(String.valueOf(fact));
		}
		else if(str=="Clear") {
			f1.setText("");
			f2.setText("");
		}
	}
	
	public static void main(String[] args) {
		Factorial f= new Factorial();
		f.setTitle("factorial");
		f.setSize(600,600);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	                System.exit(0);
	            }
	    });
			
		

	}

}
