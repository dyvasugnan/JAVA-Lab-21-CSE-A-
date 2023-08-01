package javaclass;
import java.awt.*;
import java.awt.event.*;
public class Radiobutton extends Frame implements ItemListener,ActionListener{
	Button b;
	Checkbox c1,c2,c3;
	CheckboxGroup cbg;
	Radiobutton(){
		this.setLayout(new FlowLayout());
		cbg=new CheckboxGroup();

		b = new Button("START");
		
		c1=new Checkbox("RED",cbg,false);
		c2=new Checkbox("YELLOW",cbg,false);
		c3=new Checkbox("GREEN",cbg,false);
		
		b.setBounds(30,100,200,30);
		c1.setBounds(30, 150, 200, 30);
		c2.setBounds(30, 250, 200, 30);
		c3.setBounds(30, 350, 200, 30);
		
		this.add(b);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		b.addActionListener(this);
	
		}

public void itemStateChanged(ItemEvent e) {
	repaint();
}

public void paint(Graphics g) {
	String str=cbg.getSelectedCheckbox().getLabel();
	if(str=="RED") {
		this.setBackground(Color.RED);
	}	
	if(str=="YELLOW") {
		this.setBackground(Color.YELLOW);
	}
	if(str=="GREEN") {
		this.setBackground(Color.GREEN);
	}
}
public static void main(String[]args) {
	Radiobutton f = new Radiobutton();
	f.setTitle("TRAFFIC SIGNAL");
	f.setSize(500,500);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}