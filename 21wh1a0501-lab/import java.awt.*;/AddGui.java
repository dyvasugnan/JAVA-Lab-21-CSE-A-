import java.awt.*;
import java.awt.event.*;

public class FrameClass extends Frame implements ActionListener
{
    Button b1, b2;
    TextField t1, t2, t3;
    Label num1, num2, num3;
    FrameClass()
    {
        this.setLayout(null);
        b1 = new Button("Add");
        b2 = new Button("Clear");
        num1 = new Label("Number 1");
        num2 = new Label("Number 2");
        num3 = new Label("Result");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        
        num1.setBounds(100, 150, 100, 50);
        num2.setBounds(100, 250, 100, 50);
        num3.setBounds(100, 350, 100, 50);
        t1.setBounds(200, 150, 100, 50);
        t2.setBounds(200, 250, 100, 50);
        t3.setBounds(200, 350, 100, 50);
        b1.setBounds(150, 450, 100, 50);
        b2.setBounds(150, 550, 100, 50);
        
        this.add(num1);
        this.add(num2);
        this.add(num3);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(b1);
        this.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if(str.equals("Add"))
        {
            try 
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(String.valueOf(c));
            } 
            catch (NumberFormatException ex) 
            {
                t3.setText("Invalid input");
            }
        }
        else if (str.equals("Clear"))
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
    
    public static void main(String args[])
    {
        FrameClass f = new FrameClass();
        f.setTitle("Arithmetic Operations");
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}
