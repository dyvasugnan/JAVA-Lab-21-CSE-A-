import java.awt.*;
import java.awt.event.*;
public class ColourChange extends Frame implements ActionListener {
	
	Button b1,b2,b3;
	
	ColourChange(){
		
		this.setLayout(null);
		b1 = new Button("Orange");
		b2 = new Button("Cyan");
		b3 = new Button("Pink");
		
		//this.setLayout(new FlowLayout());//horizontally buttons are set
		
		b1.setBounds(100,150,100,50); 
		b2.setBounds(100,250,100,50);
		b3.setBounds(100,350,100,50);
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this); 
		b2.addActionListener(this);
		b3.addActionListener(this);


	}
	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		if(str=="Orange")
			this.setBackground(Color.orange);
		if(str=="Cyan")
			this.setBackground(Color.cyan);
		if(str=="Pink")
			this.setBackground(Color.pink);
	}


	public static void main(String[] args) {
	  
		ColourChange c = new ColourChange();
		c.setTitle("Change Colour");
		c.setSize(500,500);
		c.setVisible(true);
		c.addWindowListener(new Myclass());	
		/* f.addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent we){
				System.exit(0);
			}
		}); // anonymous inner class
		*/
	}
}
class Myclass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}