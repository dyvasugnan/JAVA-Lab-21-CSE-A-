package javalab;
import java.awt.*;
import java.awt.event.*;
public class FrameClass extends Frame{
	public void paint(Graphics g) {
		this.setBackground(Color.lightGray);
		//g.drawRect(80,70,200,200);
		g.setColor(Color.pink);
		g.fillRect(80,70,200,200);
		//g.drawOval(117,100,125,125);
		g.setColor(Color.yellow);
		g.fillOval(117,100,125,125);
		g.setColor(Color.black);
		g.drawArc(150,150,60,60,180,180);
		g.fillOval(150, 130, 10, 10);
		g.fillOval(200, 130, 10, 10);
		
	}
	public static void main(String args[]) {
		FrameClass f = new FrameClass();
		f.setSize(400,400);
		f.setTitle("TEST");
		f.setVisible(true);
		f.addWindowListener(new Myclass());
	}
}
class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}