package java_labcodes;
import java.awt.*;
import java.awt.event.*;
class MouseEventAdapter extends MouseAdapter {
    private Frame frame;
    public MouseEventAdapter(Frame frame) {
        this.frame = frame;
    }
    public void mouseClicked(MouseEvent e) {
        displayEventName("Mouse Clicked", e);
    }
    public void mousePressed(MouseEvent e) {
        displayEventName("Mouse Pressed", e);
    }
    public void mouseReleased(MouseEvent e) {
        displayEventName("Mouse Released", e);
    }
    public void mouseEntered(MouseEvent e) {
        displayEventName("Mouse Entered", e);
    }
    public void mouseExited(MouseEvent e) {
        displayEventName("Mouse Exited", e);
    }
    private void displayEventName(String eventName, MouseEvent e) {
        Graphics g = frame.getGraphics();
        g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
        g.drawString(eventName, frame.getWidth() / 2, frame.getHeight() / 2);
    }
}
public class MouseEvents {
    public static void main(String[] args) {
        Frame frame = new Frame("Mouse Events");
        frame.setSize(400, 300);
        frame.setVisible(true);
        MouseEventAdapter eventAdapter = new MouseEventAdapter(frame);
        frame.addMouseListener(eventAdapter);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
