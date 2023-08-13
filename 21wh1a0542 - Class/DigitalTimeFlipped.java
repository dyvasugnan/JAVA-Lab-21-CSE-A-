import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Upsidedown {
    private static JLabel timeLabel;
    private static JLabel flippedTimeLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Upsidedown Time Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400); // Increased height to accommodate both labels
        frame.setLayout(new GridLayout(2, 1)); // GridLayout with 2 rows and 1 column

        // Create the time label
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(timeLabel);

        // Create the flipped time label
        flippedTimeLabel = new JLabel();
        flippedTimeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        flippedTimeLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(flippedTimeLabel);

        // Create a timer to update the time labels every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        // Display the frame
        frame.setVisible(true);
    }

    private static void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());
        timeLabel.setText(currentTime);

        // Calculate the flipped (upside-down) time
        String flippedTime = flipTime(currentTime);
        flippedTimeLabel.setText(flippedTime);
    }

    private static String flipTime(String time) {
        StringBuilder originalTime = new StringBuilder();
        StringBuilder flippedTime = new StringBuilder();

        for (char digit : time.toCharArray()) {
            originalTime.append(digit);
            flippedTime.append(flipDigit(digit));
        }

        return flippedTime.toString();
    }

    private static char flipDigit(char digit) {
        switch (digit) {
            case '0': return '0';
            case '1': return '1';
            case '4': return 'ㄣ';
            case '2': return '5';
            case '5': return '2';
            case '6': return '9';
            case '7': return 'L';
            case '8': return '8';
            case '9': return '6';
            default: return digit;
        }
    }
}
