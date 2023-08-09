package javaclass;
import java.awt.*;
import java.awt.event.*;
public class RadioButton extends Frame implements ItemListener, ActionListener {
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;
    Label l;
    Button b;
    TextField t;
    RadioButton() {
        this.setLayout(new FlowLayout());
        cbg = new CheckboxGroup();
        l = new Label("Select one: ");
        c1 = new Checkbox("gray", cbg, false);
        c2 = new Checkbox("blue", cbg, false);
        c3 = new Checkbox("Pink", cbg, false);
        b = new Button("Display");
        t = new TextField(20);
        l.setBounds(30, 50, 200, 30);
        c1.setBounds(30, 100, 100, 30);
        c2.setBounds(30, 150, 100, 30);
        c3.setBounds(30, 200, 100, 30);
        b.setBounds(200, 350, 400, 30);
        t.setBounds(30, 400, 300, 30);
        // Add components
        this.add(l);
        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(b);
        this.add(t);
        // Add item listeners to the CheckBox 
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        b.addActionListener(this);
    }
    public static void main(String args[]) {
        RadioButton s = new RadioButton();
        s.setTitle("RADIOBUTTON");
        s.setVisible(true);
        s.setSize(500, 400);
        s.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        // background setting in action
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button 
        Checkbox ch = cbg.getSelectedCheckbox();
        //or String s = cbg.getSelectedCheckbox().getLabel();
        if (ch != null) {
            t.setText(ch.getLabel());
            String s = ch.getLabel();
            if (s.equals("gray")) {
                this.setBackground(Color.GRAY);
            } else if (s.equals("blue")) {
                this.setBackground(Color.blue);
            } else if (s.equals("Pink")) {
                this.setBackground(Color.PINK);
            }
        } else {
            t.setText("nothing selected");
            this.setBackground(Color.RED);
        }
    }
}
