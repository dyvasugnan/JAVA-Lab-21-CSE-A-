package classprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Factorial3 extends JFrame implements ActionListener{
JButton b1,b2;
JTextField t;
Factorial3(){
	Container c = getContentPane();
	c.setLayout(null);
	b1 = new JButton("compute");
	b2 = new JButton("clear");
	t = new JTextField();
	b1.setBounds(100,100,100,100);
	b2.setBounds(200,100,100,100);
	t.setBounds(50,50,50,50);
	c.add(b1);
	c.add(b2);
	c.add(t);
	b1.addActionListener(this);
	b2.addActionListener(this);
	t.addActionListener(this);
	
}
public void actionPerformed(ActionEvent ae) {
	String s = ae.getActionCommand();
	if(s=="compute") {
		int n = Integer.parseInt(t.getText());
		int fact = 1;
		for(int i = 1;i<=n;i++) {
			fact = fact*i;
		}
		t.setText(String.valueOf(fact));
	}
	else if(s=="clear")
		t.setText("0");
}
public static void main(String args[]) {
	Factorial3 f = new Factorial3();
	f.setSize(400,400);
	f.setVisible(true);
}
}
