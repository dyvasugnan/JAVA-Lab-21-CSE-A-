import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConverter extends JFrame implements ActionListener{
    JTextField t1,t2;
    JLabel l1,l2;
    JButton ctd,ctr,clr;
    Container c;
    CurrencyConverter(){
        c=getContentPane();
        this.setLayout(null);
        t1=new JTextField();
        t2=new JTextField();
        l1=new JLabel("Rupee");
        l2=new JLabel("Dollar");
        ctd=new JButton("Convert to dollar");
        ctr=new JButton("Convert to rupee");
        clr=new JButton("clear");
        l1.setBounds(100,100,100,50);
        t1.setBounds(200,100,100,50);
        l2.setBounds(100,200,100,50);
        t2.setBounds(200,200,100,50);
        ctd.setBounds(100, 300, 100, 50);
        ctr.setBounds(200,300,100,50);
        clr.setBounds(150,400,100,50);
        this.add(t1);
        this.add(t2);
        this.add(l1);
        this.add(l2);
        this.add(ctd);
        this.add(ctr);
        this.add(clr);
        t1.addActionListener(this);
        t2.addActionListener(this);
        ctd.addActionListener(this);
        ctr.addActionListener(this);
        clr.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==ctd){
                float rupee=Float.parseFloat(t1.getText());
                float dollar=rupee*0.012f;
                t2.setText(String.valueOf(dollar));
            }
            if(ae.getSource()==ctr){
                float dollar=Float.parseFloat(t2.getText());
                float rupee=dollar*82.75f;
                t1.setText(String.valueOf(rupee));
            }
            if(ae.getSource()==clr){
                t1.setText("");
                t2.setText("");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CurrencyConverter tc=new CurrencyConverter();
        tc.setTitle("Currency converter");
        tc.setSize(400,400);
        tc.setVisible(true);
        tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}