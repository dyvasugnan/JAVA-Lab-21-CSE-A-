package javalab;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener{
	Button b1;
	Button b2;
	Frame1(){
		this.setLayout(null);
		b1=new Button("NEXT");
		//b1.setBackground(Color.BLACK);
		b2=new Button("EXIT");
		//b2.setBackground(Color.BLACK);
		b1.setBounds(100,150,200,250);
		b2.setBounds(400,150,200,250);
		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="NEXT") {
		Frame2 f2=new Frame2();
		f2.setTitle("Frame2");
		f2.setSize(500,500);
		f2.setVisible(true);
		}
		else
			System.exit(0);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame1 f=new Frame1();
		f.setSize(500,500);
		f.setVisible(true);
		f.setTitle("Frame1");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}

			


