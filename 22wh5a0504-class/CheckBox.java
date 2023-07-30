package gui;

import java.awt.*;
import java.awt.event.*;

public class CheckBox extends Frame implements ItemListener{
	
	String msg = "";
	Checkbox c1, c2, c3;
	CheckBox()
	{
		this.setLayout(new FlowLayout());
		c1 = new Checkbox("Bold");
		c2 = new Checkbox("Italic");
		c3 = new Checkbox("UnderLine");
		add(c1);
		add(c2);
		add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		msg = "Bold: " + c1.getState();
		g.drawString(msg, 100, 100);
		msg = "Italic: " + c2.getState();
		g.drawString(msg, 100, 200);
		msg = "UnderLine: " + c3.getState();
		g.drawString(msg, 100, 300);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox c = new CheckBox();
		c.setSize(800, 800);
		c.setTitle("CheckBox Demo");
		c.setVisible(true);
		c.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

}
