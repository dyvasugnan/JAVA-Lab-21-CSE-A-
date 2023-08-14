package classprogram;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import java.util.*;

public class FileCopyProgressBar extends JFrame implements ActionListener{
JMenuBar mb;
JMenu f;
JMenuItem op;

FileCopyProgressBar(){
	Container c = getContentPane();
	c.setLayout(new BorderLayout());
	mb = new JMenuBar();
	f = new JMenu("file");
	op = new JMenuItem("open");
	mb.add(f);
	f.add(op);
	c.add("North",mb);
//	c.add("center",b);
	op.addActionListener(this);
	
}
public void actionPerformed(ActionEvent ae) {
	if(op.isArmed())
		this.openFile();
}
public void openFile() {
	JFileChooser jc = new JFileChooser();
	int i = jc.showOpenDialog(this);
	if(i==jc.APPROVE_OPTION) {
	File f = jc.getSelectedFile();
	String str = f.getPath();
	 NewFrame nf = new NewFrame(str);
	 nf.setSize(400,400);
		nf.setVisible(true);
		nf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public static void main(String args[]) {
	FileCopyProgressBar f = new FileCopyProgressBar();
	f.setSize(400,400);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
