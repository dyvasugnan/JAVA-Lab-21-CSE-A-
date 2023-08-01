

package AWT;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;


public class Calci extends Frame implements ActionListener {
	int Ans = 0;
	String OP ="";
	
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,minus,mult,div,res,backspc;
	TextArea area = new TextArea("Enter here");

	Calci(){

		
	
		area.setBounds(100,100,200,80);
		
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
		mult = new Button("*");
		 minus= new Button("-");
		plus = new Button("+");
		
		backspc = new Button("<-");
		div = new Button("/");
		res = new Button("=");
		
		b1.setBounds(100,200,40,40);
		b2.setBounds(160,200,40,40);
		b3.setBounds(220,200,40,40);
		plus.setBounds(280,200,40,40);


		b4.setBounds(100,260,40,40);
		b5.setBounds(160,260,40,40);
		b6.setBounds(220,260,40,40);
		minus.setBounds(280,260,40,40);
		
		b7.setBounds(100,320,40,40);
		b8.setBounds(160,320,40,40);
		b9.setBounds(220,320,40,40);
		mult.setBounds(280,320,40,40);
		
		b0.setBounds(100,380,40,40);
		
		backspc.setBounds(160,380,40,40);
		res.setBounds(220,380,40,40);
		div.setBounds(280,380,40,40);
		
		
		this.add(area);
		this.add(b1);
		
		this.add(b2);
		this.add(b3);
		this.add(plus);

		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(minus);

		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(mult);

		this.add(b0);
		
		this.add(backspc);
		this.add(res);
		this.add(div);

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
		minus.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		backspc.addActionListener(this);
		res.addActionListener(this);
		
		
	
	
	}
	
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		if(str=="0"){
			area.append(str);

		}
		if(str=="1"){
			area.append(str);
			
		}
		if(str=="2"){
			area.append(str);
			
		}
		if(str=="3"){
			area.append(str);
			
		}
		if(str=="4"){
			area.append(str);
			
		}
		if(str=="5"){
			area.append(str);
			
		}
		if(str=="6"){
			area.append(str);
			
		}
		if(str=="7"){
			area.append(str);
			
		}
		if(str=="8"){
			area.append(str);
			
		}
		if(str=="9"){
			area.append(str);
			
		}
		if(str=="+"){
			// int s = Integer.parseInt(area.getText());
			// Ans += s;
			area.append("+");
			
			
		}
		if(str=="-"){
			// int s = Integer.parseInt(area.getText());
			// Ans += s;
			area.append("-");
			
		}
		if(str=="*"){
			// int s = Integer.parseInt(area.getText());
			// Ans += s;
			area.append("*");
			
		}
		if(str=="/"){
			// int s = Integer.parseInt(area.getText());
			// Ans /= s;
			area.append("/");
			
		}
		if(str=="="){
			String s = area.getText();
			StringTokenizer st = new StringTokenizer(s, "+-*/=",true);
			int num[] = new int[10];
			int i=0;

			while(st.nextToken()!="="){
				String tok = st.nextToken();
				if(tok == "+"){
					OP = "+";
				}
				else if(tok == "-"){
					OP = "-";
				}
				else if(tok == "*"){
					OP = "*";
				}
				else if(tok == "/"){
					OP = "/";
				}
				else{
				num[i] = Integer.parseInt(tok);
				i++;
				}

				if(OP=="+"){
					Ans += num[i];
					OP ="";
				}else if(OP=="-"){
					Ans -=num[i];
					OP="";
				
				}else if(OP=="*"){
					Ans *=num[i];
					OP="";
				}
				else if(OP=="/"){
					Ans /=num[i];
					OP="";
				}

			}


			area.setText(String.valueOf(Ans));
		}

			


		
		if(str=="<-"){
			String txt = area.getText();
		String newtxt = txt.substring(0,txt.length()-1);
		area.setText(newtxt);
		}
	}
		


	public static void main(String args[]){
		Calci c = new Calci();
		c.setTitle("Calculator");
		c.setSize(400,400);
		c.setVisible(true);

		c.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					System.exit(0);
				}
			});
		}

		





	
}
