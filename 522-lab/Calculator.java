package javaclass;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener {
		Button[] num = new Button[11];
		Button[] spl = new Button[9]; 
		TextField t;
		Button add,sub,mul,div,percent,zero; 
		Button clear,backspace,equal,dot; 
		Panel panel; 
		char operator;
		double n1=0,n2=0,res=0;
		Calculator(){
			this.setLayout(null);
			t = new TextField();
			t.setBounds(50,40,300,50);
			t.setEditable(false);
			t.setForeground(Color.WHITE);
			t.setBackground(Color.GRAY);
			add = new Button("+");
			sub = new Button("-");
			mul = new Button("*");
			div = new Button("/");
			zero = new Button("00");
			percent = new Button("%");
			clear = new Button("CLEAR");
			backspace = new Button("<-");
			equal = new Button("=");
			dot = new Button(".");
			
			spl[0] = add;
			spl[2] = mul;
			spl[3] = div;
			spl[1] = sub;
			spl[4] = percent;
			spl[5] = dot;
			spl[6] = equal;
			spl[7] = backspace;
			spl[8] = clear;
			
 			for(int i=0;i<9;i++) {
				spl[i].addActionListener(this); 
			}
 			zero.addActionListener(this);
			for(int i=0;i<10;i++) {
				num[i] = new Button(String.valueOf(i));
				num[i].addActionListener(this); 
			}
			
			backspace.setBounds(150,400,100,50);
			clear.setBounds(250,400,100,50);
			panel = new Panel();
			panel.setBounds(50,100,300,300);
			panel.setLayout(new GridLayout(5,5,10,10));
			panel.setBackground(Color.DARK_GRAY); 
			backspace.setBackground(Color.RED);
			clear.setBackground(Color.RED);
			zero.setBackground(Color.RED);
			add.setBackground(Color.orange);
			sub.setBackground(Color.orange);
			mul.setBackground(Color.orange);
			div.setBackground(Color.orange);
			percent.setBackground(Color.orange);
			panel.add(backspace);
			panel.add(clear);
			panel.add(zero);
			panel.add(add);
			panel.add(num[7]);
			panel.add(num[8]); 
			panel.add(num[9]);
			panel.add(sub);
			panel.add(num[4]);
			panel.add(num[5]);
			panel.add(num[6]);
			panel.add(mul);
			panel.add(num[1]);
			panel.add(num[2]);
			panel.add(num[3]);
			panel.add(div);
			panel.add(num[0]);
			panel.add(dot);
			panel.add(equal);
			panel.add(percent);
			
			this.add(panel);
			this.add(t);		
	}
		public void actionPerformed(ActionEvent ae) {
			for(int i=0;i<10;i++) {
				if(ae.getSource()== num[i]) {
					t.setText(t.getText().concat(String.valueOf(i)));
				}
			}
			if(ae.getSource()==zero) {
				t.setText(t.getText().concat("00"));
			}
			
			if(ae.getSource()==dot) {
				t.setText(t.getText().concat("."));
			}
			
			if(ae.getSource()==add) {
				n1 = Double.parseDouble(t.getText());
				operator = '+';
				t.setText("");
			}
			if(ae.getSource()==sub) {
				n1 = Double.parseDouble(t.getText());
				operator = '-';
				t.setText("");
			}
			if(ae.getSource()==mul) {
				n1 = Double.parseDouble(t.getText());
				operator = '*';
				t.setText("");
			}
			if(ae.getSource()==div) {
				n1 = Double.parseDouble(t.getText());
				operator = '/';
				t.setText("");
			}
			if(ae.getSource()== percent) {
				n1 = Double.parseDouble(t.getText());
				operator = '%';
				t.setText("");
			}
			if(ae.getSource()== equal) {
				n2 = Double.parseDouble(t.getText());
				try {
				switch(operator) {
				case '+' : 
					res = n1 + n2;
					break;
					
				case '-' :
					res = n1-n2;
					break;
					
				case '*' : 
					res = n1 * n2;
					break;
				case '%' :
					res= n1 % n2;
					break;
				case '/' : 
					if (n2 == 0) 
                        throw new ArithmeticException();
                    else
                    res = n1 / n2;
                    break;
				}	
				t.setText(String.valueOf(res));
				n1 = res; 
			} catch (ArithmeticException e) {
	            t.setText("Division by 0 is invalid");
	        }
	    }
				
			if(ae.getSource()==clear) {
				t.setText("");
			}
			if(ae.getSource()==backspace) {
				String s = t.getText();
				t.setText("");
				for(int i=0;i<s.length()-1;i++) {
					t.setText(t.getText()+s.charAt(i));
				}
			}
		}
		public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setTitle("CALCULATOR");
		c.setBackground(Color.BLACK);
		c.setSize(400,500) ;
		c.setVisible(true);
		c.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}

}