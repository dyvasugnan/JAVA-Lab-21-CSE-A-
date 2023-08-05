package javaprograms;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener {
    Button next, exit;
    Frame1() {
        next = new Button("next");
        exit = new Button("exit");

        add(next);
        add(exit);

        next.addActionListener(this);
        exit.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("next")) {
            Frame2 f2 = new Frame2();
            f2.setSize(400, 400); 
            f2.setVisible(true);
        } 
        else {
            this.dispose();
        }
    }
    public static void main(String[] args) {
        Frame1 f = new Frame1();
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
