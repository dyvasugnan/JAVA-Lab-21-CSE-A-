package javalab;
import java.lang.*;
class Base{
    void show(){
        System.out.println("Base");
    }
}
class Derived extends Base{
    void show1(){
        System.out.println("derived class");
    }
}
class Derived1 extends Derived{
    void show2(){
        System.out.println("derived1 class from derived class");

    }
}




    public class MultiLevel {
        public static void main(String args[]){
            Derived1 obj =new Derived1();
            obj.show();
            obj.show1();
            obj.show2();
        }
    
}