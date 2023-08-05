package javalab;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener {
    Button b1,b2;
    Frame1(){
        //this.setLayout(new FlowLayout());
        b1=new Button("Next");
        b2=new Button("Exit");
        b1.setBounds(100,150,50,50);
        b2.setBounds(150,150,50,50);
        this.add(b1);
        this.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        if(Str=="Next"){
            Frame2 f2=new Frame2();
            f2.setTitle("Frame2");
            f2.setSize(400,400);
            f2.setVisible(true);
            
        }
        else System.exit(0);
    }
    public static void main(String[] args) {
        Frame1 f=new Frame1();
        f.setTitle("Frame1");
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}
