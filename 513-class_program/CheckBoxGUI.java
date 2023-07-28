package javalab;
import java.awt.*;// abstract window toolkit
import java.awt.event.*;
public class CheckBoxGUI extends Frame implements ItemListener {
	// Checkbox
	
			String msg = " ";
			Checkbox cb1,cb2,cb3;
			CheckBoxGUI(){
				this.setLayout(new FlowLayout());
				//3 ways to display checkbox
				cb1 = new Checkbox(" ");//Bold
				cb2 = new Checkbox("Italic");
				cb3 = new Checkbox("Underline",true);// state
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
				g.drawString("Current State", 200, 100);
				msg = "Bold   :" + cb1.getState();
				g.drawString(msg, 100, 140);
				msg = "Italic   :" + cb2.getState();
				g.drawString(msg, 100, 180);
				msg = "UnderLine  :" + cb3.getState();
				g.drawString(msg, 100, 220);
			}
		
		public static void main(String[] args) {
			CheckBoxGUI f = new CheckBoxGUI();
			f.setTitle("CHeckbox ");
			f.setSize(400, 400);
			f.setVisible(true);
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		}
	}