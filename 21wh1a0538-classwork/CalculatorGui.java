package classprogram;
import java.awt.*;
import java.awt.event.*;
public class CalculatorGui extends Frame implements ActionListener {
	TextField t;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	String s1;
	String s2 ;
	String s3;
	String dis;
	String d ;
	String s4;
Double c;
	CalculatorGui(){
	
		this.setLayout(null);
		t = new TextField();
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		b10 = new Button("0");
		b11 = new Button("+");
		b12 = new Button("-");
		b13 = new Button("/");
		b14 = new Button("c");
		b15 = new Button("X");
		b16 = new Button("res");
		b1.setBackground(Color.pink);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.pink);
		b5.setBackground(Color.pink);
		b6.setBackground(Color.pink);
		b7 .setBackground(Color.pink);
		b8.setBackground(Color.pink);
		b9 .setBackground(Color.pink);
		b10.setBackground(Color.pink);
		b11.setBackground(Color.pink);
		b12 .setBackground(Color.pink);
		b13 .setBackground(Color.pink);
		b14 .setBackground(Color.pink);
		b15.setBackground(Color.pink);
		b16.setBackground(Color.pink);
		
		t.setBounds(50, 100, 300, 50);
		b1.setBounds(50, 200, 50, 50);
		b2.setBounds(120, 200, 50, 50);
		b3.setBounds(190, 200, 50, 50);
		b11.setBounds(260, 200, 50, 50);
		b4.setBounds(50, 270, 50, 50);
		b5.setBounds(120, 270, 50, 50);
		b6.setBounds(190, 270, 50, 50);
		b12.setBounds(260, 270, 50, 50);
		b7.setBounds(50, 340, 50, 50);
		b8.setBounds(120, 340, 50, 50);
		b9.setBounds(190, 340, 50, 50);
		b10.setBounds(260, 340, 50, 50);
		b13.setBounds(50, 410, 50, 50);
		b14.setBounds(120, 410, 50, 50);
		b15.setBounds(190,410,50,50);
		b16.setBounds(260,410,50,50);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(b10);
		this.add(b11);
		this.add(b12);
		this.add(b13);
		this.add(b14);
		this.add(b15);
		this.add(b16);
		this.add(t);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		t.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		if((s.charAt(0)>='0'&&s.charAt(0)<='9')) {
			s1 =t.getText()+s;
			t.setText(s1);
			
		}
		 if(s.charAt(0)=='+') {
		s2 = t.getText();
		t.setText(" "); 
		s3 = "+";
	 }
		 if(s.charAt(0)=='-') {
				s2 = t.getText();
				t.setText(" "); 
				s3 = "-";
			 } 
		 if(s.charAt(0)=='*') {
				s2 = t.getText();
				t.setText(" "); 
				s3 = "*";
			 }
		 if(s.charAt(0)=='/') {
				s2 = t.getText();
				t.setText(" "); 
				s3 = "/";
			 }
		 
	 if(s.equals("res")==true) {
		 s4 = t.getText();
		 if(s3.equals("+")==true) 
		 c = Double.parseDouble(s2)+Double.parseDouble(s4);
	     if(s3.equals("-")==true)
	    	 c = Double.parseDouble(s2)-Double.parseDouble(s4);
	     if(s3.equals("*")==true)
	    	 c = Double.parseDouble(s2)*Double.parseDouble(s4);
	     try {
	     if(s3.equals("/")==true) {
	    	 c = Double.parseDouble(s2)/Double.parseDouble(s4);}
		     t.setText(String.valueOf(c));
		  
	 }
	     catch(NumberFormatException e) {
   		  t.setText("Check input");
   		  }
	    }
	 if(s.equals("c")==true)
		 t.setText(" ");}
	 
	
	
public static void main(String args[]) {
	CalculatorGui c = new CalculatorGui();
	c.setTitle("Calculator");
	c.setSize(400,400);
	c.setVisible(true);
	c.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}
