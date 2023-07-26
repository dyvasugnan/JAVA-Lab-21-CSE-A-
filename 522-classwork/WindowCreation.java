package javaclass;
import java.awt.*;
import java.awt.event.*;
class Myclass extends WindowAdapter{
	public void windowclosing(WindowEvent we) {
		windowClosed(we);
	}
}
public class WindowCreation {
	public static void main(String args[]) {
  Frame f = new Frame();
  f.setSize(400,400);
  f.setTitle("First Window");
  f.addWindowListener(new Myclass());
  f.setVisible(true);
}}
