import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener{
	Button b1,b2;
	public Frame1() {
		b1 = new Button("Next");
		b2 = new Button("Exit");
		b1.setBounds(100, 150, 100, 50);
		b2.setBounds(100, 250, 100, 50);
		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.setBackground(Color.black);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Next") {
			Frame2 f2 = new Frame2();
			f2.setSize(400,400);
			f2.setVisible(true);
		}
		if(str == "Exit")
			System.exit(0);
	}
	public static void main(String[] args) {
		Frame1 f = new Frame1();
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}
}

public class Frame2 extends Frame implements ActionListener{
	Button b;
	public Frame2() {
		this.setLayout(null);
		b=new Button("Back");
		b.setBounds(100, 250, 100, 50);
		this.add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Back")
			this.dispose();
	}
}
