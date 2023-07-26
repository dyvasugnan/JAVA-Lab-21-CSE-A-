import java.awt.*;
import java.awt.event.*;

public class FrameDivisionClass extends Frame implements ActionListener {
    Button b1,b2;
    TextField tf1, tf2, tf3; 
    Label l1,l2,l3;
    FrameDivisionClass() {
        this.setLayout(null);
        
        b1 = new Button("Divide");
        b2 = new Button("Clear");
        
        l1 = new Label("Number 1");
        l2 = new Label("Number 2");
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
   
        if (str=="Divide") {
	        try {
	           float n1=Float.parseFloat(tf1.getText());
	           float n2=Float.parseFloat(tf2.getText());
	           
	           if(n2==0)
	        	   tf3.setText("Division by zero! not possible !!");	           
	           else {
	           float res = n1/n2;
	           tf3.setText(String.valueOf(res));
	           }
	        }  	    
				
		    catch(NumberFormatException e1){
				tf3.setText("Invalid input");
			}
       }
	    if(str=="Clear") {
	        	tf1.setText("");
	            tf2.setText("");
	            tf3.setText("");
	     }
        
    }

    public static void main(String[] args) {
        FrameDivisionClass f = new FrameDivisionClass();
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


