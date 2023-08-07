import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FactGui extends JFrame implements ActionListener
{
    JButton b1, b2;
    JTextField t1, t2;
    JLabel l1,l2;
    FactGui()
    {
        this.setLayout(null);
        b1 = new JButton("Comp");
        b2 = new JButton("Clear");
        t1 = new JTextField();
        t2 = new JTextField();
        l1= new JLabel("Num");
        l2= new JLabel("Res");
        Container c = getContentPane();
        l1.setBounds(100,150,100,50);
        l2.setBounds(100,250,100,50);
        t1.setBounds(200, 150, 100, 50);
        t2.setBounds(200, 250, 100, 50);
        b1.setBounds(150, 450, 100, 50);
        b2.setBounds(150, 550, 100, 50);
        c.setLayout(null);
        c.add(l1);
        c.add(l2);
        c.add(t1);
        c.add(t2);
        c.add(b1);
        c.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
    	
        String str = ae.getActionCommand();
        if (str.equals("Comp")) 
        {
            try 
            {
                int a = Integer.parseInt(t1.getText());
                if(a == 0 || a == 1)
                {
                    t2.setText("1");
                }
                else
                {
                    long fact = 1;
                    for(int i=1; i<=a; i++)
                    {
                        fact *= i;
                    }
                    t2.setText(String.valueOf(fact));
                }
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
        FactGui f = new FactGui();
        f.setTitle("Factorial");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
