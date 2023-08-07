import java.awt.event.*;
import javax.swing.*;
public class TemperatureConverter extends JFrame implements ActionListener{
    JTextField t1,t2;
    JLabel l1,l2;
    JButton ctc,ctf,clr;
    TemperatureConverter(){
        this.setLayout(null);
        t1=new JTextField();
        t2=new JTextField();
        l1=new JLabel("Faranheit");
        l2=new JLabel("Celsius");
        ctc=new JButton("Convert to celsius");
        ctf=new JButton("Convert to faranheit");
        clr=new JButton("clear");
        l1.setBounds(100,100,100,50);
        t1.setBounds(200,100,100,50);
        l2.setBounds(100,200,100,50);
        t2.setBounds(200,200,100,50);
        ctc.setBounds(100, 300, 100, 50);
        ctf.setBounds(200,300,100,50);
        clr.setBounds(150,400,100,50);
        this.add(t1);
        this.add(t2);
        this.add(l1);
        this.add(l2);
        this.add(ctc);
        this.add(ctf);
        this.add(clr);
        t1.addActionListener(this);
        t2.addActionListener(this);
        ctc.addActionListener(this);
        ctf.addActionListener(this);
        clr.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==ctc){
                float far=Float.parseFloat(t1.getText());
                float cel=(far-32)*(5.0f/9.0f);
                t2.setText(String.valueOf(cel));
            }
            if(ae.getSource()==ctf){
                float cel=Float.parseFloat(t2.getText());
                float far=(cel*(9.0f/5.0f))+32.0f;
                t1.setText(String.valueOf(far));
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
        TemperatureConverter tc=new TemperatureConverter();
        tc.setTitle("Temperature converter");
        tc.setSize(400,400);
        tc.setVisible(true);
        tc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
