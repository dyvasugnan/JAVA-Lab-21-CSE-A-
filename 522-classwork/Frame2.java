package javaclass;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Frame2 extends Frame implements ActionListener{
	Button b;
	Frame2(){
		this.setLayout(null);
		b=new Button("BACK");
		b.setBounds(100,150,200,250);
		this.add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="BACK")
			this.dispose();
	}
}
