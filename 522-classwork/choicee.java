package javaclass;
import java.awt.*;    
import java.awt.event.*;   

public class choicee implements ItemListener {
	choicee(){
		Frame f =new Frame();
		f.setSize(400,400);
	    f.setLayout(null);    
	    f.setVisible(true); 
		Choice dept=new Choice();
		dept.setBounds(100,150,200,250);
		dept.add("CSE");
		dept.add("IT");
		dept.add("EEE");
		dept.add("ECE");
		dept.add("CSBS");
		
		f.add(dept);	
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public static void main(String args[])    {    
	   new choicee();    
	}    
	} 