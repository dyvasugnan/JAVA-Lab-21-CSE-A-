package javalab;

import java.awt.*;
import java.awt.event.*;

public class UsernameandPw extends Frame implements ActionListener {

    TextField name, pw;
    Label l1, l2;

    UsernameandPw() {
        this.setLayout(new FlowLayout());//FlowLayout arranges components in a single row from left to right.
        //GridLayout arranges components in a grid, with rows and columns of equal sizes.
        name = new TextField("un ", 20);
        pw = new TextField(20);
       // pw.setBounds(20, 50, 100, 50);
        pw.setEchoChar('.');
        l1 = new Label("user name");
        l2 = new Label("pwd");
        add(l1);
        add(name);
        add(l2);
        add(pw);
        name.addActionListener(this);
        pw.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        Graphics g = this.getGraphics();
        g.drawString("User Name: " + name.getText(), 100, 100);
        g.drawString("Pwassword: " + pw.getText(), 100, 200);
    }

    public static void main(String[] args) {
        UsernameandPw f = new UsernameandPw();
        f.setTitle("Test");
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
