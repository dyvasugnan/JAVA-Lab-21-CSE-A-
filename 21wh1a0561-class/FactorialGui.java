package javalab;
import java.awt.*;
import java.awt.event.*;
public class FactorialGui extends Frame implements ActionListener {
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2;
	FactorialGui(){
		this.setLayout(null);
		b1 = new Button("Compute");
		b2 = new Button("Clear");
		l1 = new Label("Enter");
		l2 = new Label("Output");
		t1 = new TextField( );
		t2 = new TextField( );
		l1.setBounds(100,150,100,50);
		t1.setBounds(100,250,100,50);
		l2.setBounds(100,350,100,50);
		t2.setBounds(100,450,100,50);
		b1.setBounds(200,500,100,50);
		b2.setBounds(300,500,100,50);
		this.add(l1);
		this.add(l2);
		this.add(t1);
		this.add(t2);
		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae){
			String str  = ae.getActionCommand();
			if(str == "Compute"){
				int n = Integer.parseInt(t1.getText());
				int fact = 1;
				for(int i=1;i<=n;i++) {
					fact=fact*i;
				}
				t2.setText(String.valueOf(fact));
			}
			if(str=="Clear"){
				t1.setText("");
				t2.setText("");
			}
		}	
   public static void main(String args[]){
	FactorialGui f = new FactorialGui();
	    f.setTitle("Fatorial");
	    f.setSize(400,400);
	    f.setVisible(true);
	    f.addWindowListener(new WindowAdapter(){
	    	public void windowClosing(WindowEvent we){
			     System.exit(0);
		    }
	    });
   }
}
	
		
	
