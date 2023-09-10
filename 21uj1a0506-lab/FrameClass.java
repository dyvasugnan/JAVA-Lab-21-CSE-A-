
package javalab;
import java.awt.*;
import java.awt.event.*;


public class FrameClass extends Frame implements ActionListener {
		Button b1,b2,b3;
		FrameClass(){
			this.setLayout(null);
			b1 = new Button("Green");
			b2 = new Button("Red");
			b3 = new Button("Black");
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
			if(str == "Green")
					this.setBackground(Color.green);
			if(str == "Red")
				this.setBackground(Color.red);
		
			if(str == "Black")
				this.setBackground(Color.black);
		
		}
	
	public static void main(String[] args) {
		FrameClass f = new FrameClass();
		f.setTitle("Test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}