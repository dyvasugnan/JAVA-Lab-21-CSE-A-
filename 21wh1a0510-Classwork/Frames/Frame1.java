package Javaclss;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener{
	Button b1;
	Button b2;
	Frame1(){
		this.setLayout(null);
		b1=new Button("NEXT");
		b2=new Button("EXIT");
		b1.setBounds(170,150,100,50);
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.WHITE);
		b2.setBounds(170,250,100,50);
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.WHITE);
		this.add(b1);
		this.add(b2);
		this.setBackground(Color.BLACK);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="NEXT") {
		Frame2 f2=new Frame2();
		f2.setTitle("Frame2");
		f2.setSize(450,450);
		f2.setVisible(true);
		}
		else
			System.exit(0);
}
	
	public static void main(String[]args) {
		Frame1 f=new Frame1();
		f.setSize(450,450);
		f.setVisible(true);
		f.setTitle("Frame1");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}


