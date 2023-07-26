package javalab;
import java.awt.*;
import java.awt.event.*;

public class FrameClass1 extends Frame implements ActionListener {
    Button b1, b2, b3, clearBtn;
    TextField numberInput;

    FrameClass1() {
        this.setLayout(null);

        b1 = new Button("Red");
        b2 = new Button("Blue");
        b3 = new Button("Green");
        clearBtn = new Button("Clear");

        b1.setBounds(100, 150, 100, 50);
        b2.setBounds(100, 250, 100, 50);
        b3.setBounds(100, 350, 100, 50);
        clearBtn.setBounds(100, 450, 100, 50);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(clearBtn);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        clearBtn.addActionListener(this);

        numberInput = new TextField();
        numberInput.setBounds(100, 50, 100, 30);
        this.add(numberInput);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Black"))
            this.setBackground(Color.BLACK);
        else if (str.equals("Red"))
            this.setBackground(Color.RED);
        else if (str.equals("Green"))
            this.setBackground(Color.GREEN);
        else if (str.equals("Clear")) {
            this.setBackground(Color.WHITE);
            numberInput.setText("");
        }
    }

    public static void main(String[] args) {
        FrameClass1 f = new FrameClass1();
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
