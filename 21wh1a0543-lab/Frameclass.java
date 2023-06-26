package javalab;

import java.awt.*; // abstract window toolkit
import java.awt.event.*;

public class Frameclass extends Frame {
	public void paint(Graphics g) {
		this.setBackground(Color.cyan);
    	Font f1 = new Font("Arial", "Font",30);
    	g.setFont(f1);
		//this.setBackground(Color.cyan);
		//g.drawRect(100, 100, 200, 50);
		//g.setColor(Color.blue);
		//g.fillRect(200, 200, 200, 50);
		g.drawLine(100, 100, 100, 50);
		g.drawOval(30, 30, 30, 30);
		g.drawOval(30, 30, 30, 30);
		g.drawArc(50, 10, 10, 10, 50, 30);
		g.setColor(Color.yellow);
		g.drawOval(200, 200, 200, 200);
		g.fillOval(100, 100, 100, 100);
	}
	
	public static void main(String args[]) {
		Frame f = new Frameclass();
		f.setTitle("Test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());
	}
}
class Myclass extends WindowAdapter {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
} 

