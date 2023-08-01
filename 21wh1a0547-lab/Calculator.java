package java_lab;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener {
		Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,sub,mul,div,clear,equal,mod,back;
		Label l;
		TextField f;
		Calculator(){
			this.setLayout(null);
			this.setSize(700,700);
			this.setTitle("CALCULATOR");
			this.setBackground(Color.BLACK);
			b0 = new Button("0");
			b1 = new Button("1");
			b2 = new Button("2");
			b3 = new Button("3");
			b4 = new Button("4");
			b5 = new Button("5");
			b6 = new Button("6");
			b7 = new Button("7");
			b8 = new Button("8");
			b9 = new Button("9");
			plus = new Button("+");
			sub = new Button("-");
			mul = new Button("*");
			div = new Button("/");
			mod = new Button("%");
			clear = new Button("Clear");
			equal = new Button("=");
			back = new Button("Delete");
			l = new Label("Enter:");
			f = new TextField();
			l.setBounds(100,50,150,100);
			f.setBounds(300,40,250,100);
			b0.setBounds(100,150,150,100);
			b1.setBounds(300,150,150,100);
			b2.setBounds(500,150,150,100);
			b3.setBounds(100,250,150,100);
			b4.setBounds(300,250,150,100);
			b5.setBounds(500,250,150,100);
			b6.setBounds(100,350,150,100);
			b7.setBounds(300,350,150,100);
			b8.setBounds(500,350,150,100);
			b9.setBounds(100,450,150,100);
			plus.setBounds(300,450,150,100);
			sub.setBounds(500,450,150,100);
			mul.setBounds(100,550,150,100);
			div.setBounds(300,550,150,100);
			mod.setBounds(500,550,150,100);
			clear.setBounds(100,650,150,100);
			equal.setBounds(300,650,150,100);
			back.setBounds(500,650,150,100);
		
			this.add(b0);
			this.add(b1);
			this.add(b2);
			this.add(b3);
			this.add(b4);
			this.add(b5);
			this.add(b6);
			this.add(b7);
			this.add(b8);
			this.add(b9);
			this.add(plus);
			this.add(sub);
			this.add(mul);
			this.add(div);
			this.add(mod);
			this.add(clear);
			this.add(equal);
			this.add(back);
			this.add(l);
			this.add(f);
			
			b0.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			plus.addActionListener(this);
			sub.addActionListener(this);
			mul.addActionListener(this);
			div.addActionListener(this);
			mod.addActionListener(this);
			clear.addActionListener(this);
			equal.addActionListener(this);
			back.addActionListener(this);
			f.addActionListener(this);
		}
		String s="";
		public void actionPerformed(ActionEvent ae) {
			try {
					String str = ae.getActionCommand();
			        if(ae.getSource()==b0) {
				    s+="0";
				    f.setText(s);
			        }
			        if(ae.getSource()==b1) {
				    s+="1";
				    f.setText(s);
		         	}
			        if(ae.getSource()==b2) {
						s+="2";
						f.setText(s);
					}if(ae.getSource()==b3) {
						s+="3";
						f.setText(s);
					}if(ae.getSource()==b4) {
						s+="4";
						f.setText(s);
					}if(ae.getSource()==b5) {
						s+="5";
						f.setText(s);
					}if(ae.getSource()==b6) {
						s+="6";
						f.setText(s);
					}if(ae.getSource()==b7) {
						s+="7";
						f.setText(s);
					}if(ae.getSource()==b8) {
						s+="8";
						f.setText(s);
					}
					if(ae.getSource()==b9) {
						s+="9";
						f.setText(s);
					}if(ae.getSource()==plus) {
						s+="+";
						f.setText(s);
					}if(ae.getSource()==sub) {
						s+="-";
						f.setText(s);
					}if(ae.getSource()==mul) {
						s+="*";
						f.setText(s);
					}if(ae.getSource()==div) {
						s+="/";
						f.setText(s);
					}
					if(ae.getSource()==mod) {
						s+="%";
						f.setText(s);
					}if(ae.getSource()==clear) {
						f.setText("");
						s="";
					}if(ae.getSource()==equal) {
						int res = calRes(s); 
						f.setText(String.valueOf(res));
						s="";
					}	
					if(ae.getSource()==back) {
						if(s.length()>0) {
							f.setText(s.substring(0,s.length()-1));
						}
					}
			}
			catch(ArithmeticException a) {
				f.setText(String.valueOf("Divide by zero not possible "));
			}
		}
		public int calRes(String input) {
			int result= 0 ;
			try {
				String[] p = input.split("[+-//*/%]");
				int n1= Integer.parseInt(p[0]);
				int n2 = Integer.parseInt(p[1]);
				char operator = input.charAt(p[0].length());
				switch(operator) {
				case '+': 
					result = n1 + n2;
					break;
				case '-': 
					result = n1 - n2;
					break;
				case'*':
					result = n1*n2;
					break;
				case '/':
					result = n1/n2;
					break;
				case '%':
					result = n1%n2;
					break;
				}
			}
			catch(NumberFormatException ne) {
				f.setText(String.valueOf("Invalid format "));

			}
			return result;
			
		}
		public static void main(String args[]) {
			Calculator c = new Calculator();
			c.setVisible(true);
			c.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		
		}
}
