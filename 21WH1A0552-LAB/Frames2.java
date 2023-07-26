import java.awt.*;// abstract window toolkit
import java.awt.event.*;
public class Frames2 extends Frame implements ActionListener {
		Button b1,b2;
		TextField n1,n2,res;
		Label num1,num2,result;
		Frames2(){
			this.setLayout(null);
			b1 = new Button("Div");
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
                        b2.setBounds(150,550,100,50);
			this.add(b1);
                        this.add(b2);
			this.add(num1);
			this.add(num2);
			this.add(result);
			this.add(n1);
			this.add(n2);
			this.add(res);
			b1.addActionListener(this);
                        b2.addActionListener(this);
			n1.addActionListener(this);
			n2.addActionListener(this);
			res.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "Div") {
                                try{
				        int a = Integer.parseInt(n1.getText());
			        	int b = Integer.parseInt(n2.getText());
				        int c = a/b;
				        res.setText(String.valueOf(c));
                                }
                                catch(Exception e){
                                        res.setText("Undefined");
                                }
                        }
                        if(str == "Clear"){
                                res.setText("");
                                n1.setText("");
                                n2.setText("");                 
			}				
	        }	
	        public static void main(String[] args) {
		        Frames2 f = new Frames2();
		        f.setTitle("Test");
		        f.setSize(1800,1400);
		        f.setVisible(true);
		        f.addWindowListener(new WindowAdapter() {
			        public void windowClosing(WindowEvent we) {
				        System.exit(0);
			        }
		        });
	        }
}
