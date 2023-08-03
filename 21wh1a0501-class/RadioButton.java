package javaClass;
import java.awt.*;
import java.awt.event.*;
public class RadioButton extends Frame implements ItemListener {
    CheckboxGroup cbg;
    Checkbox cb1, cb2, cb3;
    RadioButton() {
        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Red", cbg, true);
        cb2 = new Checkbox("Green", cbg, false);
        cb3 = new Checkbox("Orange", cbg, false);

        this.add(cb1);
        this.add(cb2);
        this.add(cb3);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    public void paint(Graphics g) {
    	 super.paint(g);

         Checkbox selectedCheckbox = cbg.getSelectedCheckbox();
         if (selectedCheckbox == cb1) {
             this.setBackground(Color.red);
             g.drawString("Stop", 100, 100);
         } else if (selectedCheckbox == cb2) {
             this.setBackground(Color.green);
             g.drawString("Go", 100, 100);
         } else if (selectedCheckbox == cb3) {
             this.setBackground(Color.orange);
             g.drawString("Wait", 100, 100);
    }
   }
    public static void main(String args[]) {
        RadioButton rb = new RadioButton();
        rb.setSize(300, 200);
        rb.setLayout(new FlowLayout());
        rb.setVisible(true);
    }
}
