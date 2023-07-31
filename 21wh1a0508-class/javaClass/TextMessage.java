package javaClass;
import java.awt.*;
import java.awt.event.*;
public class TextMessage {
    public static void main(String[] args) {
        Frame f = new Frame("Simple Message App");
        f.setSize(300, 100);
        String message = "Hello,Welcome to java programming!";
        Label l = new Label(message);
        f.add(l);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
