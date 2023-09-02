package javalab;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener
{  
	
   JButton b1,b2,b3,b4,b5,b6; 
   JButton b[]=new JButton[10];
    	    int i,r,n1,n2;
    	    JTextField res;
    	    char op; 
    	   public Calculator()
    	  {
    	     super("Calulator");
    	      setLayout(new BorderLayout());
    	      JPanel p=new JPanel();
    	      p.setLayout(new GridLayout(4,4));
    	      for(int i=0;i<=9;i++)
    	      {
    	        b[i]=new JButton(i+"");
    	        p.add(b[i]);
    	        b[i].addActionListener(this);
    	      }
    	      b1=new JButton("+");
    	      p.add(b1);
    	      b1.addActionListener(this);
    	 
    	      b2=new JButton("-");
    	      p.add(b2);
    	      b2.addActionListener(this);
    	 
    	      b3=new JButton("*");
    	      p.add(b3);
    	      b3.addActionListener(this);
    	 
    	      b4=new JButton("/");
    	      p.add(b4);
    	      b4.addActionListener(this);
    	 
    	      b5=new JButton("=");
    	      p.add(b5);
    	      b5.addActionListener(this);
    	 
    	      b6=new JButton("C");
    	      p.add(b6);
    	      b6.addActionListener(this);
    	 
    	      res=new JTextField(10);
    	      add(p,BorderLayout.CENTER);
    	      add(res,BorderLayout.NORTH);
    	      setVisible(true);
    	      setSize(200,200);
    	     }
    	public void actionPerformed(ActionEvent ae)
    	{
    	  JButton pb=(JButton)ae.getSource();
    		if(pb==b6)
    		{
    		 r=n1=n2=0;
    		 res.setText("");
    		}
    		else
    			if(pb==b5)
    			{
    	 		 n2=Integer.parseInt(res.getText());
    	  		 eval();
    	  		 res.setText(""+r);
    			}
    	 
    			else
    			{
    	 		  boolean opf=false;
    	 		  if(pb==b1)
    				{ op='+';
    				  opf=true;
    				}
    	 		  if(pb==b2)
    				{ op='-';opf=true;}
    			  if(pb==b3)
    				{ op='*';opf=true;}
    			  if(pb==b4)
    				{ op='/';opf=true;}
    		
    			  if(opf==false)
    			  {
    	  		   for(i=0;i<10;i++)
    			   {
    			  	if(pb==b[i])
    	     		  	{
    	           	   	String t=res.getText();
    	           		t+=i;
    	            		res.setText(t);
    			  	}
    			   }
    			  }
    			  else
    			  {
    	    			n1=Integer.parseInt(res.getText());
    	     			res.setText("");
    			  }
    			}
    	}
    	int eval()
    	{
    		switch(op)
    		{
    	 	case '+':   r=n1+n2;  break;
    	 	case '-':    r=n1-n2;   break;
    	 	case '*':    r=n1*n2; break;
    	 	case '/':    r=n1/n2; break;
    	 
    		}
    		return 0;
    	}
    	 
    	  public static void main(String arg[])
    	  {
    	      new Calculator();
    	   }
    	}
