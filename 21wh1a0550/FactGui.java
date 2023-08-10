package javaclasswork;
import java.awt.*;
import java.awt.event.*;
public class FactGui extends Frame implements ActionListener {
		Label l1,l2;
		Button b1,b2;
		TextField t1,t2;
		FactGui()
		{
		     this.setLayout(null);
		     b1 = new Button("Compute");
			 b2  = new Button("Clear");
			 
	 		 l1 = new Label("number");
			 l2 = new Label("Result");
			
			 t1 = new TextField();
			 t2 = new TextField();
			
			
		    l1.setBounds(50,100,100,20);
			t1.setBounds(50,140,100,20);
				
			l2.setBounds(200,100,100,20);
			t2.setBounds(200,140,100,20);
				
			b1.setBounds(50,250,50,20);
			b2.setBounds(110,250,50,20);
				
	        this.add(b1);
			this.add(b2);
				
			this.add(l1);
			this.add(l2);

				
			this.add(t1);
			this.add(t2);
				
			b1.addActionListener(this);
			b2.addActionListener(this);
			t1.addActionListener(this);
			t2.addActionListener(this);
				
			}

	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("Compute") ) {
			int num = Integer.parseInt(t1.getText());
			int fact = 1; 
			for(int i=1;i<=num;i++) {
				fact = fact*i;
			}
			t2.setText(String.valueOf(fact));
		}
		if(str.equals("Clear")) {
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String args[]) {
		FactGui f = new FactGui();
		f.setTitle("Factorial");
		f.setSize(450,450);
		f.setVisible(true);
		f.setLocation(500,200);
		f.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent we) {
			 System.exit(0);
		 }
		});
	}
	}
