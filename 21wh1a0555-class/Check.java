package usha;
import java.awt.*;
import java.awt.event.*;
public class Check extends Frame implements ItemListener{
	String msg = " ";
	Checkbox cb1,cb2,cb3;
	Check(){
		cb1 = new Checkbox("Bold");
		cb2 = new Checkbox("Italic");
		cb3 = new Checkbox("Underline",true);
		this.setLayout(new FlowLayout());
		add(cb1);
		add(cb2);
		add(cb3);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(msg, 100, 200);
		msg = "Italic: "+cb2.getState();
		g.drawString(msg,100,300);
		msg = "Underline: "+cb3.getState();
	}
	public static void main(String[] args) {
		Check c = new Check();
		c.setTitle("Check Box");
		c.setSize(400,400);
		c.setVisible(true);
		c.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}
