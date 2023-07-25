import java.util.*;
class SuperClass{
    void display(){
        System.out.println("Super class");
    }
}
class SubClass1 extends SuperClass{
   void display(){
        System.out.println("Sub class 1");
    } 
}
class SubClass2 extends SuperClass{
   void display(){
        System.out.println("Sub class 2");
    } 
}
class DynamicDispatch{
    public static void main(String args[]){
        SuperClass o = new SuperClass();
        SubClass1 oo = new SubClass1();
        SubClass2 ooo = new SubClass2();
        SuperClass r;
        r = o;
        o.display();
        r = ooo;
        ooo.display();       
        r = oo;
        oo.display();
    }
}