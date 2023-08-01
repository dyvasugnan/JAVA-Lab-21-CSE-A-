import java.awt.*;
import java.awt.event.*;

public class Fontcheck extends Frame implements ItemListener {
		String msg = " ";
		Checkbox cb1,cb2,cb3;
		Fontcheck(){
			this.setLayout(new FlowLayout());
			this.setBackground(Color.ORANGE);
			cb1 = new Checkbox("Bold ");//Bold
			cb2 = new Checkbox(" Italic");
			cb3 = new Checkbox("Underline",true);// state
			add(cb1);
			add(cb2);
			add(cb3);
			cb1.setBackground(Color.DARK_GRAY);
			cb1.setForeground(Color.ORANGE);
			cb2.setBackground(Color.DARK_GRAY);
			cb2.setForeground(Color.ORANGE);
			cb3.setBackground(Color.DARK_GRAY);
			cb3.setForeground(Color.ORANGE);
			cb1.addItemListener(this);
			cb2.addItemListener(this);
			cb3.addItemListener(this);
				}
		public void itemStateChanged(ItemEvent ie) {
			
				repaint();
			}
		public void paint(Graphics g) {
			g.drawString("Current State", 100, 100);
			msg = "Bold   :" + cb1.getState();
			g.drawString(msg, 100, 150);
			msg = "Italic   :" + cb2.getState();
			g.drawString(msg, 100, 200);
			msg = "UnderLine  :" + cb3.getState();
			g.drawString(msg, 100, 250);
		}
	
	public static void main(String[] args) {
		Fontcheck fo = new Fontcheck();
		fo.setTitle("Test");
		fo.setSize(500, 500);
		fo.setVisible(true);
		fo.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
