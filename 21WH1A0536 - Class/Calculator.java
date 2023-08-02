import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField t;
    double n1, n2, res;
    char op;
    public Calculator() {
        setTitle("CALCULATOR");
        setSize(500, 400);
        setLayout(new BorderLayout());
        t = new TextField();
        t.setEditable(false);
        add(t, BorderLayout.NORTH);
        Panel buttonPanel = new Panel(new GridLayout(5, 4));
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "4", "-",
                "0", ".", "=", "+",
                " ", "AC", " ", " ",
        };
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent ae) {

        String str = ae.getActionCommand();

        if (str.equals("+")) {
            op = '+';
            n1 = Double.parseDouble(t.getText());
            t.setText("");
        } 
        else if (str.equals("-")) {
            op = '-';
            n1 = Double.parseDouble(t.getText());
            t.setText("");
        } 
        else if (str.equals("*")) {
            op = '*';
            n1 = Double.parseDouble(t.getText());
            t.setText("");
        } 
        else if (str.equals("/")) {
            op = '/';
            n1 = Double.parseDouble(t.getText());
            t.setText("");
        } 
        else if (str.equals("=")) {
            n2 = Double.parseDouble(t.getText());
            switch (op) {
                case '+':
                    res = n1 + n2;
                    break;
                case '-':
                    res = n1 - n2;
                    break;
                case '*':
                    res = n1 * n2;
                    break;
                case '/':
                    res = n1 / n2;
                    break;
            }
            t.setText(res + "");
            res = 0;
        } 
        else if (str.equals("AC")) {
            t.setText("");
            n1 = n2 = res = 0;
        }
        else {
            t.setText(t.getText() + str);
        }
    }
    public static void main(String args[]) {
        Calculator c = new Calculator();
        c.setTitle("Calculator");
        c.setSize(250, 300);
        c.setVisible(true);
        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
