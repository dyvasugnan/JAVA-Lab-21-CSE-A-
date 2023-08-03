package SWINGS;

import javax.swing.*;

public class first extends JFrame{
	public static void main(String[] args) {
		JFrame jf = new JFrame("Title");
		jf.setSize(400,400);
		jf.setVisible(true);
		

		JButton b = new JButton("Enter");
		JTextField tf = new JTextField();
		JCheckBox cb = new JCheckBox("Good");
		JRadioButton rb = new JRadioButton("Male");
	JRadioButton rb2 = new JRadioButton("Female");
	ButtonGroup bg = new ButtonGroup();
	bg.add(rb);
	bg.add(rb2);

		b.setBounds(100,100,50,50);
		tf.setBounds(200,100,50,50);
		cb.setBounds(100,200,50,50);
		rb.setBounds(100,300,50,50);
		rb2.setBounds(200,300,50,50);
		//Jpanel j = new Jpanel();


		jf.add(b);
		jf.add(tf);
		jf.add(cb);
		jf.add(rb);
		jf.add(rb2);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
}
