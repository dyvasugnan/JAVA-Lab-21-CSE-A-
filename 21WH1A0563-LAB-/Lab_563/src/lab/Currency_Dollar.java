import java.awt.*;
import java.awt.event.*;
public class Currency_Dollar extends Frame implements ActionListener {
	Label l1,l2;
	Button b1,b2;
	TextField t1,t2;
	Currency_Dollar(){
		this.setLayout(null);
		b1=new Button("Rupee-Dollar");
		b2=new Button("Dollar-Rupee");
		l1=new Label("INR");
		l2=new Label("USD");
		t1=new TextField();
		t2=new TextField();
		
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		this.add(l1);
		this.add(l2);
		
		l1.setBounds(240,170,400,100);
		l2.setBounds(240,280,400,100);
		t1.setBounds(300,200,200,50);
		t2.setBounds(300,300,200,50);
		b1.setBounds(350,450,90,50);
		b2.setBounds(450,450,90,50);
		b2.addActionListener(this);
		b1.addActionListener(this);
		
	}
	
public void actionPerformed(ActionEvent ae) { 
	String str=ae.getActionCommand();
	double res;
	if(str=="Rupee-Dollar") {
		int  r= Integer.parseInt(t1.getText());
		res = r*0.012;
		t2.setText(String.valueOf(res));
	}
	else if(str=="Dollar-Rupee") {
		int d = Integer.parseInt(t2.getText());
		res = d*82.74;
		t1.setText(String.valueOf(res));
	}

}
public static void main(String[] args) {
	Currency_Dollar cd =new Currency_Dollar();
	cd.setTitle("Test");
	cd.setSize(400,400);
	cd.setVisible(true);
	cd.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
});
}
}
