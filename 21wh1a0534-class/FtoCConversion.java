package java_labcodes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FtoCConversion extends JFrame implements ActionListener {
	JButton ctof,ftoc,clr;
	JLabel l1,l2;
	JTextField t1,t2;
	FtoCConversion() {
		Container c= getContentPane();
		c.setLayout(null);
		t1=new JTextField();
		t2=new JTextField();
		l1 = new JLabel("Temperature");
		l2 = new JLabel("Result");
		ctof=new JButton("CtoF");
		ftoc= new JButton("FtoC");
		clr=new JButton("clear");
		t1.setBounds(120, 150, 100, 50);
		t2.setBounds(220, 150, 100, 50);
		l1.setBounds(130, 100, 100, 50);
		l2.setBounds(250, 100, 100, 50);
		ctof.setBounds(100, 250, 100, 50);
		ftoc.setBounds(230, 250, 100, 50);
		clr.setBounds(170, 350, 100, 50);
		c.add(t1);
		c.add(t2);
		c.add(l1);
		c.add(l2);
		c.add(ctof);
		c.add(ftoc);
		c.add(clr);
		t1.addActionListener(this);
		t2.addActionListener(this);
		ctof.addActionListener(this);
		ftoc.addActionListener(this);
		clr.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="CtoF") {
			int n=Integer.parseInt(t1.getText());
			int res=(n*(9/5))+32;
			t2.setText(String.valueOf(res));
		}
		if(str=="FtoC") {
			int n=Integer.parseInt(t1.getText());
			int res=(5/9)*(n-32);
			t2.setText(String.valueOf(res));
			}
		if(str=="clear") {
			t1.setText(" ");
			t2.setText(" ");			
		}
		}
    public static void main(String[] args) {
    	FtoCConversion t = new FtoCConversion();
        t.setTitle("Temperature Conversion");
        t.setSize(450,450);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
