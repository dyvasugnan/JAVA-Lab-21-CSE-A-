package javaclass;

import java.awt.*;// abstract window toolkit
import java.awt.event.*;
public class FrameClass extends Frame implements ActionListener {
	public static void main(String[] args) {
		FrameClass f = new FrameClass();
		f.setTitle("Play with colours");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
	    });
	}
		Button b1,b2,b3,b4,b5;
		FrameClass(){
			this.setLayout(null);
			b1 = new Button("Red");
			b2 = new Button("Blue");
			b3 = new Button("Green");
			b4 = new Button("Black");
			b5 = new Button("Cyan");

			b1.setBounds(100, 150, 100, 50);
			b2.setBounds(100, 250, 100, 50);
			b3.setBounds(100, 350, 100, 50);
			b4.setBounds(100, 450, 100, 50);
			b5.setBounds(100, 550, 100, 50);
			
			this.add(b1);
			this.add(b2);
			this.add(b3);
			this.add(b4);
			this.add(b5);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "Red")
					this.setBackground(Color.RED);
			if(str == "Blue")
				this.setBackground(Color.BLUE);
		
			if(str == "Green")
				this.setBackground(Color.GREEN);
			
			if(str == "Black")
				this.setBackground(Color.BLACK);
			
			if(str == "Cyan")
				this.setBackground(Color.CYAN);
		
		}
}
