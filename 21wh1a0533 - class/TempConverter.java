package javaclass;
import java.awt.*;// abstract window toolkit
import java.awt.event.*;
import javax.swing.*;
public class TempConverter extends Frame implements ActionListener {
		Button f,c,clr;
		TextField t1,t2;
		Label num,result;
		TempConverter(){
			this.setLayout(null);
			f = new Button("Fahrenheit");
			c = new Button("Celsius");
			clr = new Button("Clear");
			num = new Label("Number");
			result = new Label("Result");
			t1 = new TextField();
			t2 = new TextField();
			
			num.setBounds(100, 150, 100, 50);
			t1.setBounds(200, 150, 100, 50);
			
			result.setBounds(100, 250, 100, 50);
			t2.setBounds(200, 250, 100, 50);
			
		
			f.setBounds(110, 350, 100, 50);
			c.setBounds(260, 350, 100, 50);
			clr.setBounds(180, 420, 100, 50);
			
			this.add(f);
			this.add(c);
			this.add(clr);
			this.add(num);
			this.add(result);
			this.add(t1);
			this.add(t2);
			
			f.addActionListener(this);
			c.addActionListener(this);
			clr.addActionListener(this);
			t1.addActionListener(this);
			t2.addActionListener(this);
		}
		
		  public void actionPerformed(ActionEvent ae) {
		        String str = ae.getActionCommand();
		        if (str.equals("Fahrenheit")) {
		            double celsius = Double.parseDouble(t1.getText());
		            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
		            t2.setText(String.valueOf(fahrenheit));
		            t2.setText(String.format("%.2f", fahrenheit));
		        }
		        if (str.equals("Celsius")) {
		        	double fahrenheit = Double.parseDouble(t1.getText());
		            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
		            t2.setText(String.valueOf(celsius));
		            t2.setText(String.format("%.2f", celsius));
		        }
		        if (str.equals("Clear")) {
		            t1.setText("");
		            t2.setText("");
		        }
		    }
		
	
	public static void main(String[] args) {
		TempConverter t = new TempConverter();
		t.setTitle("Temperature ");
		t.setSize(400, 400);
		t.setVisible(true);
		t.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}

