package java_codes;


import java.lang.*;
import java.awt.*;
import java.awt.event.*;
public class Factorial extends Frame implements ActionListener{
                Button b1,b2;
                TextField n1,ans;
                Label number,factorial;
                Factorial(){
                    this.setLayout(null);
                    b1 = new Button("Compute");
                    b2 = new Button("Clear");
                    number= new Label("Number");
                    factorial = new Label("Factorial");
                    n1= new TextField();
                    ans = new TextField();
                    number.setBounds(100, 150, 100, 50);
           n1.setBounds(200, 150, 100, 50);
           
factorial.setBounds(100, 350, 100, 50);
ans.setBounds(200, 350, 300, 50);
b1.setBounds(150, 450, 100, 50);
b2.setBounds(150,550,100,50);
this.add(b1);
this.add(b2);
this.add(number);

this.add(factorial);
this.add(n1);

this.add(ans);
b1.addActionListener(this);
b2.addActionListener(this);
n1.addActionListener(this);

ans.addActionListener(this);
                }
    public void actionPerformed(ActionEvent ae){
            String str = ae.getActionCommand();
            if(str == "Compute"){
            int i,fact=1;
int a = Integer.parseInt(n1.getText());
for(i=a;i>=1;i--){
   fact=fact*i;
   

            }
            ans.setText(String.valueOf(fact));
  }
    

if(str =="Clear")
{
n1.setText("");
ans.setText("");

}
    }
   
    public static void main(String[] args){
        Factorial f = new Factorial();
        f.setTitle("Factorial");
        f.setSize(400,400);
        f.setVisible(true);
   f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
    }
}


