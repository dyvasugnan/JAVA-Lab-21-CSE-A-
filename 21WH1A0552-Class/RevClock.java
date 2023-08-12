
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RevClock extends JFrame {

	JLabel originalTimeLabel;

	JLabel reversedTimeLabel;
	public RevClock () {
			setTitle("Time");
			setSize(600, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			originalTimeLabel = new JLabel();
			originalTimeLabel.setFont(new Font("Times of Roman", Font.BOLD, 24));
			reversedTimeLabel = new JLabel();
			reversedTimeLabel.setFont(new Font("Times of Roman", Font.BOLD, 24));
			setLayout(new GridLayout(2, 1));
			add(originalTimeLabel);
			add(reversedTimeLabel);
			Timer timer = new Timer(1000, e -> updateTime());
			timer.start();
	}
private String reverseAndTransform(String text) {
		String mapping = "9876543210";
		String upsideDownMapping = "68ㄥ9ϛㄣƐᄅƖ0";
		StringBuilder reversedText = new StringBuilder();
		for (char c : text.toCharArray()) {
			int index = mapping.indexOf(c);
				if (index != -1)
					reversedText.append(upsideDownMapping.charAt(index));
				else 
					reversedText.append(c);
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
	RevClock rc = new RevClock ();
	rc.setVisible(true);
		});
	}
}