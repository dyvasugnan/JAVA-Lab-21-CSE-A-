
import java.awt.*;
import java.awt.event.*;
public class IntegerDivision extends Frame implements ActionListener{ 
	 Button b1,b2;
	    TextField tf1, tf2, tf3; 
	    Label l1,l2,l3;
	    IntegerDivision() {
	        this.setLayout(null);
	        
	        b1 = new Button("Divide");
	        b2 = new Button("Clear");
	        
	        l1 = new Label("Num 1");
	        l2 = new Label("Num 2");
	        l3 = new Label("Result");
	        
	        tf1 = new TextField();
	        tf2 = new TextField();
	        tf3 = new TextField();
	        
	        
	        l1.setBounds(100,150,100,30);
	        tf1.setBounds(200,150,250,30);
	                
	        l2.setBounds(100,250,100,30);
	        tf2.setBounds(200,250,250,30);        
	        
	        l3.setBounds(100,350,100,30);
	        tf3.setBounds(200,350,250,30);
	       
	        b1.setBounds(100, 450, 80, 30);
	        b2.setBounds(200, 450, 80, 30);
	        
	        this.add(b1);
	        this.add(b2);
	        this.add(l1);
	        this.add(l2);
	        this.add(l3);
	        this.add(tf1);
	        this.add(tf2);
	        this.add(tf3);

	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        tf1.addActionListener(this);
	        tf2.addActionListener(this);
	        tf3.addActionListener(this);
	    }

	    public void actionPerformed(ActionEvent ae) {
	        String str = ae.getActionCommand();

	       if(str.equals("Divide")) {
	    		  try {
	    			  int n1=Integer.parseInt(tf1.getText());
	    			  int n2= Integer.parseInt(tf2.getText());
	    			  int res=n1/n2;
	    			  tf3.setText(String.valueOf(res));
	    			  }
	    		  catch(NumberFormatException e) {
	    			 // tf3.setText("Invalid input");
	    			  showErrorDialog("Invalid input");
	    		  }
	    		  catch(ArithmeticException arrex) {
	    			 // tf3.setText("Division by zero! not possible !!");	
	    			  showErrorDialog("Division by zero! not possible !!");
	    		  }
	    	  }
		    if(str=="Clear") {
		        	tf1.setText("");
		            tf2.setText("");
		            tf3.setText("");
		     }
	        
	    }
	    
private void showErrorDialog(String msg) {
    Dialog d = new Dialog(this, "Error", true);
    d.setLayout(null);
    Label l = new Label(msg);
    l.setBounds(80,100,250,30);
    Button b = new Button("OK");
    b.setBounds(100,150,80,30);
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            d.dispose();
        }
    });
    d.add(l);
    d.add(b);
    d.setSize(300,300);
    d.setVisible(true);
}



	    public static void main(String[] args) {
	    	IntegerDivision f = new IntegerDivision();
	        f.setTitle("Division");
	        f.setSize(600, 600);
	        f.setVisible(true);
	        f.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	                System.exit(0);
	            }
	        });
	    }
	}

