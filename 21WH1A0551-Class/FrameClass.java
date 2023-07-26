

import java.awt.*;
import java.awt.event.*;

public class FrameClass extends Frame implements ActionListener{
	Button b1,b2,b3;
	FrameClass(){
		this.setLayout(null);
		
		b1 = new Button("Red");
		b2 = new Button("Blue");
		b3 = new Button("Green");
		b1.setBounds(100,150,100,50);
		b2.setBounds(100,250,100,50);
		b3.setBounds(100,350,100,50);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		if(s=="Red") {
			this.setBackground(Color.red);
		}
		if(s=="Green") {
			this.setBackground(Color.green);
		}
		if(s=="Blue") {
			this.setBackground(Color.blue);
		}
	}
	public static void main(String args[]) {
		FrameClass f = new FrameClass();
		f.setTitle("Window");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}
