package javalab;

import javax.swing.*;
import java.awt.*;

public class FrameSwing extends JFrame {
	public static void main(String [] args) {
		JFrame jf=new JFrame();
	
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setTitle("FirstWindow");
	
		Container c=jf.getContentPane();
		c.setBackground(Color.BLACK);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}