//import java.lang.*;
//import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class FrameClass extends Frame{
	public void paint(Graphics g) {
		this.setBackground(Color.DARK_GRAY);
		Font f1 = new Font("Arial",Font.BOLD,30);
		g.setFont(f1);
		g.setColor(Color.white);
		g.drawString("Smiley",100,100);
		g.drawRect(80,100,250,250);
		g.setColor(Color.yellow);
		g.fillOval(100,120, 200, 200);
		g.setColor(Color.black);
		g.fillOval(150, 195, 10, 10);
		g.setColor(Color.black);
		g.fillOval(240,195,10,10);
		g.drawLine(200, 240, 200, 200);
		g.drawArc(130,180,100,100,0,-110);
		
	}



public static void main(String[] args) {
	Frame f = new FrameClass();
	f.setTitle("Test Frame");
	f.setSize(400,400);
	f.setVisible(true);
	f.addWindowListener(new MyClass());
}
}

class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

