package javalab;
import java.awt.*;
import java.awt.event.*;

public class FrameClass extends Frame implements ActionListener {
	Button b1,b2,b3;
	FrameClass(){
		this.setLayout(null);
		
		b1 = new Button("Red");
		b2 = new Button("Orange");
		b3 = new Button("Green");
		b1.setBounds(100, 100,100, 50);
		b2.setBounds(100, 200,100, 50);
		b3.setBounds(100, 300,100, 50);
		
		b1.setBackground(Color.RED);
		b2.setBackground(Color.ORANGE);
		b3.setBackground(Color.GREEN);
		this.add(b1);
		this.add(b2);
		this.add(b3);	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae ) {
		String str = ae.getActionCommand();
		if(str == "Red") {
			b1.setBackground(Color.white);
			this.setBackground(Color.RED);
		}
		if(str == "Orange") {
			b2.setBackground(Color.white);
			this.setBackground(Color.ORANGE);
	}
		if(str == "Green") {
			b3.setBackground(Color.white);
			this.setBackground(Color.GREEN);
		}
		}
	
	public static void main(String args[]) {
		FrameClass f = new FrameClass();
		f.setTitle("test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}); // anonymous inner class - no name	
	}
}