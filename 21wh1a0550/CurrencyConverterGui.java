package javaclasswork;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverterGui extends Frame implements ActionListener {
    Label l1, l2;
    Button b1, b2, b3;
    TextField t1, t2;
    double rupeeToDollarRate = 0.014; 
    double dollarToRupeeRate = 71.43; 

    CurrencyConverterGui() {
        this.setLayout(null);
        b1 = new Button("Rupee to $");
        b2 = new Button("$ to Rupee");
        b3 = new Button("Clear");

        l1 = new Label("Amount");
        l2 = new Label("Result");

        t1 = new TextField();
        t2 = new TextField();

        l1.setBounds(50, 100, 100, 20);
        t1.setBounds(50, 140, 100, 20);

        l2.setBounds(200, 100, 100, 20);
        t2.setBounds(200, 140, 100, 20);

        b1.setBounds(50, 250, 70, 20);
        b2.setBounds(130, 250, 80, 20);
        b3.setBounds(220, 250, 50, 20);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        this.add(l1);
        this.add(l2);

        this.add(t1);
        this.add(t2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Rupee to $")) {
            double rupees = Double.parseDouble(t1.getText());
            double dollars = rupees * rupeeToDollarRate;
            t2.setText(String.valueOf(dollars));
        }
        if (str.equals("$ to Rupee")) {
            double dollars = Double.parseDouble(t1.getText());
            double rupees = dollars * dollarToRupeeRate;
            t2.setText(String.valueOf(rupees));
        }
        if (str.equals("Clear")) {
            t1.setText(" ");
            t2.setText(" ");
        }
    }

    public static void main(String args[]) {
        CurrencyConverterGui f = new CurrencyConverterGui();
        f.setTitle("Currency Converter");
        f.setSize(450, 450);
        f.setVisible(true);
        f.setLocation(500, 200);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}