package labprograms;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Factorial extends JFrame implements ActionListener
{
    JButton b1, b2;
    JTextField t1, t2;
    JLabel l1, l2;
    Factorial(){
    	this.setLayout(null);
        b1 = new JButton("Compute");
        b2 = new JButton("Clear");
        l1 = new JLabel("Number");
        l2 = new JLabel("Result");
        t1 = new JTextField();
        t2 = new JTextField();
        Container c = getContentPane();
        l1.setBounds(100, 150, 100, 50);
        l2.setBounds(100, 250, 100, 50);
        t1.setBounds(200, 150, 100, 50);
        t2.setBounds(200, 250, 100, 50);
        b1.setBounds(150, 450, 100, 50);
        b2.setBounds(280, 450, 100, 50);
        
        this.add(l1);
        this.add(l2);
        this.add(t1);
        this.add(t2);
        this.add(b1);
        this.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if (str.equals("Compute")) 
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
                    for(int i=2; i<=a; i++)
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
        Factorial f = new Factorial();
        f.setTitle("Factorial");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}