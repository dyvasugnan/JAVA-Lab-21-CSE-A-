import java.awt.*;
import java.awt.event.*;

public class ForeighClass extends Frame implements ActionListener {
    Button convertToFahrenheitBtn, convertToCelsiusBtn, clearBtn;
    TextField tempInput, convertedTemp;
    Label tempLabel, convertedTempLabel;

    ForeighClass() {
        this.setLayout(null);

        convertToFahrenheitBtn = new Button("Convert to Fahrenheit");
        convertToCelsiusBtn = new Button("Convert to Celsius");
        clearBtn = new Button("Clear");

        tempLabel = new Label("Temperature");
        convertedTempLabel = new Label("Converted Temperature");

        tempInput = new TextField();
        convertedTemp = new TextField();

        tempLabel.setBounds(50, 150, 150, 50);
        tempInput.setBounds(200, 150, 100, 50);
        convertedTempLabel.setBounds(50, 250, 150, 50);
        convertedTemp.setBounds(200, 250, 100, 50);

        convertToFahrenheitBtn.setBounds(100, 350, 150, 50);
        convertToCelsiusBtn.setBounds(250, 350, 150, 50);
        clearBtn.setBounds(175, 400, 100, 50);

        this.add(convertToFahrenheitBtn);
        this.add(convertToCelsiusBtn);
        this.add(clearBtn);
        this.add(tempLabel);
        this.add(convertedTempLabel);
        this.add(tempInput);
        this.add(convertedTemp);

        convertToFahrenheitBtn.addActionListener(this);
        convertToCelsiusBtn.addActionListener(this);

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tempInput.setText("");
                convertedTemp.setText("");
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        double inputTemp = Double.parseDouble(tempInput.getText());
        double resultTemp;

        if (str.equals("Convert to Fahrenheit")) {
            resultTemp = (inputTemp * 9.0 / 5.0) + 32;
        } else { // "Convert to Celsius"
            resultTemp = (inputTemp - 32) * 5.0 / 9.0;
        }

        convertedTemp.setText(String.format("%.2f", resultTemp));
    }

    public static void main(String[] args) {
        ForeighClass f = new ForeighClass();
        f.setTitle("Temperature Conversion");
        f.setSize(450, 500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
