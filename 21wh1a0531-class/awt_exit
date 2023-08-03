package AWT;

import java.awt.*;
import java.awt.event.*;
class ClosWin extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}

public class first extends Frame {
	first(){
	Button b = new Button("Click");
	b.setBounds(50,100,80,50);
	add(b);
	setSize(600,800);
	setTitle("Basic");
	setVisible(true);
}
	public static void main(String[] args) {
		first f = new first();
		f.addWindowListener(new ClosWin());

	}
}
