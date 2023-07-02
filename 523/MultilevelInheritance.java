package javaclss;
class Base{
    void show1(){
        System.out.println("Base class");
    }
}
class Derived1 extends Base{
    void show2(){
        System.out.println("first derived class");
    }
}
class Derived2 extends Derived1{
    void show3(){
        System.out.println("Second derived class from derived class1");

    }
}
    public class MultilevelInheritance {
        public static void main(String args[]){
            Derived2 obj =new Derived2();
            obj.show1();
            obj.show2();
            obj.show3();
        }
    
}