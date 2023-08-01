package Javaclss;

import java.awt.*;
import java.awt.event.*;
public class Frame2 extends Frame implements ActionListener{
	Button b;
	Frame2(){
		this.setLayout(null);
		b=new Button("BACK");
		b.setBounds(170,190,100,50);
		b.setBackground(Color.DARK_GRAY);
		b.setForeground(Color.WHITE);
		this.add(b);
		this.setBackground(Color.BLACK);
		
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="BACK")
			this.dispose();
	}
}
