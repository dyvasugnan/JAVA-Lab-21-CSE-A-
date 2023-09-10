package javalab;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends Frame implements ItemListener {
    CheckboxGroup cbg = new CheckboxGroup();

    TrafficLight() {
        Checkbox cb1 = new Checkbox("Red", cbg, true); // by default selected
        cb1.setBackground(Color.RED);
        Checkbox cb2 = new Checkbox("Yellow", cbg, false);
        cb2.setBackground(Color.YELLOW);
        Checkbox cb3 = new Checkbox("Green", cbg, false);
        cb3.setBackground(Color.GREEN);

        this.setLayout(new BorderLayout()); 

        Panel p = new Panel(new FlowLayout(FlowLayout.CENTER));
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);

        this.add(p, BorderLayout.SOUTH); 

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        String str = cbg.getSelectedCheckbox().getLabel();
        this.setBackground(Color.PINK);

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
        TrafficLight r = new TrafficLight();
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