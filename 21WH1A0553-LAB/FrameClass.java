package javalab;
import java.awt.*;
import java.awt.event.*;
public class FrameClass extends Frame{
	public void paint(Graphics g) {
		this.setBackground(Color.lightGray);
       // g.drawRect(80, 70, 200, 200);
        g.setColor(Color.pink);
        g.fillRect(50, 55, 200, 200);
        g.drawOval(80, 70, 150, 150);
        g.setColor(Color.yellow);
        g.fillOval(80, 70, 150, 150);
        g.setColor(Color.black);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.drawArc(130, 170, 50, 20, 180, 180);
	}
	public static void main(String[] args) {
		FrameClass f = new FrameClass();
		f.setTitle("Test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());
	}

}
class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
	
}
