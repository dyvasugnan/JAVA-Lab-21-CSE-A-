package javalab;
import java.awt.*;
import java.awt.event.*;


public class SimpleMessage extends Frame  {

    public void paint(Graphics g) {
    	g.setColor(Color.BLUE); 
        Font f = new Font("Arial", Font.BOLD, 16); 
        g.setFont(f);
        g.drawString("Hello World !!", 150, 200);
        
    }

    public static void main(String[] args) {
    	SimpleMessage s = new SimpleMessage();   	
    	 s.setTitle("Message");
         s.setSize(400, 400);
         s.setVisible(true);
         s.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
    }
}