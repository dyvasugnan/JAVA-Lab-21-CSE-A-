import java.awt.*;// abstract window toolkit
import java.awt.event.*;
public class FrameClassAdd extends Frame implements ActionListener {
		Button b1,clear;
		TextField n1,n2,res;
		Label num1,num2,result;
		FrameClassAdd(){
			this.setLayout(null);
			b1 = new Button("Add");
			clear = new Button("Clear");
			num1 = new Label("Number 1");
			num2 = new Label("Number 2");
			result = new Label("Result");
			n1 = new TextField();
			n2 = new TextField();
			res = new TextField();
			num1.setBounds(250, 150, 100, 50);
			n1.setBounds(350, 150, 100, 50);
			
			num2.setBounds(250, 250, 100, 50);
			n2.setBounds(350, 250, 100, 50);
			
			result.setBounds(250, 350, 100, 50);
			res.setBounds(350, 350, 100, 50);
			
			b1.setBounds(200, 450, 100, 50);
			clear.setBounds(350, 450, 100, 50);
			
			this.add(b1);
			this.add(num1);
			this.add(num2);
			this.add(result);
			this.add(n1);
			this.add(n2);
			this.add(res);
			this.add(clear);
			b1.addActionListener(this);
			n1.addActionListener(this);
			n2.addActionListener(this);
			res.addActionListener(this);
			clear.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "Add") {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a+b ;
				res.setText(String.valueOf(c));
			}
			if (str.equals("Clear")) {
	            n1.setText("");
	            n2.setText("");
	            res.setText("");
	        }
			
				
			}
		
	
	public static void main(String[] args) {
		FrameClassAdd f = new FrameClassAdd();
		f.setTitle("Test");
		f.setSize(600, 600);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}