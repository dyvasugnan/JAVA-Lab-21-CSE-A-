package javalab;
import javax.swing.*;
public class SwingBasic extends JFrame {
        JButton b;
	    JLabel l;
	    JCheckBox cb;
	    JRadioButton rb;

	
	public static void main(String args[]) {
		
		JFrame frame = new JFrame("Jframe");
        
		frame.setLayout(null);
        JButton b= new JButton("->"); 
        frame.add(b); 
        b.setBounds(100,100,50,50);
        JCheckBox cb = new JCheckBox("checkbox");
        cb.setBounds(100,200,100,100);
     
        frame.add(cb);

        frame.setBounds(200,100,300,250); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true); 
		 
		
	}
	

}