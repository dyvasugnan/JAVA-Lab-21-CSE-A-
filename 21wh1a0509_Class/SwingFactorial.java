package javaclass;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingFactorial extends JFrame implements ActionListener{
	JButton comp, clr;
	JTextField t1, t2;
	SwingFactorial(){
        this.setLayout(null);

        comp = new JButton("Complete");
        comp.setBounds(100, 180, 100, 50);
        comp.setBackground(Color.CYAN);
        this.add(comp);

        clr = new JButton("Clear");
        clr.setBounds(250, 180, 100, 50);
        clr.setBackground(Color.CYAN);
        this.add(clr);

        t1 = new JTextField();
        t1.setBounds(100, 100, 100, 50);
        this.add(t1);

        t2 = new JTextField();
        t2.setBounds(250, 100, 100, 50);
        this.add(t2);

        comp.addActionListener(this);
        clr.addActionListener(this);
        
        comp.addActionListener(this);
		clr.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        int fact = 1;
        
        if (str.equals("Complete")) {
            int a = Integer.parseInt(t1.getText());
            if (a > 0) {
                for (int i = 2; i <= a; i++)
                    fact *= i;
                t2.setText(String.valueOf(fact));
            } else {
                t2.setText("Invalid Input");
            }
        } else if (str.equals("Clear")) {
            t1.setText("");
            t2.setText("");
        }
    }
	
	public static void main(String[] args) {
		FactorialSwing f = new FactorialSwing();
		f.setTitle("Factorial Swing");
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\vnave\\OneDrive\\Desktop\\calc.png");
        f.setIconImage(icon);
        f.setSize(430, 400);
        f.getContentPane().setBackground(Color.BLACK);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
