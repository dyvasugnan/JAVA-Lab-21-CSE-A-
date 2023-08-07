package java_codes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingFrame extends JFrame implements ActionListener {
    private JButton comp, clear;
    private JTextField n, res;
    private JLabel num, result;

    SwingFrame() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        comp = new JButton("comp");
        clear = new JButton("Clear");
        num = new JLabel("Number");
        result = new JLabel("Result");
        n = new JTextField();
        res = new JTextField();
        num.setBounds(100, 150, 100, 50);
		n.setBounds(200, 150, 100, 50);
		result.setBounds(320, 150, 100, 50);
		res.setBounds(450, 150, 100, 50);
		comp.setBounds(150, 350, 100, 50);
		clear.setBounds(300,350,100,50);
        contentPane.add(comp);
        contentPane.add(clear);
        contentPane.add(num);
        contentPane.add(result);
        contentPane.add(n);
        contentPane.add(res);
        comp.addActionListener(this);
        clear.addActionListener(this);
        comp.setActionCommand("comp");
        clear.setActionCommand("Clear");
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("comp")) {
            int numValue = Integer.parseInt(n.getText());
            int c = 1;
            for (int i = numValue; i > 0; i--) {
                c = c * i;
            }
            res.setText(String.valueOf(c));
        }
        if (str.equals("Clear")) {
            n.setText("");
            res.setText("");
        }
    }

    public static void main(String[] args) {
        SwingFrame t = new SwingFrame();
        t.setTitle("Calculate");
        t.setSize(450,450);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
