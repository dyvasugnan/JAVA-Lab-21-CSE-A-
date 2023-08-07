package clss;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends Frame implements ActionListener {
    Button d, r, clear;
    TextField inp, res;
    Label l1, l2;
    CurrencyConverter() {
        this.setLayout(null);
        d = new Button("To Dollars");
        r = new Button("To Rupees");
        clear = new Button("Clear");
        l1 = new Label("Input");
        l2 = new Label("Result");
        inp = new TextField();
        res = new TextField();
        
        
        l1.setBounds(100, 300, 100, 50);
        l2.setBounds(300, 300, 100, 50);
        r.setBounds(100, 350, 100, 50);
        d.setBounds(300, 350, 100, 50);
        inp.setBounds(100, 250, 100, 50);
        res.setBounds(300, 250, 100, 50);
        clear.setBounds(200, 450, 100, 50);
        
        this.add(d);
        this.add(r);
        this.add(clear);
        this.add(l1);
        this.add(l2);
        this.add(inp);
        this.add(res);
        d.addActionListener(this);
        r.addActionListener(this);
        clear.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str == "To Dollars") {
            double n = Double.parseDouble(inp.getText());
            double ans = n * 0.012;
            res.setText(String.valueOf(ans));
        } 
        else if (str == "To Rupees") {
            double n = Double.parseDouble(inp.getText());
            double ans = n * 82.74;
            res.setText(String.valueOf(ans));
        }
        else if (str == "Clear") {
            inp.setText("");
            res.setText("");
        }
    }
    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();
        c.setTitle("Currency Converter");
        c.setSize(600, 600);
        c.setVisible(true);
        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
