package javaclasswork;
import javax.swing.*;
import java.awt.*;
class Smiley extends JPanel
{
    public static void main(String args[])
    {
        JFrame frame=new JFrame("Smiley");
        frame.setSize(500,500);
        frame.setBackground(Color.white); 
        Smiley panel=new Smiley();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.drawArc(100,100,250,250,0,360);
        g.fillArc(100,100,250,250,0,360);
        g.setColor(Color.black);
        g.drawArc(170,185,25,25,0,360);
        g.fillArc(170,185,25,25,0,360);
        g.drawArc(255,185,25,25,0,360);
        g.fillArc(255,185,25,25,0,360);
        g.drawArc(150,215,150,100,0,-180);
    }
}