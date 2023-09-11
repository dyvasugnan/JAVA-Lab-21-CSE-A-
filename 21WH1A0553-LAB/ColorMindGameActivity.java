package clss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class ColorMindGameActivity extends JFrame {
    private static final String[] colors = {"RED", "GREEN", "BLUE", "YELLOW", "PURPLE", "ORANGE", "PINK", "CYAN", "MAGENTA"};
    private static final Color[] colorObjects = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, new Color(128, 0, 128), Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA};
    private static final Random rand = new Random();

    private JLabel targetText;
    private JButton[][] colorButtons;
    private JLabel timerLabel; // Separate label for the timer
    private Timer timer;
    private int timeLeft = 45;
    private int score = 0;
    private int targetScore = 10;

    public ColorMindGameActivity() {
        setTitle("Color Mind Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        targetText = new JLabel("", SwingConstants.CENTER);
        targetText.setFont(new Font("Arial", Font.BOLD, 24));
        add(targetText, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel(new GridLayout(3, 3)); // 3x3 grid
        colorButtons = new JButton[3][3];


        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int buttonIndex = row * 3 + col;
                colorButtons[row][col] = new JButton(colors[buttonIndex]);
                colorButtons[row][col].setBackground(colorObjects[buttonIndex]);
                colorButtons[row][col].addActionListener(new ColorButtonListener());
                buttonPanel.add(colorButtons[row][col]);
            }
        }
        add(buttonPanel, BorderLayout.CENTER);
        // Add a separate label for the timer on the side
        timerLabel = new JLabel("", SwingConstants.CENTER);
        timerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timerLabel, BorderLayout.WEST);
        timer = new Timer(1000, new TimerListener());
        timer.start();
        startNewRound();
        updateScore();
        updateStatus();
        pack();
        setLocationRelativeTo(null); // Center the window
        setVisible(true);

    }
    private void startNewRound() {
        int randomTextIndex = rand.nextInt(colors.length);
        int randomColorIndex = rand.nextInt(colors.length);
        targetText.setText(colors[randomTextIndex]);
        targetText.setForeground(colorObjects[randomColorIndex]);

    }
    private class ColorButtonListener implements ActionListener {
        @Override

        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            Color clickedColor = clickedButton.getBackground();
            Color targetColor = targetText.getForeground();

            if (clickedColor.equals(targetColor)) {
                score++;
                updateScore();
                startNewRound();
            }
        }
    }
    private class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            timeLeft--;
            updateStatus();


            if (timeLeft == 0) {
                timer.stop();
                if (score >= targetScore) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You've reached the target score.");
                } else {
                    JOptionPane.showMessageDialog(null, "Time's up! You didn't reach the target score.");
                }
                System.exit(0);
            }
        }
    }
    private void updateScore() {
        setTitle("Color Mind Game - Score: " + score);

    }
    private void updateStatus() {
        timerLabel.setText("Time left: " + timeLeft + "s");

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ColorMindGameActivity());

    }

}