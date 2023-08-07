package javaclass;
import java.awt.*;// abstract window toolkit
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConverter extends Frame implements ActionListener {
		Button r,d,clr;
		TextField t1,t2;
		Label num,result;
		CurrencyConverter (){
			this.setLayout(null);
			r = new Button("Rupees");
			d = new Button("Dollars");
			clr = new Button("Clear");
			num = new Label("Number");
			result = new Label("Result");
			t1 = new TextField();
			t2 = new TextField();
			
			num.setBounds(100, 150, 100, 50);
			t1.setBounds(200, 150, 100, 50);
			
			result.setBounds(100, 250, 100, 50);
			t2.setBounds(200, 250, 100, 50);
			
		
			r.setBounds(110, 350, 100, 50);
			d.setBounds(260, 350, 100, 50);
			clr.setBounds(180, 420, 100, 50);
			
			this.add(r);
			this.add(d);
			this.add(clr);
			this.add(num);
			this.add(result);
			this.add(t1);
			this.add(t2);
			
			r.addActionListener(this);
			d.addActionListener(this);
			clr.addActionListener(this);
			t1.addActionListener(this);
			t2.addActionListener(this);
		}
		
		  public void actionPerformed(ActionEvent ae) {
		        String str = ae.getActionCommand();
		        if (str.equals("Rupees")) {
		            double dollars = Double.parseDouble(t1.getText());
		            double rupees = (dollars * 80);
		            t2.setText(String.valueOf(rupees));
		            t2.setText(String.format("%.2f", rupees));
		        }
		        if (str.equals("Dollars")) {
		        	double rupees= Double.parseDouble(t1.getText());
		            double dollars = (rupees/ 80);
		            t2.setText(String.valueOf(dollars));
		            t2.setText(String.format("%.2f", dollars));
		        }
		        if (str.equals("Clear")) {
		            t1.setText("");
		            t2.setText("");
		        }
		    }
		
	
	public static void main(String[] args) {
		CurrencyConverter t = new CurrencyConverter();
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

