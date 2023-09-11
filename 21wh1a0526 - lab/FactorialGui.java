package JavaClass;

import java.awt.*;
import java.awt.event.*;

public class Factorial extends Frame implements ActionListener {
	Button b1,b2;
    TextField t1,t2;
    Factorial(){
    	this.setLayout(null);
    	b1 = new Button("compute");
    	b2 = new Button("clear");
    	t1 = new TextField();
    	t2 = new TextField();
    	t1.setBounds(100,100,100,50);
    	t2.setBounds(200,100,100,50);
    	b1.setBounds(100,200,100,50);
    	b2.setBounds(200,200,100,50);

    	this.add(t1);
    	this.add(t2);
    	this.add(b1);
    	this.add(b2);
    	t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
    	String str = ae.getActionCommand();
    	if(str=="compute") {
    		int n = Integer.parseInt(t1.getText());
    		int fact = 1;
    		for(int i = 1;i<=n;i++) {
    			fact = fact*i;
    		}
    		t2.setText(String.valueOf(fact));
    	}
    	else if(str=="clear") {
    		t1.setText("0");
    		t2.setText(" ");
    	}
    }
    public static void main(String args[]) {
    	Factorial f = new Factorial();
    	f.setSize(400,400);
    	f.setVisible(true);
    	f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

    }
}
