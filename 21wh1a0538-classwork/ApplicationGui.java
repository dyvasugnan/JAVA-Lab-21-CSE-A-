package classprogram;
import java.awt.*;
import java.awt.event.*;
public class ApplicationGui extends Frame implements ActionListener,ItemListener {
ApplicationGuiF2 f2;
TextField tf;
TextField ts;
Label l,s,br,lan,cblab,prolan;
Choice ch;
String name;
String name2,choice;
Button b;
Checkbox cb1,cb2,cb3;
CheckboxGroup cg;
Checkbox cb4;
Checkbox cb5;
String msg1,msg2,msg3;
List list;
ApplicationGui(){
	this.setLayout(null);
	
	tf = new TextField();
	ts = new TextField();
	l = new Label("NAME : ");
	s =new Label("SERNAME : ");
	b = new Button("enter");
	br = new Label("BRANCH : ");
	lan = new Label("LANGUAGE : ");
	cblab = new Label("GENDER : ");
     prolan = new Label("PROG LAN :");
	ch = new Choice();
	cb1 = new Checkbox("Telugu");
	cb2 = new Checkbox("Hindhi");
	cb3 = new Checkbox("English");
	cg = new CheckboxGroup();
	cb4 = new Checkbox("Female",cg,false);
	cb5 = new Checkbox("male",cg,false);
    list = new List(5);
	l.setBounds(100, 50, 100, 50);
	tf.setBounds(200, 50, 100,30);
	b.setBounds(200,350,50,50);
	br.setBounds(100,100,100,50);
	ch.setBounds(200,100,100,50);
	cb1.setBounds(200,200,100,50);
	cb2.setBounds(300,200,100,50);
	cb3.setBounds(400,200,100,50);
	lan.setBounds(100,200,100,50);
	cblab.setBounds(100,250,100,50);
	cb4.setBounds(200,250,100,50);
	cb5.setBounds(300,250,100,50);
	prolan.setBounds(100,300,100,50);
	list.setBounds(200,300,100,50);
	ch.add("CSE");
	ch.add("IT");
	ch.add("ECE");
	ch.add("EEE");
	list.add("c");
	list.add("java");
	list.add("python");
	list.add("haskel");
	list.add("sql");
	this.add(l);
	this.add(tf);
	this.add(b);
	this.add(s);
	this.add(ts);
	this.add(br);
	this.add(ch);
	this.add(cb1);
	this.add(cb2);
	this.add(cb3);
	this.add(lan);
	this.add(cblab);
	this.add(cb4);
	this.add(cb5);
	this.add(list);
	this.add(prolan);
	tf.addActionListener(this);
	b.addActionListener(this);
	ch.addItemListener(this);
	cb1.addItemListener(this);
	cb2.addItemListener(this);
	cb3.addItemListener(this);
	cb4.addItemListener(this);
	cb5.addItemListener(this);
	list.addItemListener(this);
}
public void actionPerformed(ActionEvent ae) {
 String s = b.getActionCommand();
 name = tf.getText();
 f2 = new ApplicationGuiF2(this);
 f2.setSize(400,500);
 f2.setTitle("FRAME 2");
 f2.setVisible(true);
 f2.addWindowListener(new WindowAdapter() {
     public void windowClosing(WindowEvent we) {
             System.exit(0);
         }
     });
// f2.tf2.setText(name);
// f2.ch2.setText(choice);
// f2.namelab="name";
// f2.name = name;
// f2.bl = br.getText();
// f2.branch = choice;
// f2.languagelab = lan.getText();
// f2.lan1 = "telugu";
}
public void itemStateChanged(ItemEvent ie) {
	repaint();
	choice = ch.getSelectedItem();}
//	public void paint(Graphics g) {
////		msg1 = cb1.getLabel()+" "+ cb1.getState();
////		msg2 = cb2.getLabel()+" "+ cb2.getState();
////		msg3 = cb3.getLabel()+" "+cb3.getState();
//////		g.drawString(, MAXIMIZED_BOTH, ABORT);
//		if(cb1.getState()) 
//			f2.lan1 = cb1.getLabel();
//		
//		else
//			f2.lan1 = "haihello ";
//		 if(cb2.getState())
//			f2.lan2 = cb2.getLabel();
//		 else
//			 f2.lan2 = " ";
//		 if(cb3.getState())
//			f2.lan3 = cb3.getLabel();
//		 else
//			 f2.lan3= " ";
//			
//	}
	

public static void main(String[] args) {
	ApplicationGui f = new ApplicationGui();
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

