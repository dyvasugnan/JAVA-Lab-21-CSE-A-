package usha;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Image extends Frame implements ActionListener{
	Button l,d,u,r;
	Label l1;
	int x =480,y=100;
	Image(){
		l = new Button("left");
		d = new Button("down");
		u = new Button("up");
		r = new Button("right");
		l1 = new Label();
		this.setLayout(null);
		l.setBounds(400,400,100,50);
		r.setBounds(600,400,100,50);
		u.setBounds(500,300,100,50);
		d.setBounds(500,500,100,50);
		l.addActionListener(this);
		d.addActionListener(this);
		u.addActionListener(this);
		r.addActionListener(this);
		Font f1 = new Font("TimesNewRoman",Font.CENTER_BASELINE,13);
		l.setFont(f1);
		r.setFont(f1);
		u.setFont(f1);
		d.setFont(f1);
		this.add(l);
		this.add(d);
		this.add(r);
		this.add(u);
		this.add(l1);
	}
	public void paint(Graphics g) {
		g.setColor(Color.magenta);
		g.fillOval(x,y,100,100);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str=="left") {
			x = x-100;
			repaint();
		}
		if(str=="right") {
			x = x+100;
			repaint();
		}
		if(str=="up") {
			y = y-70;
			repaint();
		}
		if(str=="down") {
			y = y+70;
			repaint();
		}
	}
	public static void main(String[] args) {
		Image f = new Image();
		f.setTitle("MovableImage");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}
