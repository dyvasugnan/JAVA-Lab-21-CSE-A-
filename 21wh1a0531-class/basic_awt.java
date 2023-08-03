import java.awt.*;
import java.util.*;
public class Test extends Frame{
  Test(){
    Button b = new Button("Click Here");
    b.setBounds(30,100,80,30);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
    add(b);
    //setBackground(color.red);
  }
  public static void main(String args[]){
    Test t = new Test();
  }
}
