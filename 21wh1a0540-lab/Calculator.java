package classprogram;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener{
Panel p;Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bmu,bd,br,bc;String s1,s2,s3,s4,s;TextField t;
Double v;
Calculator(){
	this.setLayout(null);
p = new Panel();
b1 = new Button("1");
b2 = new Button("2");
b3 = new Button("3");
b4 = new Button("4");
b5 = new Button("5");
b6 = new Button("6");
b7 = new Button("7");
b8 = new Button("8");
b9 = new Button("9");
b0 = new Button("0");
bp = new Button("+");
bm = new Button("-");
bmu = new Button("*");
bd = new Button("/");
bc = new Button("c");
br = new Button("=");
t = new TextField();
t.setBounds(100, 100,150,50);
p.setBounds(100,200,200,200);
p.setLayout(new GridLayout(4,4));
p.add(b0);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(bp);
p.add(bm);
p.add(bd);
p.add(bmu);
p.add(bc);
p.add(bd);
p.add(br);
this.add(t);
this.add(p);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
bp.addActionListener(this);
bm.addActionListener(this);
bd.addActionListener(this);
t.addActionListener(this);
br.addActionListener(this);
bc.addActionListener(this);
bmu.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
	s = ae.getActionCommand();
	if(s.charAt(0)>='0'&&s.charAt(0)<='9') {
		s1 = s+t.getText();
		t.setText(s1);
	}
	else if(s.charAt(0)=='+') {
		s2  = t.getText();
		t.setText(" ");
		s3 = "+";
	}
	else if(s.charAt(0)=='-') {
		s2 = t.getText();
		t.setText(" ");
		s3 = "-";
	}
	else if(s.charAt(0)=='*') {
		s2 = t.getText();
		t.setText(" ");
		s3 = "*";
	}
	else if(s.charAt(0)=='/') {
		s2 = t.getText();
		t.setText(" ");
		s3 = "/";
	}
	else if(s.charAt(0)=='=') {
		s4 = t.getText();
		if(s3=="+") {
			v = Double.parseDouble(s2)+Double.parseDouble(s4);
		}
		if(s3=="-") {
			v = Double.parseDouble(s2)-Double.parseDouble(s4);
		}
		if(s3=="*") {
			v = Double.parseDouble(s2)*Double.parseDouble(s4);
		}
		try {
		if(s3=="/") {
			v = Double.parseDouble(s2)/Double.parseDouble(s4);
		}
		t.setText(String.valueOf(v));}
		catch(ArithmeticException a) {
			System.out.print("cant divide by zero");
		}
		
	}
	else if(s.charAt(0)=='c') {
		t.setText(" ");
	}
}
public static void main(String args[]) {
	Calculator f = new Calculator();
	f.setSize(400,400);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}
