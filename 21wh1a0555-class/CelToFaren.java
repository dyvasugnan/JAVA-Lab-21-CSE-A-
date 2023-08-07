package usha;
import java.awt.*;
import java.awt.event.*;
public class CelToFaren extends Frame implements ActionListener{
	Button cel,far,clr;
	TextField t1,t2;
	Label l1,l2;
	CelToFaren(){
		cel = new Button("ConvertToCelsius");
		clr = new Button("Clear");
		far = new Button("ConvertToFarenheit");
		t1 = new TextField();
		t2 = new TextField();
		l1 = new Label("Temperature");
		l2 = new Label("Result");
		this.setLayout(null);
		cel.setBounds(100,350,200,50);
		clr.setBounds(250,450,200,50);
		far.setBounds(400,350,200,50);
		t1.setBounds(200,150,200,50);
		t2.setBounds(200,250,200,50);
		l1.setBounds(50,150,200,50);
		l2.setBounds(50,250,200,50);
		Font f = new Font("Arial",Font.BOLD,15);
		l1.setFont(f);
		l2.setFont(f);
		cel.setFont(f);
		clr.setFont(f);
		far.setFont(f);
		t1.setFont(f);
		t2.setFont(f);
		this.add(cel);
		this.add(clr);
		this.add(far);
		this.add(t1);
		this.add(t2);
		this.add(l1);
		this.add(l2);
		cel.addActionListener(this);
		clr.addActionListener(this);
		far.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str=="ConvertToFarenheit") {
			int C = Integer.parseInt(t1.getText());
			double r1 = C* 9/5 + 32;
			t2.setText(String.valueOf(r1));
		}
		else if(str=="ConvertToCelsius") {
			int F = Integer.parseInt(t1.getText());
			double r2 = (F - 32) / 1.8;
			t2.setText(String.valueOf(r2));
		}
		else {
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String[] args) {
		CelToFaren c = new CelToFaren();
		c.setTitle("Conversion of Celsius to Farenheit");
		c.setVisible(true);
		c.setSize(400,400);
		c.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

}
