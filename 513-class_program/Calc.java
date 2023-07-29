package javalab;

import java.awt.*;
import java.awt.event.*;
//to add border use swing, then .setBorders(Colors. );

public class Calc extends Frame implements ActionListener {

		TextField t;
		Button[] numButton = new Button[10]; //for numbers
		Button[] funButton = new Button[9]; //for op + spl
		Button add, mul, div, sub; //op
		Button clr,del,equal,dec,neg; //spl
		Panel panel; //to put numbers and spl op in cont
		
		double n1=0,n2=0,res=0;
		char operator;
		Calc(){
			//add them all in the window+layout
			
			this.setLayout(null);
			t = new TextField();
			t.setBounds(50,40,300,50);
			t.setEditable(false);//user cant type whatever ..only through buttons
			t.setBackground(Color.PINK);
			
			
			add = new Button("+");
			mul = new Button("*");
			div = new Button("/");
			sub = new Button("-");
			clr = new Button("CLR");
			del = new Button("DEL");
			equal = new Button("=");
			dec = new Button(".");
			neg = new Button("(-)");
			
			funButton[0] = add;
			funButton[1] = mul;
			funButton[2] = div;
			funButton[3] = sub;
			funButton[4] = dec;
			funButton[5] = equal;
			funButton[6] = del;
			funButton[7] = clr;
			funButton[8] = neg;
			
			for(int i=0;i<9;i++) {
				funButton[i].addActionListener(this); 
				//funButton[i].setFocusable(false);//basically emphasis the press
			}
			
			for(int i=0;i<10;i++) {
				numButton[i] = new Button(String.valueOf(i));
				//numButton[i].setFocusable(true);
				numButton[i].addActionListener(this); 
			}
			
			del.setBounds(150,400,100,50);
			clr.setBounds(250,400,100,50);
			neg.setBounds(50,400,100,50);
			
			//add buttons to panel and the way u want it to look
			panel = new Panel();
			panel.setBounds(50,100,300,300);
			panel.setLayout(new GridLayout(4,4,10,10)); //4x4 buttons with space 10,10
			panel.setBackground(Color.PINK); 
			
			panel.add(numButton[1]);
			panel.add(numButton[2]);
			panel.add(numButton[3]);
			panel.add(add);
			
			panel.add(numButton[4]);
			panel.add(numButton[5]);
			panel.add(numButton[6]);
			panel.add(sub);
			
			panel.add(numButton[7]);
			panel.add(numButton[8]); 
			panel.add(numButton[9]);
			panel.add(mul);
			
			panel.add(dec);
			panel.add(numButton[0]);
			panel.add(equal);
			panel.add(div);
			
			//add panel, textfield, del, clr, neg to the window
			this.add(panel);
			this.add(t);
			this.add(del);
			this.add(clr);
			this.add(neg);
	}
		
		//Actions by the buttons
		public void actionPerformed(ActionEvent ae) {
			//String s = ae.getActionCommand();
			for(int i=0;i<10;i++) {
				if(ae.getSource()== numButton[i]) {
					t.setText(t.getText().concat(String.valueOf(i)));
				}
			}
			if(ae.getSource()==dec) {
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
			if(ae.getSource()== equal) {
				n2 = Double.parseDouble(t.getText());
				
				//switch up all cases
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
				
				case '/' : 
					if (n2 == 0) {
                        throw new ArithmeticException();
                    }
                    res = n1 / n2;
                    break;
				}
				t.setText(String.valueOf(res));
				n1 = res; //if u wanna continue 
			} catch (ArithmeticException e1) {
	            t.setText("Division by 0 is invalid");
	        }
	    }
				
			if(ae.getSource()==clr) {
				t.setText("");
			}
			//only deleting the last digit or op
			if(ae.getSource()==del) {
				String s = t.getText();
				t.setText("");
				for(int i=0;i<s.length()-1;i++) {
					t.setText(t.getText()+s.charAt(i));
				}
			}
			if(ae.getSource()==neg) {
				double temp = Double.parseDouble(t.getText());
				temp *= -1;
				t.setText(String.valueOf(temp));
			}
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		c.setTitle("CALCULATOR");
		c.setBackground(Color.GRAY);
		c.setSize(400,500); 
		c.setVisible(true);
		c.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}

}

	


