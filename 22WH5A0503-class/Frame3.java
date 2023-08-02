package javalab;

import java.awt.*;
import java.awt.event.*;

public class Frame3 extends Frame implements ActionListener{
	
	Button b1,b2;
	Frame3()
	{
		this.setLayout(null);
		b1 = new Button("Next");
		b2 = new Button("Exit");
		
		b1.setBounds(50, 50, 70, 30);
		b2.setBounds(50, 100, 70, 30);
		
		this.add(b1);
		this.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
		{
			Frame2 f2 = new Frame2();
			f2.setSize(400,400);
			f2.setVisible(true);
		}
		else
		{
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Frame3 f = new Frame3();
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}
