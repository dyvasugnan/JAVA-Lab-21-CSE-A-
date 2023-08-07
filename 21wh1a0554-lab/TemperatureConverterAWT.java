import java.awt.*;
import java.awt.event.*;

public class TemperatureConverterAWT {
    public static void main(String[] args) {
        Frame frame = new Frame("Temperature Converter");
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        Label celsiusLabel = new Label("Celsius:");
        TextField celsiusTextField = new TextField();
        Label fahrenheitLabel = new Label("Fahrenheit:");
        TextField fahrenheitTextField = new TextField();
        fahrenheitTextField.setEditable(false);

        Button computeButton = new Button("Compute");
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(celsiusTextField.getText());
                    double fahrenheit = celsius * 9 / 5 + 32;
                    fahrenheitTextField.setText(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    showMessageDialog(frame, "Invalid input. Please enter a valid number.");
                }
            }
        });

        Button clearButton = new Button("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                celsiusTextField.setText("");
                fahrenheitTextField.setText("");
            }
        });

        frame.add(celsiusLabel);
        frame.add(celsiusTextField);
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitTextField);
        frame.add(computeButton);
        frame.add(clearButton);

        frame.pack();
        frame.setVisible(true);
    }

    private static void showMessageDialog(Frame parent, String message) {
        Dialog dialog = new Dialog(parent, "Error", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.add(okButton);
        dialog.pack();
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);
    }
}

