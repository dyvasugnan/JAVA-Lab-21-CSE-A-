import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Car extends JFrame implements ActionListener {
    JButton left, right, up, bottom;
    JLabel imageLabel; 
    Container c = getContentPane();
    Car() {
        this.setSize(900, 900);
        this.setLayout(null);

        left = new JButton("LEFT");
        right = new JButton("RIGHT");
        up = new JButton("UP");
        bottom = new JButton("DOWN");

        c.add(left);
        c.add(right);
        c.add(up);
        c.add(bottom);

        imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\TEJU\\OneDrive\\Desktop\\JAVA\\car2.jpeg");
        imageLabel.setIcon(imageIcon);
        c.add(imageLabel);

        left.setBounds(200, 600, 100, 50);
        right.setBounds(600, 600, 100, 50);
        up.setBounds(400, 500, 100, 50);
        bottom.setBounds(400, 700, 100, 50);
        imageLabel.setBounds(100,100,600,300);

        left.addActionListener(this);
        right.addActionListener(this);
        up.addActionListener(this);
        bottom.addActionListener(this);


    }
    /*public void paint(Graphics g)
    {
        super.paint(g);
        //g.setColor(Color.black);
        //g.fillOval(100,100,100,100);

    }*/

    public void actionPerformed(ActionEvent ae) {
        int x = imageLabel.getX();
        int y = imageLabel.getY();
        if(ae.getSource()==left) {
            x -= 10;
        }
        if(ae.getSource()==right) {
            x += 10;
        }
        if(ae.getSource()==up) {
            y -= 10;
        }
        if(ae.getSource()==bottom) {
            y += 10;
        }
    
        imageLabel.setBounds(x, y, 600, 300);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Car c = new Car();
            c.setVisible(true);
            c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
