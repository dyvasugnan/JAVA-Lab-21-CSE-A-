import javax.swing.*;
import java.awt.event.*;

public class Factorial extends JFrame implements ActionListener{
    JTextField t1, t2;
    JLabel l1, l2;
    JButton b1, b2;
    JPanel p;
    Factorial()
    {
        t1 = new JTextField();
        t2 = new JTextField();
        l1 = new JLabel("Number");
        l2 = new JLabel("Result");
        b1 = new JButton("Compute");
        b2 = new JButton("Clear");
        p = new JPanel(null);
        t1.setBounds(200, 100, 100, 20);
        t2.setBounds(200, 150, 100, 20);
        l1.setBounds(100, 100, 100, 20);
        l2.setBounds(100, 150, 100, 20);
        b1.setBounds(90, 200, 100, 20);
        b2.setBounds(200, 200, 100, 20);
        p.add(l1);
        p.add(l2);
        p.add(t1);
        p.add(t2);
        p.add(b1);
        p.add(b2);
        add(p);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1)
        {
            int x = Integer.parseInt(t1.getText());
            int fact = 1;
            for(int i = 1; i <= x; i++)
            {
                fact *= i;
            }
            t2.setText(String.valueOf(fact));
        }
        else{
            t1.setText("");
            t2.setText("");
        }
    }
}
