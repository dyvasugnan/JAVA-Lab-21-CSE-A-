package javagui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ImageMover extends JFrame implements ActionListener{
	JButton up, down, left, right;
	JLabel image;
	int x = 250, y = 150;
	ImageMover(){
		Container c = getContentPane();
		c.setLayout(null);
		up = new JButton("Up");
		down = new JButton("Down");
		left = new JButton("Left");
		right = new JButton("Right");
		up.setBounds(250,350,100,50);
		down.setBounds(250,450,100,50);
		left.setBounds(150,400,100,50);
		right.setBounds(350,400,100,50);
		this.add(up);
		this.add(down);
		this.add(right);
		this.add(left);
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
		image = new JLabel(); 
	    image.setIcon(new ImageIcon("tetris.jpeg")); 
	    image.setBounds(x, y, 500, 500); 
	    c.add(image);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Up") {
			y -= 20;
			image.setBounds(x, y, 200, 200);
		}
		if(str == "Down") {
			y += 20;
			image.setBounds(x, y, 200, 200);
		}
		if(str=="Left") {
			x -= 20;
			image.setBounds(x, y, 200, 200);
		}
		if(str=="Right") {
			x += 20;
			image.setBounds(x, y, 200, 200);
		}
	}
	public static void main(String args[]) {
		ImageMover i = new ImageMover();
		i.setSize(600,600);
		i.setVisible(true);
		i.setBackground(Color.WHITE);
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}