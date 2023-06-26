package javalab;
import java.awt.*;
import java.awt.event.*;

public class FrameClass extends Frame {
	public void paint(Graphics g) {
		this.setBackground(Color.pink);
		Font f = new Font("Arial",Font.BOLD, 30);
		g.setFont(f);
		g.drawString("always smile", 120,60);
		g.drawRect(100,100,200,200);
		g.setColor(Color.blue);
		g.drawOval(100,100,200,200);
		g.setColor(Color.blue);
		g.fillOval(150,150,10,10);
		g.setColor(Color.black);
		g.fillOval(150,150,10,10);
		g.drawOval(250,150,10,10);
		g.setColor(Color.black);
		g.fillOval(250,150,10,10);
		g.drawLine(200, 190,200,210);
		g.drawArc(170,190,50,50,180,180);
		
	}
	
	public static void main(String []args) {
		FrameClass f = new FrameClass();
		f.setTitle("Test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());
	}
}
class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}