package javaclass;
import java.awt.*;
import java.awt.event.*;

public class ChoiceExample implements ItemListener {
    ChoiceExample() {
        Frame frame = new Frame();
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        Choice departmentChoice = new Choice();
        departmentChoice.setBounds(100, 150, 200, 250);
        departmentChoice.add("Computer Science");
        departmentChoice.add("Information Technology");
        departmentChoice.add("Electrical and Electronics");
        departmentChoice.add("Electronics and Communication");
        departmentChoice.add("Computer Science and Business Systems");

        frame.add(departmentChoice);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new ChoiceExample();
    }
}
