
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FactorialSwing extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField f1,f2;
	JLabel l1,l2;
	
	FactorialSwing(){
		
					
		this.setLayout(null);				
		
		l1 = new JLabel("Number");
		l1.setBounds(100,40,100,100);
		f1 = new JTextField();
		f1.setBounds(100,100,100,40);
		l2 = new JLabel("Factorial");
		l2.setBounds(240,40,100,100);
		f2 = new JTextField();
		f2.setBounds(240,100,100,40);
		b1 = new JButton("Compute");
		b1.setBounds(100,240,100,40);
		b2 = new JButton("Clear");
		b2.setBounds(240,240,100,40);
		
	
		
		Container c=getContentPane();
		
		c.add(b1);
		c.add(b2);
		c.add(l1);
		c.add(l2);
		c.add(f1);
		c.add(f2);
		c.add(l1);
		c.add(l2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);
				
	}

	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		
		if(ae.getSource()==b1) {
			int n=Integer.parseInt(f1.getText());
			int fact=1;
			for(int i=n;i>=1;i--) {
				fact *= i;
			}
			f2.setText(String.valueOf(fact));
		}
		else if(ae.getSource()==b2) {
			f1.setText("");
			f2.setText("");
		}
	}
	
	public static void main(String[] args) {
		FactorialSwing f= new FactorialSwing();
		f.setTitle("factorial");
		f.setSize(500,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			
		

	}

}

