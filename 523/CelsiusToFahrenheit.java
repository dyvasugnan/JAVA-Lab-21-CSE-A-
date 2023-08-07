package labprograms;

import java.awt.*;
import java.awt.event.*;
public class CelsiusToFahrenheit extends Frame implements ActionListener {
		Button b1,b2;
		TextField t1,t2;
		Label l1,l2;
		CelsiusToFahrenheit(){
			this.setLayout(null);
			b1=new Button("C-F");
			b2=new Button("F-C");
			l1=new Label("Temp");
			l2=new Label("Res");
			t1=new TextField();
			t2=new TextField();
			this.add(b1);
			this.add(b2);
			this.add(l1);
			this.add(l2);
			this.add(t1);
			this.add(t2);
			b1.addActionListener(this);
			b2.addActionListener(this);
			t1.addActionListener(this);
			t2.addActionListener(this);
			
			l1.setBounds(180, 100, 100, 50);
			t1.setBounds(280, 100, 100, 50);
			l2.setBounds(180, 150, 100, 50);
			t2.setBounds(280, 150, 100, 50);
			b1.setBounds(180, 210, 100, 50);
			b2.setBounds(280, 210, 100, 50);


		}
		public void actionPerformed(ActionEvent ae) {
			String str=ae.getActionCommand();
			 int f,c,res;
			 int a = Integer.parseInt(t1.getText());
			if(str=="C-F") {
				f=(a*9/5)+32;
				res=f;
				t2.setText(String.valueOf(res));
			}
			else {
				c=(a-32)*5/9;
				res=c;
				t2.setText(String.valueOf(res));
			}
			
		}
	public static void main(String[] args) {
		CelsiusToFahrenheit cf = new CelsiusToFahrenheit();
		cf.setTitle("Test");
		cf.setSize(400, 400);
		cf.setVisible(true);
		cf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		}
	   );
	}
	}

