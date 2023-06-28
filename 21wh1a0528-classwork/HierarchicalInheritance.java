import java.util.*;
class A{
     void showA(){
        System.out.println("Class A ");
    }
}
class B extends A{
    void showB(){
        System.out.println("Class B ");
    }
   
}
class C extends A{
   void showC(){
        System.out.println("Class C ");
    }
}
class HierarchicalInheritance{
    public static void main(String args[]){
        System.out.println("Calling from class B");
        B b = new B();
        b.showA();
        b.showB();
        System.out.println("Calling from class ");
        C c = new C();
        c.showA();
        c.showC();
    }
}