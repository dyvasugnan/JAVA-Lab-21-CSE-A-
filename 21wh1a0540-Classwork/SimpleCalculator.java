package javaclass;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener{
	public static void main(String args[]) {
		SimpleCalculator c=new SimpleCalculator();
	     c.setTitle("Simple Calulator");
	     c.setSize(400,400);
	     c.setVisible(true);
	     c.addWindowListener(new WindowAdapter() {
	    	 public void windowClosing(WindowEvent we) {
	    		 System.exit(0);
	    	 }
	     });
	}
	TextField t;
	//for numbers 0-9
	Button[] nums=new Button[10];
	Button add,sub,mul,div,clr,dlt,eq,pt;
	//for add ,sub...
	Button[] op=new Button[8];
	
	double n1=0,n2=0,res=0;
	char operator;
	SimpleCalculator(){
		this.setLayout(null);
		 t=new TextField();
		t.setBounds(50,40,300,50);
		t.setEditable(false);//no new vales can be taken in text field.only from existing buttons!
		t.setBackground(Color.CYAN);
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
		dlt.setBounds(50,400,100,50);
		clr.setBounds(250,400,100,50);
		//instead of seting boundss..it directly gives space between the components
		Panel p=new Panel();
		p.setBounds(50,100,300,300);
		p.setLayout(new GridLayout(4,4,10,10));//4x4 buttons with space 10,10
		p.setBackground(Color.CYAN);
		p.add(nums[1]);
		p.add(nums[2]);
		p.add(nums[3]);
		p.add(add);
		
		p.add(nums[4]);
		p.add(nums[5]);
		p.add(nums[6]);
		p.add(sub);
		
		p.add(nums[7]);
		p.add(nums[8]);
		p.add(nums[9]);
		p.add(mul);
		
		p.add(pt);
		p.add(nums[0]);
		p.add(eq);
		p.add(div);
		
		this.add(p);
		this.add(t);
		this.add(dlt);
		this.add(clr);
	}
	public void actionPerformed(ActionEvent ae) {
		// String s= ae.getActionCommand();
		for(int i=0;i<10;i++) {
			if(ae.getSource()== nums[i]) {
				t.setText(t.getText().concat(String.valueOf(i)));
			}
		}
		if(ae.getSource()==pt) {
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
		if(ae.getSource()== eq) {
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
			n1 = res; //if u want to continue 
		   }
		   catch (ArithmeticException e1) {
               t.setText("Division by 0 is invalid");
           }
        }
			
		if(ae.getSource()==clr) {
			t.setText("");
		}
		//only deleting the last digit or op
		if(ae.getSource()==dlt) {
			String s = t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++) {
				t.setText(t.getText()+s.charAt(i));
			}
		}
			
	}

}
	


