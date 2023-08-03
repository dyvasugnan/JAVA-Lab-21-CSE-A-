package javalab;
import javax.swing.*;
import java.awt.*;

public class Swing extends JFrame{

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(400,400);
		jf.setVisible(true);
		Container c = jf.getContentPane();
		c.setBackground(Color.RED);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
