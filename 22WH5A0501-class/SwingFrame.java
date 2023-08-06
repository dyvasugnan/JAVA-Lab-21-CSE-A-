import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SwingFrame extends JFrame implements ActionListener{
    JButton b;
    JLabel l;
    SwingFrame(){
        Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        b=new JButton("Click me");
        b.setForeground(Color.PINK);
        b.setBounds(100,100,100,50);
        b.setToolTipText("sample button");
        b.setMnemonic('c');
        b.setEnabled(true);
        c.add(b);
        b.addActionListener(this);
        l=new JLabel();
        c.add(l);
    }
    public void actionPerformed(ActionEvent ae) {
        ImageIcon ii=new ImageIcon("C:\\Program Files\\Java\\jdk-20\\download.jpg");
        l.setIcon(ii);
        l.setBounds(100,100,400,400);
    }
    public static void main(String[] args) {
        SwingFrame f=new SwingFrame();
        f.setTitle("Test window");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}