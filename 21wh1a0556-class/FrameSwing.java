import javax.swing.*;
public class FrameSwing extends JFrame {
	JButton b;
	JLabel l;
	JCheckBox cb;
	JRadioButton rb;
	public static void main(String args[]) {
		
		JFrame frame = new JFrame("My Frame");
		frame.setLayout(null);
        JButton button = new JButton("OK"); 
        frame.add(button); 
        button.setBounds(100,100,100,100);
        JCheckBox checkbox = new JCheckBox("Enable logging");
        checkbox.setBounds(100,200,100,100);
         frame.add(checkbox);
        frame.setBounds(200,100,300,250); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);
	}
}
