package usha;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

import javax.swing.JOptionPane;
public class RegForm extends Frame implements ActionListener{
	Label l,f,l1,g,b,k;
	TextField t1,t2;
	Button d;
	RegForm(){
	this.setLayout(null);
	Choice Branch = new Choice();
	this.add(Branch);
	Branch.add("CSE");
	Branch.add("IT");
	Branch.add("AIML");
	Branch.add("ECE");
	Branch.add("EEE");
	l = new Label("Lname");
	f = new Label("Fname");
	b = new Label("Branch");
	l1 = new Label("Languages Known");
	k = new Label("Programming Languages");
	Checkbox cb1 = new Checkbox("T");
	Checkbox cb2 = new Checkbox("H");
	Checkbox cb3 = new Checkbox("E");
	d = new Button("Submit");
	t1 = new TextField();
	t2 = new TextField();
	g = new Label("Gender");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox cb4 = new Checkbox("Male",cbg,false);
	Checkbox cb5 = new Checkbox("Female",cbg,false);
	List ProgrammingLanuages = new List();
	this.add(ProgrammingLanuages);
	ProgrammingLanuages.add("C");
	ProgrammingLanuages.add("C++");
	ProgrammingLanuages.add("Python");
	ProgrammingLanuages.add("Java");
	ProgrammingLanuages.add("Haskell");
	ProgrammingLanuages.add("C#");
	this.add(l);
	this.add(f);
	this.add(l1);
	this.add(g);
	this.add(t1);
	this.add(t2);
	this.add(d);
	this.add(cb1);
	this.add(cb2);
	this.add(cb3);
	this.add(cb4);
	this.add(cb5);
	this.add(b);
	this.add(k);
	t1.setBounds(200,150,150,50);
	t2.setBounds(500,150,150,50);
	l.setBounds(100,150,100,50);
	f.setBounds(400,150,100,50);
	b.setBounds(100,210,100,50);
	Branch.setBounds(200,220,100,50);
	l1.setBounds(100,250,150,50);
	cb1.setBounds(250,250,100,50);
	cb2.setBounds(350,250,100,50);
	cb3.setBounds(450,250,100,50);
	g.setBounds(100,300,100,50);
	cb4.setBounds(200,300,100,50);
	cb5.setBounds(300,300,100,50);
	k.setBounds(100,350,200,50);
	ProgrammingLanuages.setBounds(300,350,100,50);
	d.setBounds(230,450,100,50);
	Font f1 = new Font("TimesNewRoman",Font.BOLD,13);
	l.setFont(f1);
	f.setFont(f1);
	l1.setFont(f1);
	g.setFont(f1);
	d.setFont(f1);
	cb1.setFont(f1);
	cb2.setFont(f1);
	cb3.setFont(f1);
	cb4.setFont(f1);
	cb5.setFont(f1);
	 b.setFont(f1);
	 k.setFont(f1);
	
	d.addActionListener(this);
	}
	public void itemChangedState(ItemEvent ie) {
		repaint();
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str=="Submit") {
			int result =JOptionPane.showConfirmDialog(this,"Are you sure want to submit the form?");
			if (result == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(this,"You submitted the form");
	        }
		}
	}
	public static void main(String[] args) {
		RegForm r = new RegForm();
		r.setTitle("Registration Form");
		r.setVisible(true);
		r.setSize(400,400);
		r.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
