package javalab;

import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEvents extends JFrame implements MouseListener{
    JLabel l1;
    public MouseEvents(){
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        l1 = new JLabel();
        l1.setForeground(Color.black);
        add(l1);
        addMouseListener(this);
    }
    public void mouseExited(MouseEvent m){
        l1.setText("Mouse Exited");
    }
    public void mouseEntered(MouseEvent m){
        l1.setText("Mouse Entered");
    }
    public void mouseReleased(MouseEvent m){
        l1.setText("Mouse Released");
    }
    public void mousePressed(MouseEvent m){
        l1.setText("Mouse Pressed");
    }
    public void mouseClicked(MouseEvent m){
        l1.setText("Mouse Clicked");
    }
    public static void main(String[] args) {
    	MouseEvents mep = new MouseEvents();
        mep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mep.setSize(300,300);
        mep.setVisible(true);
    }
}