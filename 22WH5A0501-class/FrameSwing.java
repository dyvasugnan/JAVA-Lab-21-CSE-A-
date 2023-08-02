import java.awt.*;
import javax.swing.*;
class FrameSwing{
    public static void main(String args[]){
        JFrame jf=new JFrame("Test frame");
        jf.setSize(400,400);
        jf.setVisible(true);
        Container c=jf.getContentPane();
        c.setBackground(Color.BLUE);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}