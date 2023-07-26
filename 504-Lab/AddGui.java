
package moulikaLab;

import java.awt.*;// abstract window toolkit
import java.awt.event.*;
public class AddGui extends Frame implements ActionListener {
		Button b1, b2, b3;
		TextField n1,n2,res;
		Label num1,num2,result, Title;
		AddGui(){
			this.setLayout(null);
			b1 = new Button("Add");
			b2 = new Button("Clear");
			b3 = new Button("Multiply");
			num1 = new Label("Number 1");
			num2 = new Label("Number 2");
			result = new Label("Result");
			Title = new Label("Basic Calci");
			n1 = new TextField();
			n2 = new TextField();
			res = new TextField();
			
			Title.setBounds(150, 50, 100, 50);
			num1.setBounds(100, 150, 100, 50);
			n1.setBounds(200, 150, 100, 50);
			
			num2.setBounds(100, 250, 100, 50);
			n2.setBounds(200, 250, 100, 50);
			
			result.setBounds(100, 350, 100, 50);
			res.setBounds(200, 350, 100, 50);
			
			b1.setBounds(75, 450, 100, 50);
			
			b2.setBounds(150, 550, 100, 50);
			
			b3.setBounds(200, 450, 100, 50);
			
			this.setBackground(Color.lightGray);
			
			this.add(b1);
			this.add(b2);
			this.add(b3);
			this.add(num1);
			this.add(num2);
			this.add(result);
			this.add(Title);
			this.add(n1);
			this.add(n2);
			this.add(res);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			n1.addActionListener(this);
			n2.addActionListener(this);
			res.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "Add") {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a+b ;
				res.setText(String.valueOf(c));
			}
			if(str == "Multiply") {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a*b ;
				res.setText(String.valueOf(c));
			}
			if(str == "Clear") {
				n1.setText("");
				n2.setText("");
				res.setText("");
			}
				
			
		}
		
	
	public static void main(String[] args) {
		AddGui f = new AddGui();
		f.setTitle("My Personal Calci");
		f.setSize(500, 500);
		f.setVisible(true);
		f.setBackground(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}