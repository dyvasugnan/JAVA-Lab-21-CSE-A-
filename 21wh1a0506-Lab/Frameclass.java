import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

//abstract window toolkit

public class Frameclass extends Frame{
	public void paint(Graphics g) {
		this.setBackground(Color.black);
		g.setColor(Color.WHITE);
		Font f1 = new Font("Monospaced", Font.BOLD, 30);
		g.setFont(f1);
		g.drawString("Smiley", 140, 80);
		g.setColor(Color.gray);
		g.fillRect(77, 100, 250, 250);
		g.setColor(Color.yellow);
		g.fillOval(100, 120, 200, 200);
		g.setColor(Color.BLACK);
		g.fillOval(150, 195, 10, 10);
		g.setColor(Color.BLACK);
		g.fillOval(240, 195, 10, 10);
		g.setColor(Color.BLACK);
		g.drawLine(200,210,200,250);
		g.setColor(Color.BLACK);
		g.drawArc(162, 182, 100, 100, -0, -110);
		
}
	public static void main(String[] args) {
		Frame f = new Frameclass();
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());
	}
}

class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}