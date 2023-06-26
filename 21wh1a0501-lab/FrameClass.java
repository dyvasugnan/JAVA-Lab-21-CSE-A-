package javalab;
import java.awt.*;//abstract window toolkit
import java.awt.event.*;

public class FrameClass extends Frame {
	public void paint(Graphics g) {
		this.setBackground(Color.white);
		g.setColor(Color.cyan);
		g.fillRect(100,  200,  500,  500);
		g.setColor(Color.yellow);
		g.fillOval(200, 300, 300, 300);
		g.setColor(Color.black);
		g.fillOval(400, 400, 30, 30);
		g.fillOval(275, 400, 30, 30);
		g.fillOval(315, 500, 80, 20);
		Font plainFont = new Font("Serif", Font.PLAIN + Font.ITALIC + Font.BOLD, 24);        
	    g.setFont(plainFont);
	    g.drawString("hello", 640, 100);
	}
	
	public static void main(String[] args) {
		Frame f = new FrameClass();
		f.setTitle("Test");
		f.setSize(500, 500);
		f.setVisible(true);
		f.addWindowListener(new MyClass());//anonymus object
		
	}

}

class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}

