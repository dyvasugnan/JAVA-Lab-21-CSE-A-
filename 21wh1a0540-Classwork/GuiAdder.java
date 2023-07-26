package javaclass;

import java.awt.*;
import java.awt.event.*;

public class GuiAdder extends Frame implements ActionListener {
	   public static void main(String[] args) {
	        GuiAdder f = new GuiAdder();
	        f.setTitle("ADDER");
	        f.setSize(400, 400);
	        f.setVisible(true);
	        f.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent we) {
	                System.exit(0);
	            }
	        });
	    }
	    Button sum, clear; // Add the clear button
	    TextField n1, n2, res;
	    Label num1, num2, result;
	    GuiAdder() {
	        this.setLayout(null);

	        sum = new Button("Add");
	        clear = new Button("Clear"); // Create the Clear button

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

	        sum.setBounds(95, 450, 100, 50);
	        clear.setBounds(205, 450, 100, 50); // Set the position for the Clear button

	        this.add(sum);
	        this.add(clear); // Add the Clear button to the frame
	        this.add(num1);
	        this.add(num2);
	        this.add(result);
	        this.add(n1);
	        this.add(n2);
	        this.add(res);

	        sum.addActionListener(this);
	        clear.addActionListener(this); // Register the ActionListener for the Clear button
	        n1.addActionListener(this);
	        n2.addActionListener(this);
	        res.addActionListener(this); 
	    }
	    public void actionPerformed(ActionEvent ae) {
	        String str = ae.getActionCommand();
	        if (str.equals("Add")) { // Use .equals() to compare strings
	            int a = Integer.parseInt(n1.getText());
	            int b = Integer.parseInt(n2.getText());
	            int c = a + b;
	            res.setText(String.valueOf(c));
	        } else if (str.equals("Clear")) { // Handle the Clear button action
	            n1.setText("");
	            n2.setText("");
	            res.setText("");
	        }
	    }


}