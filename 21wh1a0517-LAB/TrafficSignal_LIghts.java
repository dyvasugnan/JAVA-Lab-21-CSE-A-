package javalab;

import java.awt.*;
import java.awt.event.*;

public class TrafficSignal_LIghts extends Frame implements ItemListener {
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("RED",cbg,true);
		Checkbox cb2 = new Checkbox("YELLOW",cbg,false);
		Checkbox cb3 = new Checkbox("GREEN",cbg,false);
		TrafficSignal_LIghts(){
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
		String s = cbg.getSelectedCheckbox().getLabel();
		if(s=="RED") {
			this.setBackground(Color.RED);
			g.drawString("STOP",100,100);
		}
		if(s=="GREEN") {
			this.setBackground(Color.GREEN);
			g.drawString("GO",100,100);
		}
		if(s=="YELLOW") {
			this.setBackground(Color.YELLOW);
			g.drawString("WAIT",100,100);
		}
	}
	
	public static void main(String[] args) {
		TrafficSignal_LIghts rb = new TrafficSignal_LIghts();
		rb.setTitle("TRAFFICLIGHTS");
		rb.setSize(400,400);
		rb.setVisible(true);
		rb.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
	   });
	}
}
