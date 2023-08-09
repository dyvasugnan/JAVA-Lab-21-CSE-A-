package usha;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {
	Container c;
	JMenuBar mb;
	JMenu file,edit,source;
	JMenuItem open,exit;

	public Menu() {
		// TODO Auto-generated constructor stub
		c= getContentPane();
		mb = new JMenuBar();
		c.add("North",mb);

		file = new JMenu();
		edit= new JMenu();
		source = new JMenu();
		mb.add(file);
		mb.add(edit);
		mb.add(source);

		open =new JMenuItem();
		exit=new JMenuItem();
		file.add(open);
		file.add(exit);

	}
	public void actionPerformed(ActionEvent ae) {
		if(open.isArmed()) {
			JOptionPane.showMessageDialog(this, "file opened");
		}
		if(exit.isArmed()) {
			this.dispose();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu f=new Menu();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}