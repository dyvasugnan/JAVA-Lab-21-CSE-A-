
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlippedDigitalClockFrame extends JFrame {
    private FlippedLabel timeLabel;

    public FlippedDigitalClockFrame() {
        setTitle("Flipped Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        timeLabel = new FlippedLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        updateTime();

        getContentPane().add(timeLabel);

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());

        timeLabel.setText(currentTime);
        timeLabel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlippedDigitalClockFrame clockFrame = new FlippedDigitalClockFrame();
            clockFrame.setVisible(true);
        });
    }

    private class FlippedLabel extends JLabel {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            AffineTransform oldTransform = g2d.getTransform();

            AffineTransform transform = new AffineTransform();
            transform.scale(1, -1);
            transform.translate(0, -getHeight());
            g2d.setTransform(transform);

            super.paintComponent(g2d);

            g2d.setTransform(oldTransform);
        }
    }
}
