package javalab;

import java.awt.*;
import java.awt.event.*;

public class SmileyFace extends Frame {
	    public void paint(Graphics g) {
	    	
	        g.setColor(Color.yellow);
	        g.fillOval(100, 100, 200, 200);
	        
	        g.setColor(Color.black);
	        g.fillOval(155, 175, 15, 25); // left eye
	        g.fillOval(230, 175, 15, 25); // right eye
	        
	        g.drawArc(150, 230, 100, 50, 180, 180); // smile
	    }
	    
	    public static void main(String args[]) {
	        Frame f = new SmileyFace();
	        f.setTitle("Smiley Face");
	        f.setSize(400, 400);
	        f.setVisible(true);
	        f.addWindowListener(new Myclass());
	    }
	}

 class Myclass extends WindowAdapter {
	    public void windowClosing(WindowEvent we) {
	        System.exit(0);
	    }
	}
	