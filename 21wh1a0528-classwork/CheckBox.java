import java.awt.*;
import java.awt.event.*;
public class CheckBox extends Frame implements ItemListener {
		String msg = "";
		Checkbox cb1,cb2,cb3;
		CheckBox(){
			this.setLayout(new FlowLayout());
			cb1 = new Checkbox("Choice 1 ",true);
			cb2 = new Checkbox(" Choice 2",false);
			cb3 = new Checkbox("Choice 3");
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
			g.drawString("Current State", 80, 100);
			msg = "Choice 1   :" + cb1.getState();
			g.drawString(msg, 80, 150);
			msg = "Choice 2   :" + cb2.getState();
			g.drawString(msg, 80, 200);
			msg = "Choice 3  :" + cb3.getState();
			g.drawString(msg, 80, 250);
		}
	
	public static void main(String[] args) {
		CheckBox f = new CheckBox();
		f.setTitle("Test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
