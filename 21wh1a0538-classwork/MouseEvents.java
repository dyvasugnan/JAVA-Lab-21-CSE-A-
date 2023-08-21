package classprogram;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.*;
public class MouseEvents extends JFrame implements MouseListener,MouseMotionListener {
JPanel p1,p2;
JLabel l1;
JTextArea ta;
String str = " ";
MouseEvents(){
	Container c = getContentPane();
	p1 = new JPanel(new FlowLayout());
	p2 = new JPanel(new FlowLayout());
	c.add(p1,BorderLayout.NORTH);
	c.add(p2,BorderLayout.CENTER);
	l1 = new JLabel("MOUSE EVENTS");
	ta = new JTextArea(20,5);
	p1.add(l1);
	p2.add(ta);
	ta.addMouseListener(this);
	ta.addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me) {
	str = "X-CORD"+me.getX()+"Y-CORD"+me.getY();
	ta.setText(str);
	
}
public void mouseEntered(MouseEvent me) {
	
}
public void mouseDragged(MouseEvent me) {
	
}
public void mouseMoved(MouseEvent me) {
	
}
public void mouseExited(MouseEvent me) {
	
}
public void mousePressed(MouseEvent me) {
	
}
public void mouseReleased(MouseEvent me) {
	
}
public static void main(String args[]) {
	MouseEvents f = new MouseEvents();
	f.setSize(400,400);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
