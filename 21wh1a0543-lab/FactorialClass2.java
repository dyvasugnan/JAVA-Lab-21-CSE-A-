package classnotes_programs;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialClass2 extends JFrame implements ActionListener {
    private JButton comp, clr;
    private JTextField t1, t2;

    public FactorialClass2() {
        this.setLayout(null);

        comp = new JButton("Compute");
        comp.setBounds(100, 180, 100, 50);
        comp.setBackground(Color.WHITE);
        this.add(comp);

        clr = new JButton("Clear");
        clr.setBounds(250, 180, 100, 50);
        clr.setBackground(Color.WHITE);
        this.add(clr);

        t1 = new JTextField();
        t1.setBounds(100, 100, 100, 50);
        this.add(t1);

        t2 = new JTextField();
        t2.setBounds(250, 100, 100, 50);
        this.add(t2);

        comp.addActionListener(this);
        clr.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        int fact = 1;
        if (str.equals("Compute")) {
            int a = Integer.parseInt(t1.getText());
            if (a > 0) {
                for (int i = 2; i <= a; i++)
                    fact *= i;
                t2.setText(String.valueOf(fact));
            } else
                t2.setText("Invalid Input");
        }
        if (str.equals("Clear")) {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String[] args) {
        FactorialClass2 f = new FactorialClass2();
        f.setTitle("Factorial");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\vnave\\OneDrive\\Desktop\\calc.png");
        f.setIconImage(icon);
        f.setSize(430, 400);
        f.setBackground(Color.WHITE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
