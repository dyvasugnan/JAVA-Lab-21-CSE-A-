import java.lang.*;
class Base{
    void baseclass(){
        System.out.println("Base class");
    }
}
class Derived1 extends Base{
    void derived1class(){
        System.out.println("Derived class1 from base");

    }
}

class Derived2 extends Derived1{
    void derived2class(){
        System.out.println("Derived 2 class from derived1 class");
    }
}

class Derived3 extends  Base{
    void derived3class(){
        System.out.println("Derived 3 class from base");
    }
}   
    




public class Hybrid {
    public static void main(String args[]){
        Derived3 obj1 = new Derived3();
        Derived2 obj2 =new Derived2();
        obj1.baseclass();
        obj1.derived3class();
        obj2.baseclass();
        obj2.derived1class();
        obj2.derived2class();

    }
    
}
