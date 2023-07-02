package javaclss;
import java.lang.*;
class Base_{
    void show_b(){
       System.out.println("Base class");
    }
}
class Derived_1 extends Base_{
    void show_d1(){
       System.out.println("Derived class1 from base");

    }
}

class Derived_2 extends Derived_1{
    void show_d2(){
        System.out.println("Derived 2 class from derived1 class");
    }
}

class Derived_3 extends  Base_{
    void show_d3(){
        System.out.println("Derived 3 class from base");
    }
}   



public class HybridLevel {
	    public static void main(String args[]){
	        Derived_3 obj1 = new Derived_3();
	        Derived_2 obj2 =new Derived_2();
	        obj1.show_b();
	        obj1.show_d3();
	        obj2.show_b();
	        obj2.show_d1();
	        obj2.show_d2();

	    }  
}