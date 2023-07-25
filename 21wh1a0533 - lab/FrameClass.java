package javaclass;
import java.lang.*;
import java.util.*;
import java.awt.*; // abstract window toolkit
import java.awt.event.*;
public class FrameClass extends Frame{
	public void paint(Graphics g) {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.black);
		Font f = new Font("Arial",Font.BOLD,30);
		g.setFont(f);
		g.drawString("EMOJI FACE",200,100);
		//g.drawRect(100,100,500,50);
		g.drawOval(100,100,200,200);
		g.setColor(Color.cyan);
		g.fillOval(100,100,200,200);
		g.drawOval(180, 180, 20, 20);
		g.setColor(Color.black);
		g.fillOval(150, 150, 20, 20);
		g.fillOval(220, 150, 20, 20);
		g.setColor(Color.black);
		g.drawLine(200, 220, 200, 200);
		g.setColor(Color.black);
		g.drawArc(150, 250, 100, 100, 40, 100);
	}
	public static void main(String[] args){
		FrameClass f=new FrameClass();
		//f.setTitle("");
		
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());
	}
}
class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
