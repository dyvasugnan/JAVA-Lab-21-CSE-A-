package frameinterface;

import java.awt.*;
import java.awt.event.*;

public class Myclass extends Frame implements ActionListener, ItemListener{
	
	Button b1;
	Checkbox c;
	Myclass()
	{
		b1 = new Button("Red");
		c = new Checkbox("Black");
		
		add(b1);
		add(c);
		this.setLayout(new FlowLayout());
		//b1.setBounds(50, 50, 100, 20);
		//c.setBounds(MAXIMIZED_BOTH, ABORT, WIDTH, HEIGHT);
		
		b1.addActionListener(this);
		c.addItemListener(this);
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
		if(ie.getSource() == c)
		{
			this.setBackground(Color.BLACK);
		}
	}
	
	/*public void paint(Graphics g)
	{
		if(g.getLabel())
		{
			
		}
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m = new Myclass();
		m.setSize(400, 400);
		m.setVisible(true);
		m.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
	}

}
