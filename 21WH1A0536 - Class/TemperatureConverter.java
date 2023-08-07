package clss;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends Frame implements ActionListener {
    Button cel, fah, clear;
    TextField a, res;
    Label l1, l2;
    TemperatureConverter() {
        this.setLayout(null);
        cel = new Button("To Celsius");
        fah = new Button("To Fahrenheit");
        clear = new Button("Clear");
        l1 = new Label("Input");
        l2 = new Label("Result");
        a = new TextField();
        res = new TextField();
        l1.setBounds(100, 300, 100, 50);
        l2.setBounds(300, 300, 100, 50);
        cel.setBounds(100, 350, 100, 50);
        fah.setBounds(300, 350, 100, 50);
        a.setBounds(100, 250, 100, 50);
        res.setBounds(300, 250, 100, 50);
        clear.setBounds(200, 450, 100, 50);
        this.add(cel);
        this.add(fah);
        this.add(clear);
        this.add(l1);
        this.add(l2);
        this.add(a);
        this.add(res);
        cel.addActionListener(this);
        fah.addActionListener(this);
        clear.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str == "To Celsius") {
            double n = Double.parseDouble(a.getText());
            double ans = (n - 32) * 5 / 9;
            res.setText(String.valueOf(ans));
        } 
        else if (str=="To Fahrenheit") {
            double n = Double.parseDouble(a.getText());
            double ans = (n * 9 / 5) + 32;
            res.setText(String.valueOf(ans));
        } 
        else if (str=="Clear") {
            a.setText("");
            res.setText("");
        }
    }
    public static void main(String[] args) {
    	TemperatureConverter cf = new TemperatureConverter();
        cf.setTitle("Temperature Converter");
        cf.setSize(600, 600);
        cf.setVisible(true);
        cf.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
