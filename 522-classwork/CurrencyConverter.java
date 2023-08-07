package javaclass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConverter extends Frame implements ActionListener{
    Button b1,b2,clear;
    TextField t1,t2;
    Label l1, l2, title;
    
    CurrencyConverter(){
        b1 = new Button("Indian Rupee to Dollar");
        b2 = new Button("Dollar to Indian Rupee");
        clear = new Button("Clear");
        l1 = new Label("Enter Value:");
        l2 = new Label("After conversion:");
        title = new Label("Currency Converter");
        t1 = new TextField();
        t2 = new TextField();
  
        l1.setBounds(100, 100, 100, 20);
        t1.setBounds(200, 100, 100, 40);
        
        l2.setBounds(300, 100, 150, 20);
        t2.setBounds(460, 100, 150, 40);
        
        title.setBounds(300, 50, 200, 20);
        
        b1.setBounds(100, 200, 150, 40);
        b2.setBounds(300, 200, 150, 40);
        clear.setBounds(500, 200, 70, 40);
        
        
        
        this.add(b1);
        this.add(b2);
        this.add(clear);
        this.add(l1);
        this.add(t1);
        this.add(l2);
        this.add(t2);
        this.add(title);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        clear.addActionListener(this);
    	t1.addActionListener(this);
		t2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();

        if (s.equals("Indian Rupee to Dollar")) {
            try {
                double inr = Double.parseDouble(t1.getText());
                double usd = inr / 82.78; 
                t2.setText(String.valueOf(usd));
            } 
            catch (NumberFormatException e) {
                t2.setText("Invalid input");
            }
        }
        else if (s.equals("Dollar to Indian Rupee")) {
            try {
                double usd = Double.parseDouble(t1.getText());
                double inr = usd * 82.78; 
                t2.setText(String.valueOf(inr));
            }
            catch (NumberFormatException e) {
                t2.setText("Invalid input");
            }
        } 
        else if (s.equals("Clear")) {
            t1.setText("");
            t2.setText("");
        }
    
    }
    
    public static void main(String[] args) {
        CurrencyConverter f = new CurrencyConverter();
        f.setTitle("Temperature Converter");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
