package javaClass;
import java.awt.*;
import java.awt.event.*;
public class UsernamePassword extends Frame implements ActionListener {
	TextField name,pass;
	Label l1,l2;
	UsernamePassword(){
		this.setLayout(new FlowLayout());
		name = new TextField("user name",20);
		pass  = new TextField(20);
		pass.setEchoChar('*');
		l1 = new Label("user name");
		l2 = new Label("pwd",Label.LEFT);
		add(l1);
		add(name);
		add(l2);
		add(pass);
		name.addActionListener(this);
		pass.addActionListener(this);
		this.setBackground(Color.pink);
			}
	public void actionPerformed(ActionEvent ae) {
		Graphics g = this.getGraphics();
		g.drawString("User Name: "+name.getText(),100,100);
		g.drawString( "Pwd: "+pass.getText(),100,200);
		
			
		}
	

public static void main(String[] args) {
	UsernamePassword f = new UsernamePassword();
	f.setTitle("Application");
	f.setSize(400, 400);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}