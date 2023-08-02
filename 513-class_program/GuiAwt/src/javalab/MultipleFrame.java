package javalab;
import java.awt.*;
import java.awt.event.*;

public class MultipleFrame extends Frame implements ActionListener{
	Button b1;
	Button b2;
	MultipleFrame(){
		this.setLayout(null);
		b1=new Button("NEXT");
		//b1.setBackground(Color.BLACK);
		b2=new Button("EXIT");
		//b2.setBackground(Color.BLACK);
		b1.setBounds(90,80,100,50);
		b2.setBounds(290,80,100,50);
		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="NEXT") {
		Frame2 f2=new Frame2();
		f2.setTitle("Frame 2");
		f2.setSize(200,200);
		f2.setBackground(Color.pink);
		f2.setVisible(true);
		}
		else
			System.exit(0);
}
	
	public static void main(String[]args) {
		MultipleFrame f=new MultipleFrame();
		f.setSize(450,200);
		f.setVisible(true);
		f.setTitle("Frame 1");
		f.setBackground(Color.orange);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}