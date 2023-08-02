package multiframes;

import java.awt.*;
import java.awt.event.*;

public class Frame2 extends Frame implements ActionListener{
	
	Button b3;
	Frame2()
	{
		b3 = new Button("Back");
		
		add(b3);
		this.setLayout(null);
		b3.setBounds(50, 50, 70, 30);
		
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b3)
		{
			this.dispose();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
