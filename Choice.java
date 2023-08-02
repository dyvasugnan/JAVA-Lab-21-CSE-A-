package javalab;
import java.awt.event.*;
import java.awt.*;   
public class Choice {       
        Choice() {      
        Frame f = new Frame();      
        Choice c = new Choice();     
        c.setBounds(100, 100, 75, 75);    
        c.add("cse");    
        c.add("eee");    
        c.add("ece");    
        c.add("it");    
        c.add("aiml");    
        f.add(c);      
        f.setSize(400, 400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
  
// main method  
public static void main(String args[])    
{    
   new Choice();    
}    
}     