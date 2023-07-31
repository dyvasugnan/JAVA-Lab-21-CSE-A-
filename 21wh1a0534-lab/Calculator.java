package java_labcodes;
import java.awt.*;
import java.awt.event.*;  
class Calculator extends WindowAdapter implements ActionListener{ 
 Frame f=new Frame("My Calculator"); 
Label l;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
Button bAdd,bSub,bMult,bDiv,bMod,bcalc,bclr,bBack;
Calculator(){  
l=new Label(); 
l.setBackground(Color.lightGray);
l.setBounds(50,50,260,60);
b1=new Button("1");
b1.setBounds(50,340,50,50);
b2=new Button("2");
b2.setBounds(120,340,50,50);
b3=new Button("3");
b3.setBounds(190,340,50,50);
b4=new Button("4");
b4.setBounds(50,270,50,50);
b5=new Button("5");
b5.setBounds(120,270,50,50); 
b6=new Button("6");
b6.setBounds(190,270,50,50);
b7=new Button("7");
b7.setBounds(50,200,50,50);
b8=new Button("8");
b8.setBounds(120,200,50,50);
b9=new Button("9");
b9.setBounds(190,200,50,50);
b0=new Button("0");
b0.setBounds(120,410,50,50);
bBack=new Button("back");
bBack.setBounds(140,130 , 100, 50);
bAdd=new Button("+");
bAdd.setBounds(260,340,50,50);
bSub=new Button("-");
bSub.setBounds(260,270,50,50);
bMult=new Button("*");
bMult.setBounds(260,200,50,50);
bDiv=new Button("/");
bDiv.setBounds(50,410,50,50);
bMod=new Button("%");
bMod.setBounds(260,130,50,50);
bcalc=new Button("=");
bcalc.setBounds(190,410,50,50);
bclr=new Button("CE"); 
bclr.setBounds(50,130,65,50);
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
bBack.addActionListener(this); 
bAdd.addActionListener(this);
bSub.addActionListener(this);
bMult.addActionListener(this);
bDiv.addActionListener(this);
bMod.addActionListener(this);
bcalc.addActionListener(this);
bclr.addActionListener(this); 
f.addWindowListener(this);
f.add(l);  f.add(b1); f.add(b2); f.add(b3); 
f.add(b4); f.add(b5);f.add(b6); 
f.add(b7); f.add(b8);f.add(b9);
f.add(b0);
f.add(bAdd); f.add(bSub); f.add(bMod); 
f.add(bMult); f.add(bDiv); f.add(bMod);
f.add(bcalc);f.add(bclr);  f.add(bBack);
f.setSize(460,40);  
f.setLayout(null);  
f.setVisible(true);  
} 
int res;
int num1,num2,op;
public void windowClosing(WindowEvent ae) {
  f.dispose();
}
public void actionPerformed(ActionEvent ae){ 
  String s,str="";
if(ae.getSource()== b1){
  s=str+"1";
  l.setText(s);
}
if(ae.getSource()== b2){
s=str+"2";
l.setText(s);
}
if(ae.getSource()== b3){
  s=str+"3";
  l.setText(s);
}
if(ae.getSource()== b4){
  s=str+"4";
  l.setText(s);
}
if(ae.getSource()== b5){
  s=str+"5";
  l.setText(s);
}
if(ae.getSource()== b6){
  str=l.getText();
  s=str+"6";
  l.setText(s);
}
if(ae.getSource()== b7){
  s=str+"7";
  l.setText(s);
}
if(ae.getSource()== b8){
  s=str+"8";
  l.setText(s);
}
if(ae.getSource()== b9){
  s=str+"9";
  l.setText(s);
}
if(ae.getSource()== b0){
  s=str+"0";
  l.setText(s);
}


if(ae.getSource()== bBack){ 
  try{
    s=str.substring(0, str.length()-1);
    }
  catch(StringIndexOutOfBoundsException f){
    	return;
    	}
  l.setText(s);
}

if(ae.getSource()== bAdd){           
  try{
    num1=Integer.parseInt(l.getText());
    num2=Integer.parseInt(l.getText());
    }
  catch(NumberFormatException n){
      l.setText("Invalid Format");
      return;
    }
  s="";
  l.setText(s);
  op=1;
}
if(ae.getSource()== bSub){   
  try{
    num1=Integer.parseInt(l.getText());
    num2=Integer.parseInt(l.getText());
    }
  catch(NumberFormatException n){
      l.setText("Invalid Format");
      return;
    }
  s="";
  l.setText(s);
  op=2;
}
if(ae.getSource()== bMult){ 
  try{
    num1=Integer.parseInt(l.getText());
    num2=Integer.parseInt(l.getText());
}
  catch(NumberFormatException n){
      l.setText("Invalid Format");
      return;
    }
  s="";
  l.setText(s);
  op=3;
}
if(ae.getSource()== bDiv){    
  try{
    num1=Integer.parseInt(l.getText());
    num2=Integer.parseInt(l.getText());
    }
  catch(ArithmeticException ae1){
		l.setText("Division by zero not possible");
		}
  catch(NumberFormatException n){
      l.setText("Invalid Format");
      return;
    }
  s="";
  l.setText(s);
  op=4;
}
if(ae.getSource()== bMod){  
  try{
    num1=Integer.parseInt(l.getText());
    num2=Integer.parseInt(l.getText());
    }
  catch(NumberFormatException n){
      l.setText("Invalid Format");
      return;
    }
  s="";
  l.setText(s);
  op=5;
}
if(ae.getSource()== bcalc){          
  try{
    num2=Integer.parseInt(l.getText());
    }
  catch(Exception e){
      l.setText("ENTER NUMBER FIRST ");
      return;
    }
  if(op==1)
    res =num1+num2;
  if(op==2)
    res =num1-num2;
  if(op==3)
    res =num1*num2;
  if(op==4)
    res =num1/num2; 
  if(op==5)
    res =num1%num2;    
  l.setText(String.valueOf(res));
}
if(ae.getSource()==bclr){
  num1=0;
  num2=0;
  op=0;
  res=0;
   s="";
   l.setText(s);
   } 

}  
public static void main(String args[]){  
       new Calculator(); 
      
   }
}