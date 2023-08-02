package javalab;

import java.awt.*;
import java.awt.event.*;

public class Frame4 extends Frame implements ActionListener{
	
	Button b3;
	Frame4()
	{
		this.setLayout(null);
		b3 = new Button("Back");
		
		b3.setBounds(100, 100, 80, 80);
		
		this.add(b3);
		
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b3)
		{
			this.dispose();
		}
	}

	public static void main(String[] args) {

	}
}
