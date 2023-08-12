package javalab;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Timer.*;

public class Task extends JFrame implements ActionListener{
	JButton left,right,up,down;
	int x,y;
	ImageIcon ii;
	JLabel l;
	
	
	

	public Task() {
		Container c=getContentPane();
		left = new JButton("left");
		right = new JButton("right");
		up = new JButton("up");
		down = new JButton("down");
		l=new JLabel(new ImageIcon("C:\\Users\\ammu2\\Documents\\New folder (2)\\java files\\javalab\\src\\javalab\\sm.jpg"));
		
		
		x=900;
		y=380;
		
		c.setLayout(null);
		c.setBackground(Color.cyan);
		up.setBounds(200,100,100,100);
		left.setBounds(100,300,100,100);
		right.setBounds(300,300,100,100);
		down.setBounds(200,500,100,100);
		c.add(up);
		c.add(left);
		c.add(right);
		c.add(down);
		c.add(l);
		
		up.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		down.addActionListener(this);
		
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		l.setBounds(x,y,200,200);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		//ImageIcon ii=new ImageIcon("C:\\Users\\ammu2\\Documents\\New folder (2)\\java files\\javalab\\src\\javalab\\sm.jpg");
		if(str=="up") {
			//g.fillOval(900, 380, 100, 100);
			y-=280;
			
			repaint();
			
		}
		if(str=="down") {
			y+=280;
			
			repaint();

		}
		if(str=="left") {
			x-=280;
			
			repaint();
		}
		if(str=="right") {
			x+=280;
			
			repaint();
		}
		
	}

	public static void main(String[] args) {
		Task f= new Task();
		f.setSize(500,500);
		f.setTitle("task");
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}
