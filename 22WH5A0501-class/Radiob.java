import java.awt.*;
import java.awt.event.*;
public class Radiob extends Frame implements ItemListener {
    Checkbox cb1,cb2,cb3;
    CheckboxGroup cbg= new CheckboxGroup();
    Radiob(){
        this.setLayout(null);
        Font f1=new Font("Times New Roman",Font.BOLD,15);
        Checkbox cb1=new Checkbox("Red",cbg,true);
        Checkbox cb2=new Checkbox("Green",cbg,false);
        Checkbox cb3=new Checkbox("Yellow",cbg,false);
        cb1.setBounds(100,100,100,50);
        cb2.setBounds(200,100,100,50);
        cb3.setBounds(300,100,100,50);
        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        cb1.setFont(f1);
        cb2.setFont(f1);
        cb3.setFont(f1);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
        repaint();
    }
    public void paint(Graphics g){
        super.paint(g);
        Font f2=new Font("Verdana",Font.BOLD,25);
        Checkbox selected=cbg.getSelectedCheckbox();
        String str=selected.getLabel();
        if(str.equals("Red")){
            g.setColor(Color.RED);
            g.setFont(f2);
            g.drawString("STOP",100,100);
        }
        if(str.equals("Green")){
            g.setColor(Color.GREEN);
            g.setFont(f2);
            g.drawString("GO",100,100);
        }
        if(str.equals("Yellow")){
            g.setColor(Color.YELLOW);
            g.setFont(f2);
            g.drawString("WAIT",100,100);
        }
    }
    public static void main(String[] args) {
        Radiob r=new Radiob();
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