package javalab.day19062023;

/*public class TrafficLightSimulator {

}*/
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLightSimulator extends JFrame implements ItemListener {
    JLabel lbl1, lbl2;
    JPanel cPanel, tPanel;
    CheckboxGroup cbg;
    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setSize(600,400);
       setLayout(new GridLayout(2,1));
        cPanel = new JPanel(new FlowLayout());
        tPanel = new JPanel(new FlowLayout());
        lbl1 = new JLabel();
        Font font = new Font("Verdana", Font.BOLD, 50);
        lbl1.setFont(font); 
        cPanel.add(lbl1);
        add(cPanel);
        Font fontR = new Font("Verdana", Font.BOLD, 20);
        lbl2 = new JLabel("LIGHT");
        lbl2.setFont(fontR);
        tPanel.add(lbl2);
        cbg = new CheckboxGroup();
        Checkbox rbn1 = new Checkbox("Red", cbg, false);
        //rbn1.setBackground(Color.RED);
        rbn1.setFont(fontR);
        tPanel.add(rbn1);
        rbn1.addItemListener(this);
        Checkbox rbn2 = new Checkbox("Orange", cbg, false);
        //rbn2.setBackground(Color.ORANGE);
        rbn2.setFont(fontR);
        tPanel.add(rbn2);
        rbn2.addItemListener(this);
        Checkbox rbn3 = new Checkbox("Green", cbg, false);
        //rbn3.setBackground(Color.GREEN); 
        rbn3.setFont(fontR);
        tPanel.add(rbn3);
        rbn3.addItemListener(this);
        add(tPanel);
        setVisible(true);
        // to close the main window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // To read selected item 
    public void itemStateChanged(ItemEvent i) {
        Checkbox c = cbg.getSelectedCheckbox();
        String s=c.getLabel();
        char ch=s.charAt(0);
        switch (ch) {
        case 'R':lbl1.setText("STOP");
                 lbl1.setForeground(Color.RED);
                 break;
        case 'O':lbl1.setText("READY");
                 lbl1.setForeground(Color.ORANGE);
                 break;
        case 'G':lbl1.setText("GO");
                 lbl1.setForeground(Color.GREEN);
                 break;
        }
    }
    // main method
    public static void main(String[] args) {
        new TrafficLightSimulator();
    }
}