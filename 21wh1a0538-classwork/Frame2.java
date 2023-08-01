package classprogram;
import java.awt.*;
import java.awt.event.*;
public class Frame2 extends Frame implements ActionListener{
 Button b;
 
 Frame2(){
	 this.setLayout(new FlowLayout());
	 b = new Button("Back");
	 this.add(b);
	 
	 b.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae) {
	 this.dispose();
 }
 public static void main(String args[]) {
	 Frame2 f = new Frame2();
	 f.setTitle("FRAME2");
	 f.setSize(400,400);
	 f.setVisible(true);
	 f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
 }
}
