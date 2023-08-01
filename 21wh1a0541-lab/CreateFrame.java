package javaprograms;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class CreateFrame extends Frame {
    public CreateFrame() {
        // Set the title of the frame
        setTitle("JAVA GUI Frame Creation");
        // Set the size of the frame (width, height)
        setSize(400, 300);
        // Set the frame to be visible
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        // Create obj to frame class
        CreateFrame f = new CreateFrame();
    }
}
