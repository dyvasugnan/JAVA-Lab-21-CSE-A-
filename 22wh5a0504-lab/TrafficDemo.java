import java.awt.*;
import java.awt.event.*;

public class TrafficDemo extends Frame implements ItemListener{
    CheckboxGroup cbg;
    Checkbox c1, c2, c3;
    Panel p;
    TrafficDemo()
    {
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Red", true, cbg);
        c2 = new Checkbox("Yellow", false, cbg);
        c3 = new Checkbox("Green", false, cbg);
        this.setLayout(new BorderLayout());
        p = new Panel(new FlowLayout());
        p.add(c1);
        p.add(c2);
        p.add(c3);
        add(p, BorderLayout.SOUTH);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    public static void main(String[] args) {
        TrafficDemo td = new TrafficDemo();
        td.setSize(400, 400);
        td.setVisible(true);
        td.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        String str = cbg.getSelectedCheckbox().getLabel();
        if(str.equals("Red"))
        {
            g.setColor(Color.RED);
            g.drawString("Stop", 200 , 200);
        }
        if(str.equals("Yellow"))
        {
            g.setColor(Color.YELLOW);
            g.drawString("Ready", 200 , 200);
        }
        if(str.equals("Green"))
        {
            g.setColor(Color.GREEN);
            g.drawString("Go", 200 , 200);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
}
