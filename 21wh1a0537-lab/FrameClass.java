import java.awt.*;
import java.awt.event.*;
public class FrameClass extends Frame implements ActionListener {
		Button b1,b2;
		TextField n1,n2,n3,res;
		Label num1,num2,result;
		FrameClass(){
			this.setLayout(null);
			b1 = new Button("divide");
            b2=new Button("clear");
			num1 = new Label("Number 1");
			num2 = new Label("Number 2");
			result = new Label("Result");
			n1 = new TextField();
			n2 = new TextField();
            n3=new TextField();
			res = new TextField();
			num1.setBounds(100, 150, 100, 50);
			n1.setBounds(200, 150, 100, 50);
			
			num2.setBounds(100, 250, 100, 50);
			n2.setBounds(200, 250, 100, 50);
            n3.setBounds(300,250,100,50);
			
			result.setBounds(100, 350, 100, 50);
			res.setBounds(200, 350, 100, 50);
			b1.setBounds(100, 450, 100, 50);
            b2.setBounds(200,450,100,50);
			this.add(b1);
            this.add(b2);
			this.add(num1);
			this.add(num2);
			this.add(result);
			this.add(n1);
			this.add(n2);
            this.add(n3);
			this.add(res);
			b1.addActionListener(this);
            b2.addActionListener(this);
			n1.addActionListener(this);
			n2.addActionListener(this);
            n3.addActionListener(this);
			res.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "divide") {
				
                try{
                    
                    int a = Integer.parseInt(n1.getText());
				    int b = Integer.parseInt(n2.getText());

                if(b==0)
                    n3.setText("b cant be zero");
                else{
                
				int c = a/b ;
				res.setText(String.valueOf(c));
                }}
            
            catch (NumberFormatException ex) 
            {
                n3.setText("Invalid input");
            }
			}
            else if(str=="clear"){
                n1.setText("");
                n2.setText("");
                n3.setText("");
                res.setText("");
            }
				
			}
		
	
	public static void main(String[] args) {
		FrameClass f = new FrameClass();
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