import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight extends JFrame implements ActionListener {
    private JLabel label;
    private JRadioButton redButton, yellowButton, greenButton;
    private JLabel messageLabel;

    public TrafficLight() {
        setTitle("Traffic Light");
        setSize(300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Select a light:");
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");
        messageLabel = new JLabel("Traffic Light: ");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        setLayout(new FlowLayout());
        add(label);
        add(redButton);
        add(yellowButton);
        add(greenButton);
        add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "";
        if (e.getSource() == redButton) {
            message = "Stop";
        } else if (e.getSource() == yellowButton) {
            message = "Ready";
        } else if (e.getSource() == greenButton) {
            message = "Go";
        }
        messageLabel.setText("Traffic Light: " + message);
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        t.setVisible(true);
    }
}
