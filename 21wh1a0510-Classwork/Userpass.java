import java.awt.*;
import java.awt.event.*;
public class Userpass extends Frame implements ActionListener {
	TextField name,pass;
	Label l1,l2;
	Userpass(){
		this.setLayout(new FlowLayout());
		this.setBackground(Color.MAGENTA);
		name = new TextField("",20);
		pass  = new TextField(20);
		pass.setEchoChar('*');
		l1 = new Label("user name");
		l2 = new Label("password",Label.LEFT);
		add(l1);
		add(name);
		add(l2);
		add(pass);
		name.addActionListener(this);
		pass.addActionListener(this);
			}
	public void actionPerformed(ActionEvent ae) {
		Graphics g = this.getGraphics();
		g.drawString("User Name: "+name.getText(),170,100);
		g.drawString( "Pwd: "+pass.getText(),170,130);
		
			
		}
	

public static void main(String[] args) {
	Userpass u = new Userpass();
	u.setTitle("Test");
	u.setSize(500, 500);
	u.setVisible(true);
	u.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}
