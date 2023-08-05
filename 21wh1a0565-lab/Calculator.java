
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b00;
    Button add,sub,div,mul,mod,back,clr,eq;
    int num1,num2;
    char op;
    TextField t;
    Calculator(){
        this.setLayout(null);
        t=new TextField();
        t.setBackground(Color.LIGHT_GRAY);
        t.setBounds(50,50,200,50);
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        b00=new Button("00");
        add=new Button("+");
        sub=new Button("-");
        div=new Button("/");
        mul=new Button("*");
        mod=new Button("%");
        back=new Button("back");
        clr=new Button("CE");
        eq=new Button("=");
        clr.setBounds(50,100,50,50);
        mod.setBounds(100,100,50,50);
        back.setBounds(150,100,50,50);
        div.setBounds(200,100,50,50);
        b7.setBounds(50,150,50,50);
        b8.setBounds(100,150,50,50);
        b9.setBounds(150,150,50,50);
        mul.setBounds(200,150,50,50);
        b4.setBounds(50,200,50,50);
        b5.setBounds(100,200, 50, 50);
        b6.setBounds(150,200,50,50);
        sub.setBounds(200,200,50,50);
        b1.setBounds(50,250,50,50);
        b2.setBounds(100,250,50,50);
        b3.setBounds(150,250,50,50);
        add.setBounds(200,250,50,50);
        b00.setBounds(50,300,50,50);
        b0.setBounds(100,300,50,50);
        eq.setBounds(150,300,100,50);
        this.add(t);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b0);
        this.add(b00);
        this.add(clr);
        this.add(eq);
        this.add(add);
        this.add(sub);
        this.add(mul);
        this.add(div);
        this.add(mod);
        this.add(back);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        b00.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        eq.addActionListener(this);
        clr.addActionListener(this);
        back.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        //String s=ae.getActionCommand();
        String s1,s2;
        try{
            if(ae.getSource() == b1){
                s1=t.getText();
                s2 = s1+"1";
                t.setText(s2);
            }
            if(ae.getSource() == b2){
                s1=t.getText();
                s2=s1+"2";
                t.setText(s2);
            }
            if(ae.getSource()== b3){
                s1=t.getText();
                s2=s1+"3";
                t.setText(s2);
            }
            if(ae.getSource() == b4){
                s1=t.getText();
                s2=s1+"4";
                t.setText(s2);
            }
            if(ae.getSource() == b5){
                s1=t.getText();
                s2=s1+"5";
                t.setText(s2);
            }
            if(ae.getSource() == b6){
                s1=t.getText();
                s2=s1+"6";
                t.setText(s2);
            }
            if(ae.getSource() == b7){
                s1=t.getText();
                s2=s1+"7";
                t.setText(s2);
            }
            if(ae.getSource() == b8){
                s1=t.getText();
                s2=s1+"8";
                t.setText(s2);
            }
            if(ae.getSource() == b9){
                s1=t.getText();
                s2=s1+"9";
                t.setText(s2);
            }
            if(ae.getSource() == b0){
                s1=t.getText();
                s2=s1+"0";
                t.setText(s2);
            }
            if(ae.getSource() == b00){
                s1=t.getText();
                s2=s1+"00";
                t.setText(s2);
            }
            if(ae.getSource() == add){
                s1=t.getText();
                op='+';
                num1=Integer.parseInt(s1);
                s2=s1+"+";
                t.setText(s2);
            }
            if(ae.getSource() == sub){
                s1=t.getText();
                op='-';
                num1=Integer.parseInt(s1);
                s2=s1+"-";
                t.setText(s2);
            }
            if(ae.getSource() == mul){
                s1=t.getText();
                op='*';
                num1=Integer.parseInt(s1);
                s2=s1+"*";
                t.setText(s2);
            }
            if(ae.getSource() == div){
                s1=t.getText();
                op='/';
                num1=Integer.parseInt(s1);
                s2=s1+"/";
                t.setText(s2);
            }
            if(ae.getSource() == mod){
                s1=t.getText();
                op='%';
                num1=Integer.parseInt(s1);
                s2=s1+"%";
                t.setText(s2);
            }
            if(ae.getSource() == clr){
                t.setText("");
            }
            if(ae.getSource() == back){
                s1=t.getText();
                s2=s1.substring(0,s1.length()-1);
                t.setText(s2);
            }
            if(ae.getSource() == eq){
                s1=t.getText();
                String str[]=s1.split("[\\+\\-\\*\\/\\%]");
                int len=str.length;
                num2=Integer.parseInt(str[len-1]);
                int res=0;
                switch(op){
                    case '+':res=num1+num2;
                        break;
                    case '-': res=num1-num2;
                        break;
                    case '*':res=num1*num2;
                        break;
                    case '/':res=num1/num2;
                        break;
                    case '%': res=num1%num2;
                        break;
                }
                t.setText(String.valueOf(res));
            }
        }
        catch(NumberFormatException nme){
            t.setText("Invalid input");
        }
        catch(StringIndexOutOfBoundsException sie){
            t.setText("");
        }
        catch(ArithmeticException are){
            t.setText("Cannot be divided by 0");
        }
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.setTitle("MY CALCULATOR");
        c.setSize(400,400);
        c.setVisible(true);
        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}