import java.util.*;
class Base{
     int x;
     void display(){
    System.out.println("From Base Class");
    }
}
class Derived extends Base {
    void print(){
    System.out.println("From Derived class x value in Base class is " +x);
    }
}
class SingleInheritense{
    public static void main(String[] args){
    Derived ob = new Derived();
    ob.x=14;
    ob.display();
    ob.print();

    }
}