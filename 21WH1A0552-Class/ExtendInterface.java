import java.util.*;
import java.io.*;
interface A{
        void method1();
}
interface B extends A{
        void method1();
        void method2();
}
class Test implements B{
        public void method1(){
                System.out.println("Extending Interface");
        }
        public void method2(){
                System.out.println("Implementing Interface");
        }
}
class ExtendInterface{
        public static void main(String args[]){
                A a;
                B b;
                b = new Test();
                b.method1();
                b.method2();
        }
}
