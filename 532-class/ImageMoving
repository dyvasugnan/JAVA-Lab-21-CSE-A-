package javaclass;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Imagemoving extends Frame implements ActionListener {
    Button b1, b2, b3, b4;
    int circleX, circleY;
    Imagemoving() {
        this.setLayout(null);
        b1 = new Button("Up");
        b2 = new Button("Down");
        b3 = new Button("Left");
        b4 = new Button("Right");
        b1.setBounds(150, 400, 100, 50);
        b2.setBounds(150, 500, 100, 50);
        b3.setBounds(50, 450, 100, 50);
        b4.setBounds(250, 450, 100, 50);
        b1.setBackground(Color.blue);
        b2.setBackground(Color.blue);
        b3.setBackground(Color.blue);
        b4.setBackground(Color.blue);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        circleX = 150;
        circleY = 200;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            circleY -= 10; 
        } else if (ae.getSource() == b2) {
            circleY += 10;  
        } else if (ae.getSource() == b3) {
            circleX -= 10; 
        } else if (ae.getSource() == b4) {
            circleX += 10;  
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLUE);
        g.drawOval(circleX - 50, circleY - 50, 100, 100);
    }

    public static void main(String[] args) {
        Imagemoving f = new Imagemoving();
        f.setTitle("CIRCLE MOVING");
        f.setSize(400, 600);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
