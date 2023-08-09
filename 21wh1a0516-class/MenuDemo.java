import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class NewFrame extends JFrame{
	JTextArea ta= new JTextArea();
	String str,str1;

	NewFrame(String s){
		Container c1 = getContentPane();
		// FlowLayout f = new FlowLayout();
		// c1.setLayout(f);
		c1.add(ta);
		try{
			BufferedReader br = new BufferedReader(new FileReader(s));
			while((str=br.readLine())!=null){
				str1 += str + "\n";
				System.out.println(str);
			}
			ta.setText(str1);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}


public class MenuDemo extends JFrame implements ActionListener {

	Container c = getContentPane();
	JMenuBar jb = new JMenuBar();
	JMenu f = new JMenu("File");
	JMenu e = new JMenu("Exit");
	JMenuItem cl = new JMenuItem("Close");
	JMenuItem op = new JMenuItem("Open");
	JMenuItem cp= new JMenuItem("Copy");
	JMenuItem p = new JMenuItem("Paste");

	void openFile(){
		JFileChooser jc = new JFileChooser();
		int i = jc.showOpenDialog(this);


		if(i==JFileChooser.APPROVE_OPTION){
			File sf = jc.getSelectedFile();
			String pathsf = sf.getAbsolutePath();
			NewFrame nf = new NewFrame(pathsf);
			nf.setVisible(true);
			nf.setSize(600,600);
			nf.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}



	}
	MenuDemo(){
		BorderLayout b = new BorderLayout();

		c.setLayout(b);

		c.add("North",jb);

		jb.add(f);

		jb.add(e);

		f.add(op);

		f.add(cl);

		e.add(cp);

		e.add(p);

		op.addActionListener(this);
		cl.addActionListener(this);
		cp.addActionListener(this);
		p.addActionListener(this);


	}

	public void actionPerformed(ActionEvent ae){
		if(op.isArmed()){
			JOptionPane.showMessageDialog(this,"File OPENED");
			this.openFile();
		}
		else if(cl.isArmed()){
			cl.doClick();
		}




	}




	public static void main(String[] args) {
		MenuDemo md = new MenuDemo();
		md.setSize(600,600);
		md.setVisible(true);
		md.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
