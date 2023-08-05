import java.awt.*;
import java.awt.event.*;

public class Radiobutton extends Frame implements ItemListener {
CheckboxGroup cbg = new CheckboxGroup();
Checkbox cb1 = new Checkbox("RED",cbg,true);
Checkbox cb2 = new Checkbox("YELLOW",cbg,false);
Checkbox cb3 = new Checkbox("GREEN",cbg,false);
Radiobutton(){
this.setLayout(new FlowLayout());
add(cb1);
add(cb2);
add(cb3);
this.setBackground(Color.BLACK);
cb1.addItemListener(this);
cb1.setBackground(Color.DARK_GRAY);
cb1.setForeground(Color.WHITE);
cb2.addItemListener(this);
cb2.setBackground(Color.DARK_GRAY);
cb2.setForeground(Color.WHITE);
cb3.addItemListener(this);
cb3.setBackground(Color.DARK_GRAY);
cb3.setForeground(Color.WHITE);
}
public void itemStateChanged(ItemEvent ie) {
	repaint();
}
public void paint(Graphics g) {
		String s = cbg.getSelectedCheckbox().getLabel();
		if(s=="RED") {
			this.setBackground(Color.RED);
			g.drawString("STOP",180,180);
			
		}
		if(s=="GREEN") {
			this.setBackground(Color.GREEN);
			g.drawString("GO",180,180);
			
		}
		if(s=="YELLOW") {
			this.setBackground(Color.YELLOW);
			g.drawString("WAIT",180,180);
			
		}
}
		public static void main(String[] args) {
			Radiobutton rb = new Radiobutton();
			rb.setTitle("RADIOTEST");
			rb.setSize(400,400);
			rb.setVisible(true);
			rb.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		}
}