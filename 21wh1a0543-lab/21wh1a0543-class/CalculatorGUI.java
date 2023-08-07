package awtprograms;

import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends Frame implements ActionListener{


		 Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b12,b13,b14,b15,b16;		 
		 TextField tf1;
		 
	CalculatorGUI(){ 
			

		this.setLayout(new FlowLayout());

        tf1 = new TextField(60);
        this.add(tf1);
     
        tf1.addActionListener(this);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));
        p.setBackground(Color.cyan);
        p.setPreferredSize(new Dimension(500, 500));
        this.add(p); 
		
        
         b0 = new Button("0");
         b0.setFont(new Font("Arial", Font.PLAIN, 20));
		 b1 = new Button("1");
		 b1.setFont(new Font("Arial", Font.PLAIN, 20));
		 b2 = new Button("2");
		 b2.setFont(new Font("Arial", Font.PLAIN, 20));
		 b3 = new Button("3");
		 b3.setFont(new Font("Arial", Font.PLAIN, 20));
		 b4 = new Button("4");
		 b4.setFont(new Font("Arial", Font.PLAIN, 20));
		 b5= new Button("5");
		 b5.setFont(new Font("Arial", Font.PLAIN, 20));
		 b6= new Button("6");
		 b6.setFont(new Font("Arial", Font.PLAIN, 20));
		 b7= new Button("7");
		 b7.setFont(new Font("Arial", Font.PLAIN, 20));
		 b8= new Button("8");
		 b8.setFont(new Font("Arial", Font.PLAIN, 20));
		 b9= new Button("9");
		 b9.setFont(new Font("Arial", Font.PLAIN, 20));
		 b11=new Button("+");
		 b11.setFont(new Font("Arial", Font.PLAIN, 20));
		 b12=new Button("-");
		 b12.setFont(new Font("Arial", Font.PLAIN, 20));
		 b13=new Button("*");
		 b13.setFont(new Font("Arial", Font.PLAIN, 20));
		 b14=new Button("/");	
		 b14.setFont(new Font("Arial", Font.PLAIN, 20));
		 b15 = new Button("C");
		 b15.setFont(new Font("Arial", Font.PLAIN, 20));
		 b16 = new Button("=");
		 b16.setFont(new Font("Arial", Font.PLAIN, 20));
		 
		 
		 p.add(b7);
	     p.add(b8);
	     p.add(b9);
	     p.add(b14);
	     p.add(b4);
	     p.add(b5);
	     p.add(b6);
	     p.add(b13);
		 p.add(b1);
	     p.add(b2);
	     p.add(b3);
	     p.add(b12);
	     p.add(b15);
	     p.add(b0); 
	     p.add(b16);
	     p.add(b11);
	     
	     
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
	     b11.addActionListener(this);
	     b12.addActionListener(this);
	     b13.addActionListener(this);
	     b14.addActionListener(this);
	     b15.addActionListener(this);
	     b16.addActionListener(this);
	     
	     
	     
		}
	
	
	    char op;
		int n1=0,n2=0,res=0;
		public void actionPerformed(ActionEvent ae) {
	       // String s1 = ae.getActionCommand();
			try {
	        if(ae.getSource()==b0) {	        
	        	tf1.setText(tf1.getText()+'0');
	        }
	        if(ae.getSource()==b1) {
	        	tf1.setText(tf1.getText()+"1");
	        }
	        if(ae.getSource()==b2) {
	        	tf1.setText(tf1.getText()+"2");
	        }	        
	        if(ae.getSource()==b3) {
	        	tf1.setText(tf1.getText()+"3");
	        }	        
	        if(ae.getSource()==b4) {
	        	tf1.setText(tf1.getText()+"4");
	        }	        
	        if(ae.getSource()==b5) {
	        	tf1.setText(tf1.getText()+"5");
	        }	        
	        if(ae.getSource()==b6) {
	        	tf1.setText(tf1.getText()+"6");
	        }	        
	        if(ae.getSource()==b7) {
	        	tf1.setText(tf1.getText()+"7");
	        }	        
	        if(ae.getSource()==b8) {
	        	tf1.setText(tf1.getText()+"8");
	        }	        
	        if(ae.getSource()==b9) {
	        	tf1.setText(tf1.getText()+"9");
	        }	        
	        if(ae.getSource()==b11) {
	        	n1=Integer.parseInt(tf1.getText());
	        	tf1.setText("");
	        	op = '+';
	        	
	        }	        
	        if(ae.getSource()==b12) {
	        	n1=Integer.parseInt(tf1.getText());
	        	tf1.setText("");
	        	op = '-';
	        }	        
	        if(ae.getSource()==b13) {
	        	n1=Integer.parseInt(tf1.getText());
	        	tf1.setText("");
	        	op = '*';
	        }	        
	        if(ae.getSource()==b14) {
	        	n1=Integer.parseInt(tf1.getText());
	        	tf1.setText("");
	        	op = '/';
	        }	        
	        if(ae.getSource()==b15) {
	        	tf1.setText("");
	        	n1=0;
	        	n2=0;
	        	res=0;
	        }	
	        
	        if(ae.getSource()==b16) {
	        	n2 = Integer.parseInt(tf1.getText());
	        	tf1.setText("");
	        	if(op=='+') {
	        		res = n1+n2;
	        		tf1.setText(String.valueOf(res));
	        	}
	        	else if(op=='-') {
	        		res = n1-n2;
	        		tf1.setText(String.valueOf(res));
	        	}
	        	else if(op=='*') {  
	        		res = n1*n2;
	        		tf1.setText(String.valueOf(res));
	        	}
	        	else if(op=='/') { 
	        		if(n2==0) {
	        			tf1.setText("Divide by zero error");	
	        		}
	        		else {
	        		res = n1/n2;
	        		tf1.setText(String.valueOf(res));
	        		}
	        	}
	        	else {	        		
	        		tf1.setText(String.valueOf(n2));
	        	}
	        }
		}
		 catch(Exception e) {
			tf1.setText("Invalid");	        	
	      }
		}
		public static void main(String[] args) {
			CalculatorGUI f = new CalculatorGUI();
	        f.setTitle("Calci");
	        f.setSize(600, 600);
	        f.setVisible(true);
	        f.setBackground(Color.PINK);
	        f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	                System.exit(0);
	            }
	        });
			
	}

}