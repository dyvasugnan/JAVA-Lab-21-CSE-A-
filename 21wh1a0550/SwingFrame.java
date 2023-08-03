package javaclasswork;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
public class SwingFrame extends JFrame implements ActionListener {
	JButton b1;
	JLabel l1;
	public  SwingFrame()
	{
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.RED);
		b1 = new JButton("click me");
		b1.setForeground(Color.GRAY);
		b1.setBounds(100,100,100,50);
		b1.setToolTipText("Sample Button");
		b1.setMnemonic('c');
		c.add(b1);
		b1.addActionListener(this);
		l1 = new JLabel();
		c.add(l1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ImageIcon ii = new ImageIcon("C:\\Users\\mnsin\\OneDrive\\Pictures\\go button.png");
		l1.setIcon(ii);
		l1.setBounds(300,300,150,50);
	}
	public static void main(String args[]) {
		SwingFrame f = new SwingFrame();
		f.setTitle("Test");
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}