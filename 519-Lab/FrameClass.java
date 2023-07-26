package java_codes;
import java.awt.*;
import java.awt.event.*;
public class FrameClass extends Frame{
	public void paint(Graphics g) {
		this.setBackground(Color.gray);
		//g.drawRect(100, 100, 200, 50);
		g.setColor(Color.white);
		g.fillRect(100, 100, 200,200);
		g.setColor(Color.yellow);
		g.fillOval(100, 100,200, 200);
		g.setColor(Color.black);
		g.fillOval(150,150,25,25);
		g.fillOval(230,151,25,25);
		g.fillRect(200, 190, 10, 25);
		g.fillOval(165, 240, 75, 10);
		Font f = new Font("Arial",Font.BOLD,20);
		}
		public static void main(String[] args) {
		FrameClass f = new FrameClass();
		f.setTitle("test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new Myclass());//anonymous object
		}
		}
		class Myclass extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
		System.exit(0);
		}

}
