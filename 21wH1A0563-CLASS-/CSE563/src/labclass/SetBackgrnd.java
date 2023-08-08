import java.awt.*;
import java.awt.event.*;
public class SetBackgrnd extends Frame implements ActionListener {
			Button b1,b2,b3,b4;
			SetBackgrnd(){
				this.setLayout(null);
				b1 = new Button("Red");
				b2 = new Button("Blue");
				b3 = new Button("Green");
				b4 = new Button("Violet");
				b1.setBounds(100, 150, 100, 50);
				b2.setBounds(100, 250, 100, 50);
				b3.setBounds(100, 350, 100, 50);
				b4.setBounds(100, 450, 100, 50);
				this.add(b1);
				this.add(b2);
				this.add(b3);
				this.add(b4);
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				b4.addActionListener(this);
						}
			public void actionPerformed(ActionEvent ae) {
				String str = ae.getActionCommand();
				if(str == "Red")
						this.setBackground(Color.RED);
				if(str == "Blue")
					this.setBackground(Color.BLUE);
			
				if(str == "Green")
					this.setBackground(Color.GREEN);
				if(str == "Violet")
					this.setBackground(Color.MAGENTA);
			}
public static void main(String[] args) {
	SetBackgrnd sb = new SetBackgrnd();
	sb.setTitle("Test");
	sb.setSize(400, 400);
	sb.setVisible(true);
	sb.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}

}
