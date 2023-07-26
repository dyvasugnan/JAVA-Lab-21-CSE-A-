package java_lab;
import java.awt.*;
import java.awt.event.*;
public class ButtonColour extends Frame implements ActionListener {
	Button b1,b2,b3;
	ButtonColour(){
		this.setLayout(null);
		b1 = new Button("Red");
		b2 = new Button("Black");
		b3 = new Button("Yellow");
		b1.setBounds(100, 150, 100, 50);
		b2.setBounds(100, 250, 100, 50);
		b3.setBounds(100, 350, 100, 50);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
				}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Red")
				this.setBackground(Color.RED);
		if(str == "Black")
			this.setBackground(Color.BLACK);
	
		if(str == "Yellow")
			this.setBackground(Color.YELLOW);
	
	}

public static void main(String[] args) {
	ButtonColour b = new ButtonColour();
	b.setTitle("Test");
	b.setSize(400, 400);
	b.setVisible(true);
	b.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}

