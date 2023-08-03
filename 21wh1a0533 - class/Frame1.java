package javaclass;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener {
    Button next;
    Button exit;

    Frame1() {
        this.setLayout(null);
        next = new Button("NEXT");
        exit = new Button("EXIT");
        next.setBounds(100, 150, 200, 250);
        exit.setBounds(400, 150, 200, 250);
        this.add(next);
        this.add(exit);
        next.addActionListener(this);
        exit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("NEXT")) {
            Frame2 frame2 = new Frame2();
            frame2.setTitle("Frame2");
            frame2.setSize(500, 500);
            frame2.setVisible(true);
        } 
        else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Frame1 frame1 = new Frame1();
        frame1.setSize(500, 500);
        frame1.setVisible(true);
        frame1.setTitle("Frame1");
        frame1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

