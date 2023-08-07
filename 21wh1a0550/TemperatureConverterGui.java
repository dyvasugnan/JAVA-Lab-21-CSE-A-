package javaclasswork;
import java.awt.*;
import java.awt.event.*;
public class TemperatureConverterGui extends Frame implements ActionListener {
    Label l1, l2;
    Button b1, b2,b3;
    TextField t1, t2;
    TemperatureConverterGui() {
        this.setLayout(null);
        b1 = new Button("F to C");
        b2 = new Button("C to F");
        b3 = new Button("Clear");
        
        l1 = new Label("Temperature");
        l2 = new Label("Result");
        
        t1 = new TextField();
        t2 = new TextField();
        
        l1.setBounds(50, 100, 100, 20);
        t1.setBounds(50, 140, 100, 20);
        
        l2.setBounds(200, 100, 100, 20);
        t2.setBounds(200, 140, 100, 20);
        
        b1.setBounds(50, 250, 50, 20);
        b2.setBounds(110, 250, 50, 20);
        b3.setBounds(180,250,50,20);
        
        this.add(b1);
        this.add(b2);
        this.add(b3);
        
        this.add(l1);
        this.add(l2);
        
        this.add(t1);
        this.add(t2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("F to C")) {
            double fahrenheit = Double.parseDouble(t1.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            t2.setText(String.valueOf(celsius));
        }
        if (str.equals("C to F")) {
            double celsius = Double.parseDouble(t1.getText());
            double fahrenheit = celsius * 9 / 5 + 32;
            t2.setText(String.valueOf(fahrenheit));
        }
        if(str.equals("Clear")) {
			t1.setText("");
			t2.setText("");
		}
	}

    public static void main(String args[]) {
        TemperatureConverterGui f = new TemperatureConverterGui();
        f.setTitle("Temperature Converter");
        f.setSize(450, 450);
        f.setVisible(true);
        f.setLocation(500, 200);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}