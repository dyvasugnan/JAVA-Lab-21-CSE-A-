package javalab;
import java.awt.*;
import java.awt.event.*;
public class MyFrame {
	public static void main(String args[]) {
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(500,300);
		f.setTitle("First Frame");
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}
// using constructor
/*class MyFrame extends Frame{
	MyFrame(){
		setVisible(true);
		setSize(500,300);
		setTitle("Window");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
public static void main(String args[]) {
	new MyFrame();// is used to create the new object for MyFrame class	
}
}*/

