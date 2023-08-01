package classprogram;
import java.awt.*;
import java.awt.event.*;
public class Frame1 extends Frame implements ActionListener {
 Button b1,b2;
 Frame1(){
	 this.setLayout(new FlowLayout());
	 b1 = new Button("next");
	 b2 = new Button("Exit");
	 this.add(b1);
	 this.add(b2);
	 b1.addActionListener(this);
	 b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae) {
	 String s = ae.getActionCommand();
	 if(s=="next") {
		 Frame2 f2 = new Frame2();
		 f2.setSize(400,400);
		 f2.setVisible(true);
		 
	 }
	 else
		 System.exit(0);
 }
  public static void main(String args[]) {
	  Frame1 f = new Frame1();
	  f.setSize(400,400);
	  f.setVisible(true);
	  f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}});}}
  

