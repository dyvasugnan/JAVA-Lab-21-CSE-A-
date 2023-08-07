import java.awt.*;
import java.awt.event.*;

public class Currency extends Frame implements ActionListener
{
    Button b1, b2, b3;
    TextField t1, t2;
    Label l1, l2;
    Currency()
    {
        this.setLayout(null);
        b1 = new Button("ToRupees");
        b2 = new Button("ToEuros");
        b3 = new Button("Clear");
        t1 = new TextField();
        t2 = new TextField();
        l1 = new Label("Rupees");
        l2 = new Label("Euros");

        l1.setBounds(100, 150, 100, 50);
        l2.setBounds(100, 250, 100, 50);
        t1.setBounds(200, 150, 100, 50);
        t2.setBounds(200, 250, 100, 50);
        b1.setBounds(150, 450, 100, 50);
        b2.setBounds(150, 550, 100, 50);
        b3.setBounds(150, 650, 100, 50);

        this.add(l1);
        this.add(l2);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(t1);
        this.add(t2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);  
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if (str.equals("ToRupees")) 
        {
            try 
            {
                float a = Float.parseFloat(t2.getText());
                t1.setText(String.valueOf(91.0f*a));
            } 
            catch (NumberFormatException ex) 
            {
                t2.setText("Invalid input");
            }
        }
        else if (str.equals("ToEuros")) 
        {
            try 
            {
                float a = Float.parseFloat(t1.getText());
                t2.setText(String.valueOf(a/91.0f));
            } 
            catch (NumberFormatException ex) 
            {
                t2.setText("Invalid input");
            }
        }
        else if (str.equals("Clear"))
        {
            t1.setText("");
            t2.setText("");
        }
    }

    public static void main(String args[])
    {
        Currency c = new Currency();
        c.setTitle("Currency Convertor");
        c.setSize(400, 400);
        c.setVisible(true);
        c.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}
