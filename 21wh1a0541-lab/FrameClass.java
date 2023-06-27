package java21541;
import java.awt.*;
import java.awt.event.*;
public class FrameClass extends Frame{
public void paint(Graphics g) {
this.setBackground(Color.cyan);
//g.drawRect(100, 100, 200, 200);
//g.setColor(Color.blue);
g.fillRect(100, 100, 200, 200);
g.drawOval(100, 100, 200, 200);
g.setColor(Color.yellow);
g.fillOval(100, 100, 200, 200);
g.setColor(Color.black);
g.fillOval(150,150,25,25);
g.fillOval(230,150,25,25);
g.fillRect(200, 190, 10, 25);
g.fillRect(165, 250, 75, 15);

}
public static void main(String[] args) {
FrameClass f = new FrameClass();
f.setTitle("Test");
f.setSize(400,400);
f.setVisible(true);
f.addWindowListener(new Myclass());
}
}
class Myclass extends WindowAdapter{
public void windowClosing(WindowEvent we) {
System.exit(0);
}

}
