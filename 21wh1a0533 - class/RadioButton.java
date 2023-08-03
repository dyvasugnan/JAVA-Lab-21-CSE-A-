package javaclass;
import java.awt.*;
import java.awt.event.*;

public class RadioButton extends Frame implements ItemListener, ActionListener {
    //Button startButton;
    Checkbox redCheckbox, yellowCheckbox, greenCheckbox;
    CheckboxGroup checkboxGroup;

    RadioButton() {
        this.setLayout(new FlowLayout());
        checkboxGroup = new CheckboxGroup();

        //startButton = new Button("START");
        redCheckbox = new Checkbox("RED", checkboxGroup, false);
        yellowCheckbox = new Checkbox("YELLOW", checkboxGroup, false);
        greenCheckbox = new Checkbox("GREEN", checkboxGroup, false);

        //startButton.setBounds(30, 100, 200, 30);
        redCheckbox.setBounds(30, 150, 200, 30);
        yellowCheckbox.setBounds(30, 250, 200, 30);
        greenCheckbox.setBounds(30, 350, 200, 30);

        //this.add(startButton);
        this.add(redCheckbox);
        this.add(yellowCheckbox);
        this.add(greenCheckbox);

        redCheckbox.addItemListener(this);
        yellowCheckbox.addItemListener(this);
        greenCheckbox.addItemListener(this);

        //startButton.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
    	Checkbox selectedCheckbox = checkboxGroup.getSelectedCheckbox();
    	if (selectedCheckbox != null) {
    		
        String selectedLabel = checkboxGroup.getSelectedCheckbox().getLabel();
        
        if (selectedLabel.equals("RED")) {
            this.setBackground(Color.RED);
        }
        if (selectedLabel.equals("YELLOW")) {
            this.setBackground(Color.YELLOW);
        }
        if (selectedLabel.equals("GREEN")) {
            this.setBackground(Color.GREEN);
        }
    }
    }

    public static void main(String[] args) {
        RadioButton app = new RadioButton();
        app.setTitle("TRAFFIC SIGNAL");
        app.setSize(500, 500);
        app.setVisible(true);
        app.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

