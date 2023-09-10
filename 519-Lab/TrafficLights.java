package java_codes;

import java.awt.*;
import java.awt.event.*;

public class TrafficLights extends Frame implements ItemListener {
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox cb1 = new Checkbox("Red", cbg, true);
    Checkbox cb2 = new Checkbox("Yellow", cbg, false);
    Checkbox cb3 = new Checkbox("Green", cbg, false);

    TrafficLights() {
        cb1.setBackground(Color.RED);
        cb2.setBackground(Color.YELLOW);
        cb3.setBackground(Color.GREEN);

        this.setLayout(new FlowLayout(FlowLayout.CENTER)); // Use FlowLayout to arrange checkboxes horizontally

        this.add(cb1);
        this.add(cb2);
        this.add(cb3);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        String str = cbg.getSelectedCheckbox().getLabel();
        this.setBackground(Color.DARK_GRAY);

        Font f = new Font("Arial", Font.BOLD, 36);
        g.setFont(f);

        if (str.equals("Red")) {
            g.setColor(Color.RED);
            g.drawString("Stop", 250, 300);
        }
        if (str.equals("Yellow")) {
            g.setColor(Color.YELLOW);
            g.drawString("Ready", 250, 300);
        }
        if (str.equals("Green")) {
            g.setColor(Color.GREEN);
            g.drawString("Go", 280, 300);
        }
    }

    public static void main(String[] args) {
        TrafficLights r = new TrafficLights();
        r.setTitle("Traffic Lights");
        r.setSize(600, 600);
        r.setVisible(true);
        r.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
