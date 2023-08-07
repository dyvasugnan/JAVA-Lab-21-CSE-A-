package classprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DollerRupee extends JFrame implements ActionListener {
	JButton b1,b2,b3;
    JTextField t1,t2;
    Label l1,l2;
    DollerRupee(){
    	Container c = getContentPane();
    	c.setLayout(null);
    	b1 = new JButton("to dollar");
    	b2 = new JButton("clear");
    	b3 = new JButton("to ruppee");
    	t1 = new JTextField();
    	t2 = new JTextField();
    	l1 = new Label("inp");
    	l2 = new Label("Res");
    	t1.setBounds(100,100,100,50);
    	t2.setBounds(200,100,100,50);
    	b1.setBounds(100,200,100,50);
    	b2.setBounds(200,200,100,50);
    	l1.setBounds(100,50,100,50);
    	l2.setBounds(200,50,100,50);
    	b3.setBounds(300,200,100,50);
    	c.add(t1);
    	c.add(t2);
    	c.add(b1);
    	c.add(b2);
    	c.add(l1);
    	c.add(l2);
    	c.add(b3);
    	t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae) {
    	String str = ae.getActionCommand();
    	if(str=="to dollar") {
    		String c = t1.getText();
    		double n = Double.parseDouble(c);
    		double r  = (n*0.012);
    		
    		t2.setText(String.valueOf(r));
    	}
    	 if(str=="to ruppee") {
    		 String c = t1.getText();
    		 double n = Double.parseDouble(c);
     		double r  = (n*82.73);
     		t2.setText(String.valueOf(r));
    	 }
    	 if(str=="clear") {
    		t1.setText("0");
    		t2.setText(" ");
    	}
    }
    public static void main(String args[]) {
    	DollerRupee f = new DollerRupee();
    	f.setSize(400,400);
    	f.setVisible(true);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
