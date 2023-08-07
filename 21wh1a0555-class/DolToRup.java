package usha;
import java.awt.*;
import java.awt.event.*;
public class DolToRup extends Frame implements ActionListener {
	Button dol,rup,clr;
	TextField t1,t2;
	Label l1,l2;
	DolToRup(){
		dol = new Button("ConvertDollarToRupee");
		clr = new Button("Clear");
		rup = new Button("ConvertRupeeToDollar");
		t1 = new TextField();
		t2 = new TextField();
		l1 = new Label("Currency");
		l2 = new Label("Converted");
		this.setLayout(null);
		dol.setBounds(100,350,200,50);
		clr.setBounds(250,450,200,50);
		rup.setBounds(400,350,200,50);
		t1.setBounds(200,150,200,50);
		t2.setBounds(200,250,200,50);
		l1.setBounds(50,150,200,50);
		l2.setBounds(50,250,200,50);
		Font f = new Font("Arial",Font.BOLD,15);
		l1.setFont(f);
		l2.setFont(f);
		dol.setFont(f);
		clr.setFont(f);
		rup.setFont(f);
		t1.setFont(f);
		t2.setFont(f);
		this.add(dol);
		this.add(clr);
		this.add(rup);
		this.add(t1);
		this.add(t2);
		this.add(l1);
		this.add(l2);
		dol.addActionListener(this);
		clr.addActionListener(this);
		rup.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str=="ConvertDollarToRupee") {
			int  r= Integer.parseInt(t1.getText());
			double r1 = r*82.74;
			t2.setText(String.valueOf(r1));
		}
		else if(str=="ConvertRupeeToDollar") {
			int d = Integer.parseInt(t1.getText());
			double r2 = d*0.012;
			t2.setText(String.valueOf(r2));
		}
		else {
			t1.setText("");
			t2.setText("");
		}
	}
	public static void main(String[] args) {
		DolToRup D = new DolToRup();
		D.setTitle("Conversion to Dollar into Rupees");
		D.setVisible(true);
		D.setSize(400,400);
		D.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
