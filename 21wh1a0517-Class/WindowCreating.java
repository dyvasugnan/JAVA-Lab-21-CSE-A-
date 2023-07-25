package javalab;
import java.awt.*;
import java.awt.event.*;

class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
public class WindowCreating {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Frame f = new Frame();
		  f.setSize(400,400);
		  f.setTitle("FirstWindow Creation");
		  f.addWindowListener(new Myclass());
		  f.setVisible(true);
		
	}

}

