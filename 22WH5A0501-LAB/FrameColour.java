import java.awt.*;
import java.awt.event.*;
public class FrameColour extends Frame implements ActionListener {
    Button b1,b2,b3,b4;
    FrameColour(){
        this.setLayout(null);
        b1=new Button("Red");
        b1.setBounds(100,100,100,50);
        b2=new Button("Green");
        b2.setBounds(100,200,100,50);
        b3=new Button("Blue");
        b3.setBounds(100,300,100,50);
        b4=new Button("Black");
        b4.setBounds(100, 400, 100, 50);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        if(str=="Red")
            this.setBackground(Color.RED);
        if(str=="Green")
            this.setBackground(Color.GREEN);
        if(str=="Blue")
            this.setBackground(Color.BLUE);
        if(str=="Black")
            this.setBackground(Color.BLACK);
    }
    public static void main(String[] args) {
        FrameColour f=new FrameColour();
        f.setTitle("COLOR");
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}