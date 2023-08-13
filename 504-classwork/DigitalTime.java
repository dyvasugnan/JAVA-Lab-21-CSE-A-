package moulikaLab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalTime extends JFrame {
    private JLabel label2;
    private Timer timer;

    public DigitalTime() {
        initializeUI();
        setupTimer();
    }

    private void initializeUI() {
        setTitle("Digital Time In Reverse");
        
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label2 = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.rotate(Math.PI, getWidth() / 2.0, getHeight() / 2.0);
                super.paintComponent(g2d);
                g2d.dispose();
            }
        };
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        add(label2);
    }

    private void setupTimer() {
        timer = new Timer(1000, e -> updateLabel());
        timer.start();
    }

    private void updateLabel() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());

        String upsideDownTime = getUpsideDownText(currentTime);
        label2.setText(upsideDownTime);
    }

    private String getUpsideDownText(String text) {
        StringBuilder upsideDown = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            upsideDown.append(text.charAt(i));
        }
        return upsideDown.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	DigitalTime customTimeDisplay = new DigitalTime();
            customTimeDisplay.setVisible(true);
        });
    }
}
