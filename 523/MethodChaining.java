package javaclss;

public class MethodChaining {
	int a,b;
    MethodChaining setData(int x,int y){
        a=x;
        b=y;
        return this;
    }
    MethodChaining getData(){
         System.out.println(a);
        System.out.println(b);
        return this;
    }
   
    public static void main(String[] args) {
       MethodChaining s1=new MethodChaining();
       s1.setData(10,11).getData().setData(20,21).getData();
       // s1.setData(10,11);
       //s1.getData();
       //s1.setData(20,21);
       //s1.getData();
       }
}
