package javalab;
import java.awt.*;//abstract window toolkit
import java.awt.event.*;
public class FrameClass {

                  public static void main(String[] args) {
Frame f = new Frame("My First Frame");
//f.settitle("some name");
f.setSize(400,400); // u have to ser size or till be(0,0)
f.setVisible(true);// u have to set visible to true or else default false
f.addWindowListener(new Myclass());
}
}
class Myclass extends WindowAdapter{
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}
