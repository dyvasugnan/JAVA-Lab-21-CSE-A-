package javalab;
import java.awt.*;
import java.awt.event.*;

public class FrameClass extends Frame{
	public void paint(Graphics g)
	{
		this.setBackground(Color.pink);
		//g.drawRect(100, 100, 100, 100);
		Font f = new Font("Arial", Font.BOLD, 30);
		g.setFont(f);
		g.drawString("Be Happy", 120, 90);
		g.setColor(Color.white);
		g.fillRect(100, 100, 200, 200);
		g.setColor(Color.red);
		g.fillOval(150, 150, 100, 100);
		g.setColor(Color.white);
		g.fillOval(170, 180, 10, 10);
		g.fillOval(220, 180, 10, 10);
		g.drawLine(200, 190, 200, 210);
		g.drawArc(170, 180, 50, 50, 190, 170);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameClass f = new FrameClass();
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