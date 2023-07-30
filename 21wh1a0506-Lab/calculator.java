package javaclass;
import java.lang.String;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button badd,bsub,bdiv,bmod,bmult,beql,bce,bdec,bpn;
	Button back,bx,bsqx,bsq;
	Label l;
	Double res = 0.0;
	int check =0;
	String show;
	Calculator(){		
		Font fnt = new Font(" ",Font.BOLD,18);
		Font fnt1 = new Font(" ",Font.PLAIN,25);
		
		this.setLayout(null);
		bpn = new Button("(+ / -)");
		bpn.setBounds(8,400,80,50);
		bpn.setFont(fnt);
		this.add(bpn);
		
		bdec = new Button(".");
		bdec.setBounds(169,400,80,50);
		bdec.setFont(fnt);
		this.add(bdec);
		
		beql = new Button("=");
		beql.setBounds(249,400,80,50);
		beql.setBackground(Color.CYAN);
		beql.setFont(fnt);
		this.add(beql);
				
		badd = new Button("+");
		badd.setBounds(249,350,80,50);
		badd.setFont(fnt);
		this.add(badd);
		
		bsub = new Button("-");
		bsub.setBounds(249,300,80,50);
		bsub.setFont(fnt);
		this.add(bsub);
		
		bmult = new Button("x");
		bmult.setBounds(249,250,80,50);
		bmult.setFont(fnt);
		this.add(bmult);
		
		bdiv = new Button("÷");
		bdiv.setBounds(249,200,80,50);
		bdiv.setFont(fnt);
		this.add(bdiv);
		
		back = new Button("back");
		back.setBounds(249,150,80,50);
		back.setFont(fnt);
		this.add(back);
		
		bx = new Button("1/x");
		bx.setBounds(8,200,80,50);
		bx.setFont(fnt);
		this.add(bx);
		
		bsqx = new Button("x²");
		bsqx.setBounds(88,200,80,50);
		bsqx.setFont(fnt);
		this.add(bsqx);
		
		bsq = new Button("√x");
		bsq.setBounds(169,200,80,50);
		bsq.setFont(fnt);
		this.add(bsq);
		
		bmod= new Button("%");
		bmod.setBounds(8,150,80,50);
		bmod.setFont(fnt);
		this.add(bmod);
		
		bce= new Button("CE");
		bce.setBounds(88,150,160,50);
		bce.setFont(fnt);
		this.add(bce);
		
		//number buttons 
		b1 = new Button("1");
		b1.setBounds(8,350,80,50);
		b1.setFont(fnt);
		this.add(b1);
		
		b2 = new Button("2");
		b2.setBounds(88,350,80,50);
		b2.setFont(fnt);
		this.add(b2);
		
		b3 = new Button("3");
		b3.setBounds(169,350,80,50);
		b3.setFont(fnt);
		this.add(b3);
		
		b4 = new Button("4");
		b4.setBounds(8,300,80,50);
		b4.setFont(fnt);
		this.add(b4);
		
		b5 = new Button("5");
		b5.setBounds(88,300,80,50);
		b5.setFont(fnt);
		this.add(b5);
		
		b6 = new Button("6");
		b6.setBounds(169,300,80,50);
		b6.setFont(fnt);
		this.add(b6);
		
		b7 = new Button("7");
		b7.setBounds(8,250,80,50);
		b7.setFont(fnt);
		this.add(b7);
		
		b8 = new Button("8");
		b8.setBounds(88,250,80,50);
		b8.setFont(fnt);
		this.add(b8);
		
		b9 = new Button("9");
		b9.setBounds(169,250,80,50);
		b9.setFont(fnt);
		this.add(b9);
		
		b0 = new Button("0");
		b0.setBounds(88,400,80,50);
		b0.setFont(fnt);
		this.add(b0);
		
		l = new Label("0",l.RIGHT);
		l.setBackground(Color.WHITE);
		l.setBounds(8,15,320,135);
		l.setFont(fnt1);
		this.add(l);
		
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
		
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bdiv.addActionListener(this);
		bmod.addActionListener(this);
		bmult.addActionListener(this);
		beql.addActionListener(this);
		
		bce.addActionListener(this);
		bdec.addActionListener(this);
		bpn.addActionListener(this);
		back.addActionListener(this);
		bx.addActionListener(this);
		bsqx.addActionListener(this);
		bsq.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae) {
			 String str = ae.getActionCommand();
			 String str1 = ae.getActionCommand();
			 
			 //button1 
			 if(str == "1"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "1";
				 l.setText(str);
				 }
				 else {
					 str = "1";
					 l.setText(str);
				 }
			 }
			 //button2
			 if(str == "2"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "2";
				 l.setText(str);
				 }
				 else {
					 str = "2";
					 l.setText(str);
				 }
			 }
			 //button3
			 if(str == "3"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "3";
				 l.setText(str);
				 }
				 else {
					 str = "3";
					 l.setText(str);
				 }
			 }
			 //button4
			 if(str == "4"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "4";
				 l.setText(str);
				 }
				 else {
					 str = "4";
					 l.setText(str);
				 }
			 }
			 //button5
			 if(str == "5"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "5";
				 l.setText(str);
				 }
				 else {
					 str = "5";
					 l.setText(str);
				 }
			 }
			 //button6
			 if(str == "6"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "6";
				 l.setText(str);
				 }
				 else {
					 str = "6";
					 l.setText(str);
				 }
			 }
			 //button7
			 if(str == "7"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "7";
				 l.setText(str);
				 }
				 else {
					 str = "7";
					 l.setText(str);
				 }
			 }
			 //button8
			 if(str == "8"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "8";
				 l.setText(str);
				 }
				 else {
					 str = "8";
					 l.setText(str);
				 }
			 }
			 //button9
			 if(str == "9"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "9";
				 l.setText(str);
				 }
				 else {
					 str = "9";
					 l.setText(str);
				 }
			 }
			 //button0
			 if(str == "0"){
				 str1 = l.getText();
				 if(str1 != "0"){
				 str = str1 + "0";
				 l.setText(str);
				 }
				 else {
					 str = "0";
					 l.setText(str);
				 }
			 }
			 //button.
			 if(str == "."){
				 str1 = l.getText();
				 if(str1.contains(".")){
					 str = str1;
				 }
				 else {
					 str = str1 + ".";
					 l.setText(str);
				 }
			 }
			 
			 //buttonback
			 if(str == "back"){
				 str1 = l.getText();
				 if(str1!="0") {
				 try {
					 str = str1.substring(0, str1.length()-1);
				 }
				 catch(StringIndexOutOfBoundsException ex){
					 return;
				 }
				 if(str.isEmpty())
					 l.setText("0");
				 else
					 l.setText(str);
				 }
				 else {
					 l.setText("0");
				 }
			 }
			 
			 //button+/-
			 if(str == "(+ / -)"){
				 str1 = l.getText();				 
				 if(str1!="0" && str1.charAt(0)!= '-'){
				 try{
					 char m = '-';
					 str = m + str1;
					 l.setText(str);
				}
				catch(StringIndexOutOfBoundsException ex){
					return;
				}
				 }
				 else if(str1!="0" && str1.charAt(0) == '-'){
				 try{
					 str = str1.substring(1, str1.length());
					 l.setText(str);
				 }
				 catch(StringIndexOutOfBoundsException ex){
					return;
				 }
				 }
				 else {
					 l.setText(str1);
				 }
			 }
			 
			 //button clear
			 if(str == "CE") {
				 l.setText("0");
				 res = 0.0;
				 check = 0;
			 }
			 
			 //button 1/x
			 if(str == "1/x"){
				 str1 = l.getText();
				 try { 
					 double a = Double.parseDouble(str1);
					 a = 1/a;
					 str1 = String.valueOf(a);
					 l.setText(str1);
				 }
				 catch(ArithmeticException e){
					 l.setText("Arithmetic exception");
				 }
			 }
			 
			 //button x^2
			 if(str == "x²"){
				 str1 = l.getText();
				 double a = Double.parseDouble(str1);
				 a = Math.pow(a, 2);
				 str1 = String.valueOf(a);
				 l.setText(str1);
			 }
			 
			 //button sqrt
			 if(str == "√x"){
				 str1 = l.getText();
				 double a = Double.parseDouble(str1);
				 a = Math.sqrt(a);
				 str1 = String.valueOf(a);
				 l.setText(str1);
			 }
			 
			 //button add
			 if(str == "+"){
				 str1 = l.getText();
				 double a = Double.parseDouble(str1);
				 res += a;
				 l.setText("0");
				 check = 1;
			 }
			 
			 //button subtract 
			 if(str == "-") {
				 check = 2;
				 str1 = l.getText();
				 double a = Double.parseDouble(str1);
				 if (res == 0.0) {
				        res = a;
				    } else {
				        res -= a;
				    }
				 l.setText("0");
			 }
			 //button multiplication 
			 if(str == "x") {
				 check = 3;
				 str1 = l.getText();
				 double a = Double.parseDouble(str1);
				 if(res == 0.0) {
					 res = a;
				 }
				 else {
					 res *= a;
				 }
				 l.setText("0");
			 }
			 
			 //button divide
			 if(str == "÷") {
				 check = 4;
				 str1 = l.getText();
				 double a = Double.parseDouble(str1);
				 if(res == 0.0) {
					 res = a;
				 }
				 else {
					 try {
					 res /= a;
					 }
					 catch(ArithmeticException e) {
						 l.setText("Arithmetic exception");
						 check = 0;
						 res = 0.0;
					 }
				 }
				 l.setText("0");
			 }
			 
			 //button percentage
			 if(str == "%") {
				 str1 = l.getText();
				 double a = Double.parseDouble(str1);
				 a = a/100;
				 str1 = String.valueOf(a);
				 l.setText(str1);
			 }
			 
			 //equals button
			 if(str == "="){
				 if (check == 0) {
					 l.setText("0");
				 }
				 if(check == 1) {
					 str1 = l.getText();
					 double a = Double.parseDouble(str1);
					 res+=a;
					 show = String.valueOf(res);
					 l.setText(show);
					 res = 0.0;
					 check = 0;
				 }
				 if(check == 2) {
					 str1 = l.getText();
					 double a = Double.parseDouble(str1);
					 res = res - a;
					 show = String.valueOf(res);
					 l.setText(show);
					 res = 0.0;
					 check = 0;
				 }
				 if(check == 3) {
					 str1 = l.getText();
					 double a = Double.parseDouble(str1);
					 res = res * a;
					 show = String.valueOf(res);
					 l.setText(show);
					 res = 0.0;
					 check = 0;
				 }
				 if(check == 4) {
					 str1 = l.getText();
					 double a = Double.parseDouble(str1);
					 try {
					 res = res / a;
					 }
					 catch(ArithmeticException e) {
						 l.setText("Arithmetic exception");
						 check = 0;
						 res = 0.0;
					 }
					 if(check == 4) {
					 show = String.valueOf(res);
					 l.setText(show);
					 res = 0.0;
					 check = 0;
					 }
				 }
			 }
		}
		

	public static void main(String[] args) {
		Calculator f = new Calculator();
		f.setTitle("Calculator");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\vnave\\OneDrive\\Desktop\\calc.png");    
		f.setIconImage(icon);  
		f.setSize(336,458);
		f.setBackground(Color.LIGHT_GRAY);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}

}
