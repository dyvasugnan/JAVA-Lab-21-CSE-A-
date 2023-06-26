package javalab;
import java.awt.*;
import java.awt.event.*;

public class FrameClass extends Frame{
	public void paint(Graphics g) {
		this.setBackground(Color.cyan);
		g.setColor(Color.BLACK);
		Font f1 = new Font("Arial",Font.BOLD,30);
	   g.setFont(f1);
	   g.drawString("My Fist Paint",640,100);
		g.drawRect(100, 200, 500, 500);
		g.setColor(Color.yellow);
		g.fillOval(200, 300, 300, 300);
		g.setColor(Color.black);
		g.fillOval(400, 400, 30, 30);
		g.fillOval(275, 400, 30, 30);
		g.fillOval(315, 500, 75, 20);
		
		
	}

	public static void main(String[] args) {
		FrameClass f = new FrameClass();
		f.setTitle("Smiley Face");
		f.setSize(400 , 400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());

	}

}
class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
