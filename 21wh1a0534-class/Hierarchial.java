package java_labcodes;
class base {
   public void display1() {
      System.out.println("Class base");
   }
}
class deriveA extends base {
   public void display2() {
      System.out.println("derived class 1");
   }
}
class deriveB extends base {
  public void display3() {
     System.out.println("derived class 2");
  }
}
public class Hierarchial {
  public static void main(String args[]) {
     deriveA obj1 = new deriveA();
     deriveB obj2 = new deriveB();
     //All classes can access the method of class A
     obj1.display1();
     obj1.display2();
     obj2.display1();
     obj2.display3();
  }
}