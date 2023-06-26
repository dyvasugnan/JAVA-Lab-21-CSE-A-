package javalab;
import java.awt.*; // abstract window toolkit
import java.awt.event.*;
public class Component{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("First Frame");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());
	}

}


class Myclass extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}