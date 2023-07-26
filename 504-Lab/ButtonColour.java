package moulikaLab;

import java.awt.*;// abstract window toolkit
import java.awt.event.*;
public class ButtonColour extends Frame implements ActionListener {
		Button b1,b2,b3;
		ButtonColour(){
			this.setLayout(null);
			b1 = new Button("Black");
			b2 = new Button("Blue");
			b3 = new Button("Orange");
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
			if(str == "Black")
					this.setBackground(Color.BLACK);
			if(str == "Blue")
				this.setBackground(Color.BLUE);
		
			if(str == "Orange")
				this.setBackground(Color.ORANGE);
		
		}
	
	public static void main(String[] args) {
		ButtonColour f = new ButtonColour();
		f.setTitle("Background Display");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}