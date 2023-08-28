import java.awt.*;
import java.awt.event.*;
public class FrameClassCalculator extends Frame implements ActionListener {
		Button b1,b2,b3,b4,b5;
		TextField n1,n2,res;
		Label num1,num2,result;
		FrameClassCalculator(){
			//this.setLayout(new GridLayout(1,1));
			b1=new Button("+");
			b2 = new Button("-");
			b3=new Button("*");
			b4=new Button("/");
			b5=new Button("AC");
			num1 = new Label("Number 1");
			num2 = new Label("Number 2");
			result = new Label("Result");
			b5=new Button("AC");
			n1 = new TextField();
			n2 = new TextField();
			res = new TextField();
			/*num1.setBounds(100, 250, 100, 50);
			n1.setBounds(200, 150, 100, 50);
			
			num2.setBounds(100, 300, 100, 50);
			n2.setBounds(200, 250, 100, 50);
			
			result.setBounds(100, 350, 100, 50);
			res.setBounds(200, 350, 500, 50);
			//b1.setBounds(150, 450, 100, 50);
			//b2.setBounds(150,550,100,50);*/
			this.setLayout(new GridLayout(3,2));
			
			this.add(b1);
			this.add(b2);
			this.add(b3);
			this.add(b4);
			this.add(b5);
			this.add(num1);
			this.add(num2);
			this.add(result);
			this.add(n1);
			this.add(n2);
			this.add(res);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			n1.addActionListener(this);
			n2.addActionListener(this);
			res.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String str = ae.getActionCommand();
			if(str == "/")
			{   try
			   {
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a/b ;
				res.setText(String.valueOf(c));
			   }
			   catch(ArithmeticException AE)
			   {
				res.setText(String.valueOf(AE));
			   }
			   catch(NumberFormatException nfe)
			   {
				res.setText(String.valueOf(nfe));
			   }
			}
			if(str =="AC")
			{
				n1.setText(String.valueOf(0));
				n2.setText(String.valueOf(0));
				res.setText(String.valueOf(0));
				
			}
			if(str=="+")
			{
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a+b ;
				res.setText(String.valueOf(c));
			}
			if(str=="-")
			{
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a-b ;
				res.setText(String.valueOf(c));
			}
			if(str=="*")
			{
				int a = Integer.parseInt(n1.getText());
				int b = Integer.parseInt(n2.getText());
				int c = a*b ;
				res.setText(String.valueOf(c));
			}
			
		}
			
				
			
		
	
	public static void main(String[] args) {
		FrameClassCalculator f = new FrameClassCalculator();
		f.setTitle("Test");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
