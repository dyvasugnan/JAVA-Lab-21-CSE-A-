package java_labcodes;
import java.awt.*;
import java.awt.event.*;
public class Try extends Frame implements ActionListener {
		Button comp,clear;
		TextField n,res;
		Label num,result;
		Try(){
			this.setLayout(null);
			comp = new Button("comp");
			clear=new Button("Clear");
			num = new Label("Number");
			result = new Label("Result");
			n = new TextField();
			res = new TextField();
			num.setBounds(100, 150, 100, 50);
			n.setBounds(200, 150, 100, 50);
			result.setBounds(320, 150, 100, 50);
			res.setBounds(450, 150, 100, 50);
			comp.setBounds(150, 350, 100, 50);
			clear.setBounds(300,350,100,50);
			this.add(comp);
			this.add(clear);
			this.add(num);
			this.add(result);
			this.add(n);
			this.add(res);
			comp.addActionListener(this);
			clear.addActionListener(this);
			n.addActionListener(this);
			res.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String str = ae.getActionCommand();
			if(str == "comp")
			{
				int num = Integer.parseInt(n.getText());
				int c = 1;
				for(int i=num;i>0;i--) {
					c=c*i;
				}
				res.setText(String.valueOf(c));
			}
			if(str == "Clear")
			{
				n.setText("");
				res.setText("");
				
			}
		}
		public static void main(String[] args) {
		Try t = new Try();
		t.setTitle("Calculate");
		t.setSize(450, 450);
		t.setVisible(true);
		t.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}