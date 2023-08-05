package javalab;
import java.awt.*;
import java.awt.event.*;
public class Frame2 extends Frame implements ActionListener{
    Button b3;
    Frame2(){
        //this.setLayout(new FlowLayout());

        b3=new Button("back");
        b3.setBounds(100,150,50,50);
        add(b3);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        this.dispose();
    }
}