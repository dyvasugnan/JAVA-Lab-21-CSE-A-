import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JWindowCreate extends JFrame implements ActionListener{
	JTextField t1,t2;
	int num;
	JButton b1,b2;
	JLabel l1,l2;
	public JWindowCreate(){
		Container c = getContentPane();
		setTitle("Window");
		setSize(400,400);
		setLayout(null);
		t1 = new JTextField();
		t1.setEditable(true);
		t2 = new JTextField();
		t2.setEditable(true);
		b1 = new JButton("Compute");
		b2 = new JButton("Clear");
		l1 = new JLabel("Number");
		l2 = new JLabel("Result");
		b1.setBounds(400,100,100,50);
		b2.setBounds(400,150,100,50);
		t1.setBounds(200,100,100,50);
		t2.setBounds(200,150,100,50);
		l1.setBounds(100,100,100,50);
		l2.setBounds(100,150,110,50);
		c.add(b1);
		c.add(b2);
		c.add(t1);
		c.add(t2);
		c.add(l1);
		c.add(l2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		if(s.equals("Clear")) {
			t1.setText("");
			t2.setText("");
		}
		if(s.equals("Compute")){
			num = Integer.parseInt(t1.getText());
			int ans = 1;
			while(num > 0){
				ans = ans * num;
				num--;
			}
			t2.setText(ans+"");
		}
	}
	public static void main(String args[]){
		  
		 JWindowCreate w = new JWindowCreate();
		  w.setTitle("Window");
		  w.setSize(600,600);
		  w.setVisible(true);
		  w.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
