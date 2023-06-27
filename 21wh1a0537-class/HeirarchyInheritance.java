import java.lang.*;
class Base{
    void parentclass(){
         System.out.println("parent class");
    }
}
class Derived1 extends Base{
    void firstderived(){
        System.out.println("First derived class ");

    }
}

class Derived2 extends Base{
    void secondderived(){
        System.out.println("Second derived class");
    }
}


    





public class HeirarchyInheritance {
    public static void main(String args[]){
        Derived1 obj1 =new Derived1();
        Derived2 obj2=new Derived2();
       obj1.parentclass();
       obj1.firstderived();
        obj2.parentclass();
        obj2.secondderived();
    }
    
}
