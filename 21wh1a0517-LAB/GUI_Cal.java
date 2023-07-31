package javalab;
import java.awt.*;
import java.awt.event.*;

public class GUI_Cal extends Frame implements ActionListener{
	public static void main(String args[]) {
		GUI_Cal c=new GUI_Cal ();
	     c.setTitle("Simple Calulator");
	     c.setSize(400,400);
	     c.setVisible(true);
	     c.addWindowListener(new WindowAdapter() {
	    	 public void windowClosing(WindowEvent we) {
	    		 System.exit(0);
	    	 }
	     });
	}
	TextField tf;
	
	Button[] nums=new Button[10];
	Button add,sub,mul,div,clr,dlt,eq,pt;
	
	Button[] op=new Button[8];
	
	double n1=0,n2=0,res=0;
	char operator;
	GUI_Cal(){
		this.setLayout(null);
		 tf=new TextField();
		 tf.setBounds(50,40,300,50);
		 tf.setEditable(false);tf.setBackground(Color.WHITE);
		 add=new Button("+");
		 sub=new Button("-");
		 mul=new Button("*");
		 div=new Button("/");
		 clr=new Button("CLR");
		 dlt=new Button("DLT");
		 eq=new Button("=");
		 pt=new Button(".");
		 op[0]=add;
		 op[1]=sub;
		 op[2]=mul;
		 op[3]=div;
		 op[4]=pt;
		 op[5]=eq;
		 op[6]=dlt;
		 op[7]=clr;
		
		 for(int i=0;i<8;i++)
			 op[i].addActionListener(this);
		 		for(int i=0;i<10;i++) {
		 			nums[i]=new Button(String.valueOf(i));
		 			nums[i].addActionListener(this);
		 		}
		 		dlt.setBounds(50,400,150,50);
		 		clr.setBounds(200,400,150,50);
		 		Panel p=new Panel();
		 		p.setBounds(50,100,300,300);
		 		p.setLayout(new GridLayout(4,4,10,10));
		 		p.setBackground(Color.BLACK);
		 		p.add(nums[7]);
				p.add(nums[8]);
				p.add(nums[9]);
				p.add(add);
				p.add(nums[4]);
				p.add(nums[5]);
				p.add(nums[6]);
				p.add(sub);
				p.add(nums[1]);
				p.add(nums[2]);
				p.add(nums[3]);
				p.add(mul);
				p.add(nums[0]);
				p.add(eq);
				p.add(pt);
				p.add(div);
				
		this.add(p);
		this.add(tf);
		this.add(dlt);
		this.add(clr);
	}
	public void actionPerformed(ActionEvent ae) {
		for(int i=0;i<10;i++) {
			if(ae.getSource()== nums[i]) {
				tf.setText(tf.getText().concat(String.valueOf(i)));
			}
		}
		if(ae.getSource()==pt) {
			tf.setText(tf.getText().concat("."));
		}
		if(ae.getSource()==add) {
			n1 = Double.parseDouble(tf.getText());
			operator = '+';
			tf.setText("");
		}
		if(ae.getSource()==sub) {
			n1 = Double.parseDouble(tf.getText());
			operator = '-';
			tf.setText("");
		}
		if(ae.getSource()==mul) {
			n1 = Double.parseDouble(tf.getText());
			operator = '*';
			tf.setText("");
		}
		if(ae.getSource()==div) {
			n1 = Double.parseDouble(tf.getText());
			operator = '/';
			tf.setText("");
		}
		if(ae.getSource()== eq) {
			n2 = Double.parseDouble(tf.getText());
			
			
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
			tf.setText(String.valueOf(res));
			n1 = res; 
		   }
		   catch (ArithmeticException e1) {
               tf.setText("Division by 0 is invalid");
           }
        }
			
		if(ae.getSource()==clr) {
			tf.setText("");
		}
		
		if(ae.getSource()==dlt) {
			String s = tf.getText();
			tf.setText("");
			for(int i=0;i<s.length()-1;i++) {
				tf.setText(tf.getText()+s.charAt(i));
			}
		}
			
	}

}
	


