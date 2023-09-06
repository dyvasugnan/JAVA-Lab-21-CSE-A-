package javaClass;
import java.awt.*;
import java.awt.event.*;

public class FactorialAwt extends Frame implements ActionListener {

    Label l1, l2;
    TextField t1, t2;
    Button b, clear;

    FactorialAwt() {
        setTitle("Factorial Calculator");
        setSize(300, 150);

        l1 = new Label("Enter a number:");
        l1.setBounds(20, 30, 100, 20);

        t1 = new TextField(10);
        t1.setBounds(130, 30, 100, 20);

        l2 = new Label("Factorial:");
        l2.setBounds(20, 60, 100, 20);

        t2 = new TextField(15);
        t2.setBounds(130, 60, 100, 20);
        t2.setEditable(false);

        b = new Button("Compute");
        b.setBounds(20, 90, 100, 30);

        clear = new Button("Clear");
        clear.setBounds(130, 90, 100, 30);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(clear);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });

        clear.addActionListener(this);
    }

    private void calculateFactorial() {
        try {
            int num = Integer.parseInt(t1.getText());
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            t2.setText(String.valueOf(factorial));
        } catch (NumberFormatException ex) {
            t2.setText("Invalid Input");
        }
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Clear")) {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String[] args) {
        FactorialAwt f = new FactorialAwt();
        f.setLayout(null); 
        f.setVisible(true);
    }
}
