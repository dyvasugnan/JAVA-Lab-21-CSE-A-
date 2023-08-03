package javaclass;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Frame2 extends Frame implements ActionListener {
    Button back;

    Frame2() {
        this.setLayout(null);
        back = new Button("BACK");
        back.setBounds(100, 150, 200, 250);
        this.add(back);
        back.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("BACK")) {
            this.dispose();
        }
    }
}

