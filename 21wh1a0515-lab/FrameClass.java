package javalab;

//import java.lang.*;
//import java.util.*;
import java.awt.*;//abstract window toolkit (delete modulo info if errors are occuring near awt
import java.awt.event.*;
public class FrameClass extends Frame{
	public void paint(Graphics g) {
		this.setBackground(Color.cyan);
		//Font f1=new Font("Arial","Italic.Bold",30);
		//g.setFont(f1);
		//g.drawRect(100, 100, 200,50);
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 200, 200);
		g.setColor(Color.black);
		g.fillOval(150, 150, 20, 20);
		g.fillOval(230, 150, 20, 20);
		g.drawLine(200, 180, 200, 200);
		g.drawArc(160, 200, 100, 60, 100, 200);
		//g.fillRect(200, 200, 200, 50);
		
	}


	public static void main(String[] args) {
		//Frame f=new Frame("My first Frame");
		Frame f=new FrameClass();
		//f.setTitle("Test");
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
