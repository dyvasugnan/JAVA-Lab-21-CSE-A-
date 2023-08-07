package classprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FactorialSwing extends JFrame implements ActionListener{
	    JButton b1,b2;
	    JTextField t1,t2,res;
	    FactorialSwing(){
	    	Container c = getContentPane();
	    	c.setLayout(null);
	    	b1 = new JButton("compute");
	    	b2 = new JButton("clear");
	    	t1 = new JTextField();
	    	t2 = new JTextField();
	    	t1.setBounds(100,100,100,50);
	    	t2.setBounds(200,100,100,50);
	    	b1.setBounds(100,200,100,50);
	    	b2.setBounds(200,200,100,50);
	    	c.add(t1);
	    	c.add(t2);
	    	c.add(b1);
	    	c.add(b2);
	    	t1.addActionListener(this);
			t2.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
	    	}
	    public void actionPerformed(ActionEvent ae) {
	    	String str = ae.getActionCommand();
	    	if(str=="compute") {
	    		String c = t1.getText();
	    		int n = Integer.parseInt(c);
	    		int fact = 1;
	    		for(int i = 1;i<=n;i++) {
	    			fact = fact*i;
	    		}
	    		t2.setText(String.valueOf(fact));
	    	}
	    	else if(str=="clear") {
	    		t1.setText("0");
	    		t2.setText(" ");
	    	}
	    }
	    public static void main(String args[]) {
	    	FactorialSwing f = new FactorialSwing();
	    	f.setSize(400,400);
	    	f.setVisible(true);
	    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    }
	}

	    
	    

