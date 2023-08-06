import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener{
	
	TextField T;
	Button a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16;
	
	String str1;
	String str2;
	String str3;
	String str4;

Double c;
	Calculator(){
	
		
		this.setLayout(null);
		T = new TextField();
		a1 = new Button("1");
		a2 = new Button("2");
		a3 = new Button("3");
		a4 = new Button("4");
		a5 = new Button("5");
		a6 = new Button("6");
		a7 = new Button("7");
		a8 = new Button("8");
		a9 = new Button("9");
		a10 = new Button("0");
		a11 = new Button("+");
		a12 = new Button("-");
		a13 = new Button("/");
		a14 = new Button("AC");
		a15 = new Button("*");
		a16 = new Button("=");
		
	
		T.setBounds(50, 100, 300, 50);
		a1.setBounds(50, 200, 50, 50);
		a2.setBounds(120, 200, 50, 50);
		a3.setBounds(190, 200, 50, 50);
		a11.setBounds(260, 200, 50, 50);
		a4.setBounds(50, 270, 50, 50);
		a5.setBounds(120, 270, 50, 50);
		a6.setBounds(190, 270, 50, 50);
		a12.setBounds(260, 270, 50, 50);
		a7.setBounds(50, 340, 50, 50);
		a8.setBounds(120, 340, 50, 50);
		a9.setBounds(190, 340, 50, 50);
		a10.setBounds(260, 340, 50, 50);
		a13.setBounds(50, 410, 50, 50);
		a14.setBounds(120, 410, 50, 50);
		a15.setBounds(190,410,50,50);
		a16.setBounds(260,410,50,50);
	
	
		this.add(a1);
		this.add(a2);
		this.add(a3);
		this.add(a4);
		this.add(a5);
		this.add(a6);
		this.add(a7);
		this.add(a8);
		this.add(a9);
		this.add(a10);
		this.add(a11);
		this.add(a12);
		this.add(a13);
		this.add(a14);
		this.add(a15);
		this.add(a16);
		this.add(T);
		
		
		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);
		a4.addActionListener(this);
		a5.addActionListener(this);
		a6.addActionListener(this);
		a7.addActionListener(this);
		a8.addActionListener(this);
		a9.addActionListener(this);
		a10.addActionListener(this);
		a11.addActionListener(this);
		a12.addActionListener(this);
		a13.addActionListener(this);
		a14.addActionListener(this);
		a15.addActionListener(this);
		a16.addActionListener(this);
		T.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if((str.charAt(0)>='0'&&str.charAt(0)<='9')) {
			str1 = T.getText()+s;
			T.setText(s1);
					}
		
		 if(str.charAt(0)=='+') {
		str2 = T.getText();
		T.setText(" "); 
		str3 = "+";
	 }
		
		 if(str.charAt(0)=='-') {
				str2 = T.getText();
				T.setText(" "); 
				str3 = "-";
			 } 
		
		 if(str.charAt(0)=='*') {
				str2 = T.getText();
				T.setText(" "); 
				str3 = "*";
			 }
		
		 if(str.charAt(0)=='/') {
				str2 = T.getText();
				T.setText(" "); 
				str3 = "/";
			 }
		 
	 
	 if(str.equals("=")==true) {
		 str4 = T.getText();
		
		 if(str3.equals("+")==true) 
		 c = Double.parseDouble(str2)+Double.parseDouble(str4);
	    
	     if(str3.equals("-")==true)
	    	 c = Double.parseDouble(str2)-Double.parseDouble(str4);
	    
	     if(str3.equals("*")==true)
	    	 c = Double.parseDouble(str2)*Double.parseDouble(str4);
	    
	     try {
	     if(str3.equals("/")==true) {
	    	 c = Double.parseDouble(str2)/Double.parseDouble(str4);}
		     T.setText(String.valueOf(c));
		   }
	    
	     catch(NumberFormatException e) {
   		  T.setText("Check input");
   		  }
	    }
	
	 if(str.equals("AC")==true)
		 T.setText(" ");}
	 
	
	public static void main(String args[]){
	Calculator c = new Calculator();

	c.setTitle("Calculator");
	c.setSize(400,400);
	c.setVisible(true);
	c.addWindowListener(new WindowAdapter(){
		
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
);
}
}