import java.awt.*;
import java.awt.event.*;

public class FrameClass extends Frame implements ActionListener {
    Button b1, clearBtn;
    TextField n1, n2;
    Label num1, res;

    FrameClass() {
        this.setLayout(null);

        b1 = new Button("Compute");
        clearBtn = new Button("Clear");

        num1 = new Label("Number 1");
        res = new Label("RESULT");

        n1 = new TextField();
        n2 = new TextField();

        num1.setBounds(100, 150, 100, 50);
        n1.setBounds(200, 150, 100, 50);
        res.setBounds(100, 250, 100, 50);
        n2.setBounds(200, 250, 100, 50);

        b1.setBounds(150, 450, 100, 50);
        clearBtn.setBounds(150, 500, 100, 50);

        this.add(b1);
        this.add(clearBtn);
        this.add(num1);
        this.add(res);
        this.add(n1);
        this.add(n2);

        b1.addActionListener(this);

        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                n1.setText("");
                n2.setText("");
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Compute")) {
            int n = Integer.parseInt(n1.getText());
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            n2.setText(Integer.toString(fact)); // Display the result in the n2 TextField
        }
    }

    public static void main(String[] args) {
        FrameClass f = new FrameClass();
        f.setTitle("Test");
        f.setSize(400, 600);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}


