package awtprograms;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MirrorTimeDisplayDownwardsGUI extends JFrame {
    private JLabel originalTimeLabel;
    private JLabel reversedTimeLabel;

    public MirrorTimeDisplayDownwardsGUI() {
        // Set up the JFrame
        setTitle("Custom Upside-Down Time Display");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Create components
        originalTimeLabel = new JLabel();
        originalTimeLabel.setFont(new Font("Times new roman", Font.BOLD, 24));

        reversedTimeLabel = new JLabel();
        reversedTimeLabel.setFont(new Font("Times new roman", Font.BOLD, 24));

        // Add components to the JFrame
        setLayout(new GridLayout(2, 1));
        add(originalTimeLabel);
        add(reversedTimeLabel);

        // Create a timer to update the time every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private String reverseAndTransform(String text) {
        String mapping = "9876543210";
        String upsideDownMapping = "68ㄥ9ϛㄣƐᄅƖ0";

        StringBuilder reversedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            int index = mapping.indexOf(c);
            if (index != -1) {
                reversedText.append(upsideDownMapping.charAt(index));
            } else {
                reversedText.append(c);
            }
        }
        return reversedText.toString();
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = sdf.format(new Date());

        originalTimeLabel.setText("Original: " + formattedTime);
        reversedTimeLabel.setText("Reversed: " + reverseAndTransform(formattedTime));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	MirrorTimeDisplayDownwardsGUI gui = new MirrorTimeDisplayDownwardsGUI();
            gui.setVisible(true);
        });
    }
}
