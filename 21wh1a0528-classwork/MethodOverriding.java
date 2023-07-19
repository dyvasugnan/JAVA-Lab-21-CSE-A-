import java.util.*;
class SuperClass{
    void display(){
        System.out.println("Super class method");
    }
}
class SubClass extends SuperClass{
    @Override
    void display(){
        System.out.println("Sub class method");
    }
}
class MethodOverriding{
    public static void main(String args[]){
        SubClass sub = new SubClass();
        sub.display();
        SuperClass s = new SuperClass();
        s.display();
    }
}