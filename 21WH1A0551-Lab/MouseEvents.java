package labprograms;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEvents extends JFrame implements MouseListener, MouseMotionListener {
    JLabel l;
    JPanel p;
    MouseEvents() {
        l = new JLabel("Action:");
        Container c = getContentPane();
        p = new JPanel(new FlowLayout(FlowLayout.CENTER));
        c.add(p, BorderLayout.CENTER);
        p.add(l);
        Font f = new Font("Arial", Font.BOLD, 20);
        l.setFont(f);
        l.setForeground(Color.BLACK);
        c.addMouseListener(this);
        c.addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me) { l.setText("Action: Mouse Clicked"); }

    public void mouseReleased(MouseEvent me) { l.setText("Action: Mouse Released"); }

    public void mousePressed(MouseEvent me) { l.setText("Action: Mouse Pressed"); }

    public void mouseEntered(MouseEvent me) { l.setText("Action: Mouse Entered"); }

    public void mouseExited(MouseEvent me) { l.setText("Action: Mouse Exited"); }

    public void mouseDragged(MouseEvent me) { l.setText("Action: Mouse Dragged"); }

    public void mouseMoved(MouseEvent me) { l.setText("Action: Mouse Moved"); }
    
    public static void main(String args[]) {
        MouseEvents m = new MouseEvents();
        m.setSize(500, 500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
