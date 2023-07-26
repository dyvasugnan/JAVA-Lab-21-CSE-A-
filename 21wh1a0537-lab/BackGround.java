import java.awt.*;
import java.awt.event.*;
public class BackGround extends Frame implements ActionListener{
    Button b1,b2,b3;
    BackGround (){
        this.setLayout(new FlowLayout());
        b1=new Button("Red");
        b2=new Button("Orange");
        b3=new Button("Green");
        this.add(b1);
        this.add(b2);
        this.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        if(str=="Red") this.setBackground(Color.RED);
        else if(str=="Orange")this.setBackground(Color.ORANGE);
        else if(str=="Green")this.setBackground(Color.GREEN);
    }
    public static void main(String[] args) {
        BackGround bg= new BackGround();
        bg.setTitle("Test");
        bg.setSize(400,400);
        bg.setVisible(true);
        bg.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}