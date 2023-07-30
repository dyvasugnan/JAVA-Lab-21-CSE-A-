
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener{
		
		Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ac;
		Button add,sub,mul,div,equal;
		TextField t;
		Calculator(){
			this.setLayout(null);
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
			
			ac = new Button("AC");
			add = new Button("+");
			sub = new Button("-");
			mul = new Button("*");
			div = new Button("/");
			equal = new Button("=");
			
			t = new TextField();
			
			t.setBounds(300, 200, 400, 50);
			
			b0.setBounds(300, 400, 100, 50);
			b1.setBounds(500, 350, 100, 50);
			b2.setBounds(400, 350, 100, 50);
			b3.setBounds(300, 350, 100, 50);
			b4.setBounds(500, 300, 100, 50);
			b5.setBounds(400, 300, 100, 50);
			b6.setBounds(300, 300, 100, 50);
			b7.setBounds(500, 250, 100, 50);
			b8.setBounds(400, 250, 100, 50);
			b9.setBounds(300, 250, 100, 50);
			
			ac.setBounds(400, 400, 100, 50);
			add.setBounds(600, 400, 100, 50);
			sub.setBounds(600, 350, 100, 50);
			mul.setBounds(600, 300, 100, 50);
			div.setBounds(600, 250, 100, 50);
			equal.setBounds(500, 400, 100, 50);
			
			this.add(t);
			
			this.add(b0);
			this.add(b1);
			this.add(b2);
			this.add(b3);
			this.add(b4);
			this.add(b5);
			this.add(b6);
			this.add(b7);
			this.add(b8);
			this.add(b9);
			
			this.add(ac);
			this.add(add);
			this.add(sub);
			this.add(mul);
			this.add(div);
			this.add(equal);
			
			t.addActionListener(this);
			
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
			
			ac.addActionListener(this);
			add.addActionListener(this);
			sub.addActionListener(this);
			mul.addActionListener(this);
			div.addActionListener(this);
			equal.addActionListener(this);
		}
	
		int x = 0;
		int y = 0;
		int z = 0;
		String op;
		
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			try {
			System.out.println("Button pressed: " + str);
			if(str.equals("0")) 
				t.setText(t.getText() + "0");
			else if(str.equals("1")) 
				t.setText(t.getText() + "1");
			else if(str.equals("2"))
				t.setText(t.getText() + "2");
			else if(str.equals("3"))
				t.setText(t.getText() + "3");
			else if(str.equals("4"))
				t.setText(t.getText() + "4");
			else if(str.equals("5"))
				t.setText(t.getText() + "5");
			else if(str.equals("6"))
				t.setText(t.getText() + "6");
			else if(str.equals("7"))
				t.setText(t.getText() + "7");
			else if(str.equals("8"))
				t.setText(t.getText() + "8");
			else if(str.equals("9"))
				t.setText(t.getText() + "9");
			
			else if(str.equals("+")){
				x = Integer.parseInt(t.getText());
				op = "+";
				t.setText(" ");
				str = t.getText();
				str = str.trim();
				t.setText(str);
			}
			else if(str.equals("-")) {
				x = Integer.parseInt(t.getText());
				op = "-";
				t.setText(" ");
				str = t.getText();
				str = str.trim();
				t.setText(str);
			}
			else if(str.equals("*") ){
				x = Integer.parseInt(t.getText());
				op = "*";
				t.setText(" ");
				str = t.getText();
				str = str.trim();
				t.setText(str);
			}
			else if(str.equals("/")) {
				x = Integer.parseInt(t.getText());
				op = "/";
				t.setText(" ");
				str = t.getText();
				str = str.trim();
				t.setText(str);
			}
			else if(str.equals("=")) {
				y = Integer.parseInt(t.getText());
				t.setText(" ");
				calc(x,y,op);
				t.setText(String.valueOf(z));
			}
			else if(str.equals("AC")) {
				t.setText(" ");
				str = t.getText();
				str = str.trim();
				t.setText(str);
			}
			}
		catch(ArithmeticException ae1){
			System.out.print("Division by zero not possible");
			t.setText("Invalid");
			}
		catch(NumberFormatException ne){
				System.out.print("Invalid input");
				t.setText("Invalid input");
			}
		}
			public int calc(int x,int y, String op) {
				switch(op) {
				case "+" :  z = x+y;
				break;
				case "-" :  z = x-y;
				break;
				case "*" :  z = x*y;
				break;
				case "/" :  z = x/y;
				break;
				}
				return z;
			}
		
		
public static void main(String args[]) {
	Calculator c = new Calculator();
	c.setTitle("Calculator");
	c.setSize(400, 400);
	c.setVisible(true);
	c.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}

}
