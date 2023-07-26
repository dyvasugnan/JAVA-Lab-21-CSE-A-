package awtprograms;

import java.awt.*;
import java.awt.event.*;

public class AddUsingGui extends Frame implements ActionListener {
    Button b1, clear; 
    TextField n1, n2, res;
    Label num1, num2, result;

    AddUsingGui() {
        this.setLayout(null);
        b1 = new Button("Add");
        clear = new Button("Clear"); 
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

        b1.setBounds(150, 450, 100, 50);
        clear.setBounds(270, 450, 100, 50); 

        this.add(b1);
        this.add(clear); 
        this.add(num1);
        this.add(num2);
        this.add(result);
        this.add(n1);
        this.add(n2);
        this.add(res);

        b1.addActionListener(this);
        clear.addActionListener(this); 
        n1.addActionListener(this);
        n2.addActionListener(this);
        res.addActionListener(this);

      
        this.setBackground(Color.LIGHT_GRAY);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Add")) {
            int a = Integer.parseInt(n1.getText());
            int b = Integer.parseInt(n2.getText());
            int c = a + b;
            res.setText(String.valueOf(c));
        } else if (str.equals("Clear")) {
            n1.setText(""); 
            n2.setText("");
            res.setText("");
        }
    }

    public static void main(String[] args) {
    	AddUsingGui ad = new AddUsingGui();
        ad.setTitle("Test");
        ad.setSize(400, 400);
        ad.setVisible(true);
        ad.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
