package javalab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ClassTest extends JFrame implements ActionListener {
	JButton l,r,u,d;
	int x,y;
	ClassTest() {
		Container c = getContentPane();
		 x=260;
		 y=120;
		c.setLayout(null);
		l = new JButton("left");
		r = new JButton("right");
		u = new JButton("up");
		d = new JButton("down");
		l.setBounds(180,250,100,50);
		r.setBounds(290,250,100,50);
		u.setBounds(230,190,100,50);
		d.setBounds(230,310,100,50);
		c.add(l);
		c.add(r);
		c.add(u);
		c.add(d);
		l.addActionListener(this);
        r.addActionListener(this);
        u.addActionListener(this);
        d.addActionListener(this);
		l.setActionCommand("l");
        r.setActionCommand("r");
        u.setActionCommand("u");
        d.setActionCommand("d");
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		//g.drawOval(260,100,50,50);
		g.fillOval(x,y,50,50);
    }
	public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str=="l") {
        	x-=100;
        	repaint();
        }
        if(str=="r") {
        	x+=100;
        	repaint();
        }
        if(str=="u") {
        	y-=100;
        	repaint();
        }
        if(str=="d") {
        	y+=100;
        	repaint();
        }
        
    }
	public static void main(String[] args) {
		ClassTest f = new ClassTest();
		f.setTitle("Test");
		f.setSize(600, 600);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}