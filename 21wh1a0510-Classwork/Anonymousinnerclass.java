import java.awt.*;
import java.awt.event.*;
public class Anonymousinnerclass extends Frame{
public static void main(String[] args) {
	Anonymousinnerclass f = new Anonymousinnerclass();
	f.setTitle("Test");
	f.setSize(400,400);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}
