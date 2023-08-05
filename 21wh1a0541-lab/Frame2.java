package javaprograms;
import java.awt.*;
import java.awt.event.*;

public class Frame2 extends Frame implements ActionListener {
    Button b;

    Frame2() {
        b = new Button("back");
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        this.dispose();
    }
}
