import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;
    private JLabel messageLabel;

    public TrafficLightSimulator() {
        // Set up the JFrame
        setTitle("Traffic Light Simulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // Create button group to ensure only one button can be selected at a time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        // Create message label
        messageLabel = new JLabel("Traffic Light Status: ");

        // Add action listeners to radio buttons
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Add components to the JFrame
        add(redButton);
        add(yellowButton);
        add(greenButton);
        add(messageLabel);

        // Set the JFrame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "Traffic Light Status: ";

        if (e.getSource() == redButton) {
            message += "Stop";
            messageLabel.setForeground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            message += "Ready";
            messageLabel.setForeground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            message += "Go";
            messageLabel.setForeground(Color.GREEN);
        }

        messageLabel.setText(message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TrafficLightSimulator();
        });
    }
}
