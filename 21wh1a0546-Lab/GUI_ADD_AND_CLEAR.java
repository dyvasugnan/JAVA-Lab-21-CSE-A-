/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.awt.*;// abstract window toolkit
import java.awt.event.*;
public class FrameClass extends Frame implements ActionListener {
		Button b1,b2;
		TextField n1,n2,res;
		Label num1,num2,result;
        Color c;
		FrameClass(){
			this.setLayout(null);
            this.setBackground(Color.green);
			b1 = new Button("Add");
            b2 = new Button("Clear");
			num1 = new Label("Number 1");
			num2 = new Label("Number 2");
			result = new Label("Result");
			n1 = new TextField();
			n2 = new TextField();
			res = new TextField();
			num1.setBounds(100, 150, 100, 50);
			n1.setBounds(200, 150, 100, 50);
			num2.setBounds(100, 250, 100, 50);
			n2.setBounds(200, 250, 100, 50);
			result.setBounds(100, 350, 100, 50);
			res.setBounds(200, 350, 100, 50);
			b1.setBounds(150, 450, 100, 50);
            b2.setBounds(150, 550, 100, 50);
            this.add(b2);
			this.add(b1);
			this.add(num1);
			this.add(num2);
			this.add(result);
			this.add(n1);
			this.add(n2);
			this.add(res);
            b2.addActionListener(this);
			b1.addActionListener(this);
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
            if(str=="Clear")
            {
                n1.setText("");
                n2.setText("");
                res.setText("");
            }
				
			}
		
	
	public static void main(String[] args) {
		FrameClass f = new FrameClass();
		f.setTitle("Test");
		f.setSize(700, 700);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}
