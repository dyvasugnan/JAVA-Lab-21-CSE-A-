import java.awt.*;
import java.awt.event.*;
public class Choices {
Choices(){
	 Frame f = new Frame();      
     Label label = new Label();       
     label.setAlignment(Label.CENTER);    
     label.setSize(400, 100);    
     Button b = new Button("Show");          
     b.setBounds(200, 100, 50, 20);          
     Choice dept = new Choice();     
     dept.setBounds(100, 100, 75, 75);     
     dept.add("CSE");    
     dept.add("IT");    
     dept.add("EEE");    
     dept.add("ECE");    
     dept.add("MECH");      
     f.add(dept);  
     f.add(label);  
     f.add(b);    
     f.setSize(400, 400);    
     f.setLayout(null);    
     f.setVisible(true);    
     f.addWindowListener(new WindowAdapter() {
    		public void windowClosing(WindowEvent we) {
    			System.exit(0);
    		}
    	});   
     b.addActionListener(new ActionListener() {    
         public void actionPerformed(ActionEvent e) {         
      String data = "Department selected: "+ dept.getItem(dept.getSelectedIndex());    
      label.setText(data);    
     }    
     });             
     }    
public static void main(String args[]) {
	new Choices();

}    
}
