package moulikaLab;

import java.awt.*;
import java.awt.event.*;

public class MultipleFrame extends Frame implements ActionListener {
	

	
	    Button b1, b2;

	    MultipleFrame() {
	        b1 = new Button("next");
	        b2 = new Button("exit");

	        b1.setBounds(100, 150, 100, 50);
	        b2.setBounds(100, 250, 100, 50);

	        this.add(b1);
	        this.add(b2);

	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        this.setBackground(Color.black);
	 }

	    public void actionPerformed(ActionEvent ae) {
	        String str = ae.getActionCommand();
	        if (str.equals("next")) {
	            Frame2 f2 = new Frame2();
	            f2.setSize(400, 400);
	            f2.setVisible(true);
	            f2.addWindowListener(new WindowAdapter() {
	                public void windowClosing(WindowEvent we) {
	                    System.exit(0);
	                }
	            });
	        } else if (str.equals("exit")) {
	            System.exit(0);
	        }
	    }

	    public static void main(String args[]) {
	        MultipleFrame f = new MultipleFrame();
	        f.setSize(400, 400);
	        f.setLayout(null); 
	        f.setVisible(true);
	    }
	}

	class Frame2 extends Frame implements ActionListener {
	    Button b3;

	    Frame2() {
	        this.setLayout(null); 
	        b3 = new Button("Back");
	        this.setBackground(Color.LIGHT_GRAY);
	        
	        b3.setBounds(100, 250, 100, 50);
	        this.add(b3);
	        b3.addActionListener(this);
	    }

	    public void actionPerformed(ActionEvent ae) {
	        this.dispose();
	    }
	}


