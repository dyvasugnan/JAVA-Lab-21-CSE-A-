package multiframes;

import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener{
	
	Button b1,b2;
	Frame1()
	{
		b1 = new Button("Next");
		b2 = new Button("Exit");
		
		add(b1);
		add(b2);
		
		this.setLayout(null);
		b1.setBounds(50, 50, 70, 30);
		b2.setBounds(50, 100, 70, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		Frame1 f = new Frame1();
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
