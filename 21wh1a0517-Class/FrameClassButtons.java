package javalab;

import java.awt.*;// abstract window toolkit
import java.awt.event.*;

	public class FrameClassButtons extends Frame implements ActionListener {
		Button b1,b2,b3;
		FrameClassButtons(){
			this.setLayout(null);
			b1 = new Button("Red");
			b2 = new Button("Yellow");
			b3 = new Button("Green");
			b1.setBounds(100, 150, 100, 50);
			b2.setBounds(100, 250, 100, 50);
			b3.setBounds(100, 350, 100, 50);
			this.add(b1);
			this.add(b2);
			this.add(b3);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
					}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "Red")
					this.setBackground(Color.RED);
			if(str == "Yellow")
				this.setBackground(Color.YELLOW);
		
			if(str == "Green")
				this.setBackground(Color.GREEN);
		
		}
	
	public static void main(String[] args) {
		FrameClassButtons fcb = new FrameClassButtons();
		fcb.setTitle("Buttons creation");
		fcb.setSize(400, 400);
		fcb.setVisible(true);
		fcb.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
