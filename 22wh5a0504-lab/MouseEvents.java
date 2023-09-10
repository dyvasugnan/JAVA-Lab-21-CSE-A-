import java.awt.event.*;
import javax.swing.*;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {
    JPanel panel;
    JLabel l;
    public MouseEvents() {
        l = new JLabel();
        panel = new JPanel();
        panel.add(l);
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        add(panel);  
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse dragged");
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse moved");
    }

    public static void main(String[] args) {
        MouseEvents m = new MouseEvents();
        m.setTitle("Mouse Events Demo");
        m.setSize(400, 400);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}
