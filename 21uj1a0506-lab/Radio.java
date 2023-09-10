package javalab;
import java.awt.*;
import java.awt.event.*;
public class Radio extends Frame implements ItemListener {
    Checkbox cb1,cb2,cb3;
    CheckboxGroup cbg= new CheckboxGroup();
    Radio(){
        this.setLayout(null);
        Checkbox cb1=new Checkbox("Red",cbg,true);
        Checkbox cb2=new Checkbox("Green",cbg,false);
        Checkbox cb3=new Checkbox("Yellow",cbg,false);
        cb1.setBounds(200,100,100,50);
        cb2.setBounds(300,100,100,50);
        cb3.setBounds(400,100,100,50);
        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
        repaint();
    }
    public void paint(Graphics g){
        super.paint(g);
        Checkbox selected=cbg.getSelectedCheckbox();
        String str=selected.getLabel();
        if(str =="Red"){
            g.setColor(Color.RED);
            g.drawString("STOP",100,100);
        }
        if(str == "Green"){
            g.setColor(Color.GREEN);
            g.drawString("GO",100,100);
        }
        if(str == "Yellow"){
            g.setColor(Color.YELLOW);
            g.drawString("WAIT",100,100);
        }
    }
    public static void main(String[] args) {
        Radio r=new Radio();
        r.setTitle("Traffic Lights");
        r.setSize(400,400);
        r.setVisible(true);
        r.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}