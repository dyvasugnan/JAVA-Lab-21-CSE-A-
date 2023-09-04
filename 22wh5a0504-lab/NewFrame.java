import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NewFrame extends JFrame implements ActionListener{

    JButton jb1, jb2;
    JTextField jt1,jt2;
    JPanel jp;
    Container c;
    NewFrame()
    {
        jb1 = new JButton("Compute");
        jb2 = new JButton("Clear");
        jt1 = new JTextField();
        jt2 = new JTextField();
        jp = new JPanel(null);
        c = getContentPane();
        c.add(jt1);
        c.add(jt2);
        c.add(jb1);
        c.add(jb2);
        jb1.setBounds(50, 100, 100, 20);
        jb2.setBounds(200, 100, 100, 20);
        jt1.setBounds(50, 50, 100, 20);
        jt2.setBounds(200, 50, 100, 20);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jt1.addActionListener(this);
        jt2.addActionListener(this);
        this.add(jp);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == jb1)
        {
            String n = jt1.getText();
            int num = Integer.parseInt(n);
            int fact = 1;
            while(num != 0)
            {
                fact *= num;
                num--;
            }
            jt2.setText(String.valueOf(fact));
        }
        else
        {
            jt1.setText("");
            jt2.setText("");
        }
    }
    public static void main(String[] args) {
        NewFrame jf = new NewFrame();
        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
