import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Fact extends JFrame implements ActionListener{
    JTextField t1,t2;
    JLabel l1,l2;
    JButton comp,clr;
    Fact(){
        Container c=getContentPane();
        this.setLayout(null);
        t1=new JTextField();
        t2=new JTextField();
        comp=new JButton("compute");
        clr=new JButton("clear");
        l1=new JLabel("Input");
        l2=new JLabel("Result");
        this.add(t1);
        this.add(t2);
        this.add(comp);
        this.add(clr);
        this.add(l1);
        this.add(l2);
        l1.setBounds(100,100,100,50);
        t1.setBounds(200,100,100,50);
        l2.setBounds(100,200,100,50);
        t2.setBounds(200,200,100,50);
        comp.setBounds(100,300,100,50);
        clr.setBounds(200,300,100,50);
        t1.addActionListener(this);
        t2.addActionListener(this);
        comp.addActionListener(this);
        clr.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        try{
            if(str=="compute"){
                int n=Integer.parseInt(t1.getText());
                int fact=1;
                for(int i=n;i>0;i--){
                    fact*=i;
                }
                t2.setText(String.valueOf(fact));
            }
            if(str=="clear"){
                t1.setText("");
                t2.setText("");
             }
        }
        catch(NumberFormatException nme){
            t2.setText("invalid input");
        }
    }
    public static void main(String[] args) {
        Fact f=new Fact();
        f.setTitle("Factorial");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}