package javaclass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TempConverter extends Frame implements ActionListener{
    Button b1,b2,clear;
    TextField t1,t2;
    Label l1, l2, title;
    
    TempConverter(){
        b1 = new Button("Celsius to Fahrenheit");
        b2 = new Button("Fahrenheit to Celsius");
        clear = new Button("Clear");
        l1 = new Label("Enter Value:");
        l2 = new Label("Temp after conversion:");
        title = new Label("Temperature Converter");
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

        if (s == ("Celsius to Fahrenheit")) {
            try {
                double celsius = Double.parseDouble(t1.getText());
                double fahrenheit = (celsius * 9/5) + 32;
                t2.setText(String.valueOf(fahrenheit));
            } catch (NumberFormatException e) {
                t2.setText("Invalid input");
            }
        } else if (s == ("Fahrenheit to Celsius")) {
            try {
                double fahrenheit = Double.parseDouble(t1.getText());
                double celsius = (fahrenheit - 32) * 5/9;
                t2.setText(String.valueOf(celsius));
            } catch (NumberFormatException e) {
                t2.setText("Invalid input");
            }
        } else if (s == ("Clear")) {
            t1.setText("");
            t2.setText("");
        }
    }
    
    
    public static void main(String[] args) {
        TempConverter f = new TempConverter();
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
