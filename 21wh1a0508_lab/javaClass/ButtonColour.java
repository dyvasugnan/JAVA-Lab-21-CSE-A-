package javaClass;
import java.awt.*;
import java.awt.event.*;

class ButtonColour extends Frame implements ActionListener {
    Button b1, b2, b3;

    ButtonColour() {
        this.setLayout(null);
        b1 = new Button("orange");
        b2 = new Button("red");
        b3 = new Button("pink");
        b1.setBounds(100, 150, 100, 50);
        b2.setBounds(100, 250, 100, 50);
        b3.setBounds(100, 350, 100, 50);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("orange"))
            this.setBackground(Color.ORANGE);
        if (str.equals("red"))
            this.setBackground(Color.RED);
        if (str.equals("pink"))
            this.setBackground(Color.pink);
    }

    public static void main(String[] args) {
        ButtonColour f = new ButtonColour();
        f.setTitle("Background Display");
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
