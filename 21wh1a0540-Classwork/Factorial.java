/*package javaclass;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Factorial extends Frame implements ActionListener{
public static void main(String args[]) {
		Factorial f = new Factorial();
		f.setTitle("");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
	    });
}

/*Button b1,b2;
TextField t1;
Text2;
Factorial(){
	b1=new Button("compute");
	b2=new Button("Clear");
	t1=new TextField();
	t2=new TextField();
	
	b1.setBounds(100, 150, 100, 50);
	b2.setBounds(200, 150, 100, 50);
	
	t1.setBounds(100, 100, 100, 50);
	t2.setBounds(200, 100, 100, 50);
	
	this.add(b1);
	this.add(b2);
	this.add(t1);
	this.add(t2);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	t1.addActionListener(this);
	t2.addActionListener(this);
}
int i;
int fact=1;
		
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
        if(str=="Compute") {
       int x = Integer.parseInt(t1.getText());
       int i;
        fact=1;
        for(i=1;i<=x;i++) {
        	fact=fact*i;
        }}
        t2.setText(String.valueOf(fact));

        if(str=="Clear") {
        	t2.setText(" ");
        }
	}
*/
package javaclass;
import java.awt.*;
import java.awt.event.*;
public class Factorial extends Frame implements ActionListener{
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.setTitle("Factorial");
		f.setSize(400, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});	
}
	Button b1,b2;
	TextField compute,clear;
	TextField result;
	Label n1,n2;
	Factorial(){
		
		b1 = new Button("compute");
		b2 = new Button("clear");
		n1=new Label("Enter number:");
		n2=new Label("Res:");
		
	
		compute = new TextField();
		clear = new TextField();
		result = new TextField();
		
		result.setBounds(300,150, 100, 50);
		this.add(result);
		
		n1.setBounds(150,100,100,50);
		n2.setBounds(250,100,100,50);
		compute.setBounds(150,150, 100, 50);
		clear.setBounds(250, 150, 100, 50);
		
		b1.setBounds(150, 200, 100, 50);
		b2.setBounds(250, 200, 100, 50);
		
		
		this.add(b1);
		this.add(b2);
		this.add(n1);
		this.add(n2);
		this.add(compute);
		this.add(clear);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		compute.addActionListener(this);
		clear.addActionListener(this);
 	}
	
	
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "compute"){
			int n = Integer.parseInt(compute.getText());
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
		result.setText(String.valueOf(fact));
	}
		 if(str == "clear"){
			compute.setText(" ");
			clear.setText(" ");
			result.setText(" ");
		}		
	}
	

}
	

