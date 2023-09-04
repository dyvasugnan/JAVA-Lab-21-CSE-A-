package javaprograms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventDemo extends JFrame {
    private JLabel eventLabel;

    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        eventLabel = new JLabel("No event");
        eventLabel.setHorizontalAlignment(JLabel.CENTER);
        eventLabel.setFont(new Font("Arial", Font.BOLD, 20));

        add(eventLabel);

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateEventLabel("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                updateEventLabel("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                updateEventLabel("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                updateEventLabel("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                updateEventLabel("Mouse Exited");
            }
        };

        // Register the mouse adapter to the frame
        addMouseListener(mouseAdapter);

        setVisible(true);
    }

    private void updateEventLabel(String eventName) {
        eventLabel.setText(eventName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MouseEventDemo();
        });
    }
}
