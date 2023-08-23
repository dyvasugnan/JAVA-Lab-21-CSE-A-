import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class SwingImp extends JFrame implements ActionListener{
	JButton b1;
	JLabel l1;
	SwingImp(){
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.RED);
		b1 = new JButton("Click");
		b1.setForeground(Color.GREEN);
		b1.setToolTipText("Sample Button");
		b1.setBounds(100, 100, 100, 50);
		b1.setMnemonic('c');
		b1.setEnabled(true);
		c.add(b1);
		b1.addActionListener(this);
		l1 = new JLabel();
		c.add(l1);
	}
	public void actionPerformed(ActionEvent ae) {
		ImageIcon i = new ImageIcon('image.png');
		l1.setIcon(i);
		l1.setBounds(200,200,100,100);
	}
	public static void main(String args[]) {
		SwingImp s = new SwingImp();
		s.setTitle("Window");
		s.setSize(500,500);
		s.setVisible(true);
		s.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
