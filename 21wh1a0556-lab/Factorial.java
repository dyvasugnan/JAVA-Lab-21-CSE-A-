import java.awt.*;
import java.awt.event.*;

public class Factorial extends Frame implements ActionListener{
	TextField tf1,tf2;
	Label l1,l2;
	Button b1,b2;
	public Factorial() {
		// TODO Auto-generated constructor stub
		this.setLayout(null);
        this.setSize(800, 800);
        this.setTitle("Factorial");
        this.setBackground(Color.WHITE);
		b1=new Button("Compute");
		b2=new Button("Clear");
		b1.setBounds(100,350,100,50);
		b2.setBounds(200,350,100,50);
		this.add(b1);
		this.add(b2);
		l1=new Label("Enter a number");
		l2=new Label("Factorial");
		tf1=new TextField();
		tf2=new TextField();
		l1.setBounds(100,150,100,50);
		tf1.setBounds(200,150,100,50);
		l2.setBounds(100,250,100,50);
		tf2.setBounds(200,250,100,50);
		this.add(tf1);
		this.add(tf2);
		this.add(l1);
		this.add(l2);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("Compute")) {
			int n = Integer.parseInt(tf1.getText());
			int fact=1;
			for(int i=1;i<=n;i++)
				fact*=i;
			tf2.setText(String.valueOf(fact));
		}
		if(str.equals("Clear")) {
			tf1.setText("");
			tf2.setText("");
		}		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
	           public void windowClosing(WindowEvent we) {
	                System.exit(0);
	            }
	        });
		

	}

}
