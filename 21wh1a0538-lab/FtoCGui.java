package classprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FtoCGui extends JFrame implements ActionListener{
	JButton b1,b2;
    JTextField t1,t2;
    Label l1,l2;
    FtoCGui(){
    	Container c = getContentPane();
    	c.setLayout(null);
    	b1 = new JButton("compute");
    	b2 = new JButton("clear");
    	t1 = new JTextField();
    	t2 = new JTextField();
    	l1 = new Label("F");
    	l2 = new Label("C");
    	t1.setBounds(100,100,100,50);
    	t2.setBounds(200,100,100,50);
    	b1.setBounds(100,200,100,50);
    	b2.setBounds(200,200,100,50);
    	l1.setBounds(100,50,100,50);
    	l2.setBounds(200,50,100,50);
    	c.add(t1);
    	c.add(t2);
    	c.add(b1);
    	c.add(b2);
    	c.add(l1);
    	c.add(l2);
    	t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae) {
    	String str = ae.getActionCommand();
    	if(str=="compute") {
    		String c = t1.getText();
    		double n = Double.parseDouble(c);
    		double r  = (n-32)*(0.556);
    		
    		t2.setText(String.valueOf(r));
    	}
    	else if(str=="clear") {
    		t1.setText("0");
    		t2.setText(" ");
    	}
    }
    public static void main(String args[]) {
    	FtoCGui f = new FtoCGui();
    	f.setSize(400,400);
    	f.setVisible(true);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
