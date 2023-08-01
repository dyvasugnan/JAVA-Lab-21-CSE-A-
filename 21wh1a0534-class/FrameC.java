package java_labcodes;
import java.awt.*;
import java.awt.event.*;

public class FrameC extends Frame implements ActionListener, ItemListener{
	
	Button b1;
	Checkbox cb;
	FrameC()
	{
		b1 = new Button("Red");
		cb = new Checkbox("Black");
		add(b1);
		add(cb);
		this.setLayout(null);
		b1.setBounds(100,100,100,20);
		cb.setBounds(200, 200, 100, 20);
		b1.addActionListener(this);
		cb.addItemListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			this.setBackground(Color.RED);
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource() == cb)
		{
			this.setBackground(Color.BLACK);
		}
	}
	
	public static void main(String[] args) {
		FrameC  f = new FrameC();
		f.setSize(450, 450);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		}
	}
