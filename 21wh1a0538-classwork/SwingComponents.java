package javaclass;
import javax.swing.*;
public class SwingComponents extends JFrame {
	JButton b;
	JLabel l;
	JCheckBox cb;
	JRadioButton rb;
//	Container c;
//	SwingComponents(){
//		this.setLayout(null);
//		b = new JButton("button");
//		l = new JLabel("label");
//		cb = new JCheckBox("checkbox");
//		rb = new JRadioButton("radiobutton");
//		b.setBounds(100,100,50,100);
//		b.setBounds(200,100,50,100);
//		b.setBounds(300,100,50,100);
//		b.setBounds(350,100,50,100);
//		this.add(b);
//		this.add(l);
//		this.add(cb);
//		this.add(rb);
//		
//	}
	public static void main(String args[]) {
		
		JFrame frame = new JFrame("Add Components to JFrame Java Example");
		frame.setLayout(null);
        JButton button = new JButton("OK"); 
        frame.add(button); 
        button.setBounds(100,100,100,100);
        JCheckBox checkbox = new JCheckBox("Enable logging");
        checkbox.setBounds(100,200,100,100);
     // add to a container
     frame.add(checkbox);

        frame.setBounds(200,100,300,250); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true); 
		 
		
	}
	

}
