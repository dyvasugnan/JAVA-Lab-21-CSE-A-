package classprogram;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceAwt extends Frame implements ItemListener {
	Choice ch;
	String choice;
	ChoiceAwt(){
		this.setLayout(null);
		ch = new Choice();
		ch.add("CSE");
		ch.add("IT");
		ch.add("ECE");
		ch.add("EEE");
		ch.setBounds(100,100,100,50);
		this.add(ch);
		ch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
		choice = ch.getSelectedItem();}
	public void paint(Graphics g) {
		g.drawString(choice,200, 200);
	}
	public static void main(String[] args) {
		ChoiceAwt f = new ChoiceAwt();
	    f.setSize(400,500);
	    f.setTitle("FRAME 1");
	    f.setVisible(true);
	    f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	                System.exit(0);
	            }
	        });
	}
}
