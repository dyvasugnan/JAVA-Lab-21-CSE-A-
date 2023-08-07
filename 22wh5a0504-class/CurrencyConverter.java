import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CurrencyConverter extends JFrame implements ActionListener{
    JButton jb1, jb2, jb3;
    JTextField jt1, jt2;
    Container c;
    CurrencyConverter()
    {
        jb1 = new JButton("INR TO DOLLAR");
        jb2 = new JButton("DOLLAR TO INR");
        jb3 = new JButton("Clear");
        jt1 = new JTextField();
        jt2 = new JTextField();
        c = getContentPane();
        JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jt1);
        jp.add(jt2);
        jp.add(jb3);
        jb1.setBounds(50, 150, 250, 30);
        jb2.setBounds(50, 200, 250, 30);
        jb3.setBounds(50, 250, 250, 30);
        jt1.setBounds(50, 50, 250, 30);
        jt2.setBounds(50, 100, 250, 30);
        c.add(jp);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jt1.addActionListener(this);
        jt2.addActionListener(this);
    }
    public static void main(String[] args) {
        CurrencyConverter jf = new CurrencyConverter();               
        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == jb1)
        {
            String str = jt1.getText();
            float f1 = Float.parseFloat(str);
            float c1 = (f1 * 0.012f);
            jt2.setText(String.valueOf(c1));
        }
        else if(ae.getSource() == jb2)
        {
            String str = jt1.getText();
            float f1 = Float.parseFloat(str);
            float c1 = (f1 * 82.74f);
            jt2.setText(String.valueOf(c1));
        }
        else
        {
            jt1.setText("");
            jt2.setText("");
        }
    }

}
