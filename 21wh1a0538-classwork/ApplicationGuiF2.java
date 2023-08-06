package classprogram;
import java.awt.*;
import java.awt.event.*;
public class ApplicationGuiF2 extends Frame  implements ActionListener{
	ApplicationGui f1;
//Label l22;
//TextField tf2,ch2;
//Label l2,chl,lan;
//TextField t2;
//TextArea ta;
//TextField te,en,hind;
//	String namelab,name,bl,branch,languagelab,lan1,lan2,lan3,genlab,gen,prolab,plan1,plan2,plan3;
	
ApplicationGuiF2(ApplicationGui f1){
	this.f1 = f1;
}	
//ApplicationGuiF2(){
//	this.setLayout(null);
//	l22 = new Label("NAME");
//	l2 = new Label("SURNAME");
//	chl = new Label("BRANCH");
//	tf2 = new TextField();
//	t2 = new TextField();
//	ch2 = new TextField();
//	ta = new TextArea();
//	l22.setBounds(100, 150, 100, 50);
//	tf2.setBounds(200, 150, 100, 50);
//	ch2.setBounds(200, 250, 100, 50);
//	chl.setBounds(100,250,100,50);
//	ta.setBounds(200,300,100,50);
//	this.add(l22);
//	this.add(tf2);
//	this.add(chl);
//	this.add(ch2);
//	tf2.addActionListener(this);
//	ch2.addActionListener(this);
//	
//}
public void actionPerformed(ActionEvent ae) {
	
}
public void itemStateChanged(ItemEvent ie) {
	repaint();}
public void paint(Graphics g) {
	g.drawString(f1.l.getText(),100, 150);
	g.drawString(f1.tf.getText(),200,150);
	g.drawString(f1.br.getText(),100,200);
	g.drawString(f1.ch.getSelectedItem(),200, 200);
	g.drawString(f1.lan.getText(),100, 250);
	if(f1.cb1.getState())
	g.drawString(f1.cb1.getLabel(),200,250);
	if(f1.cb2.getState())
	g.drawString(f1.cb2.getLabel(),250,250);
	if(f1.cb3.getState())
	g.drawString(f1.cb3.getLabel(),300,250);
	g.drawString(f1.cblab.getText(),100,300);
	g.drawString(f1.cg.getSelectedCheckbox().getLabel(),200, 300);
	g.drawString(f1.prolan.getText(),100,350);
	String data = " ";
	for(String i:f1.list.getSelectedItems())
		data+=i;
	g.drawString(data,200,350);
}
//public void itemStateChanged(ItemEvent ie) {
//	
//}
//public static void main(String[] args) {
//	ApplicationGuiF2 c = new ApplicationGuiF2();
//    c.setSize(400,500);
//    c.setTitle("CALCULATOR");
//    c.setVisible(true);
//    c.addWindowListener(new WindowAdapter() {
//        public void windowClosing(WindowEvent we) {
//                System.exit(0);
//            }
//        });
//}
}
