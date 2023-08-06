import java.awt.*;
import java.awt.event.*;
public class FrameClass extends Frame implements ItemListener {
		String msg = " ";
		Checkbox cb1,cb2,cb3;
		FrameClass(){
			this.setLayout(new FlowLayout());
			cb1 = new Checkbox("Bold ");
			cb2 = new Checkbox(" Italic");
			cb3 = new Checkbox("Underline",true);
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
			g.drawString("Current State", 100, 100);
			msg = "Bold   :" + cb1.getState();
			g.drawString(msg, 100, 200);
			msg = "Italic   :" + cb2.getState();
			g.drawString(msg, 100, 300);
			msg = "UnderLine  :" + cb3.getState();
			g.drawString(msg, 100, 400);
		}
	
	public static void main(String[] args) {
		FrameClass f = new FrameClass();
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