package java_codes;

class Base {
   public void display1() {
      System.out.println("BASE CLASS");
   }
}
class A extends Base {
   public void display2() {
      System.out.println("1.DERIVED CLASS");
   }
}
class B extends Base {
  public void display3() {
     System.out.println("2.DERIVED CLASS");
  }
}

public class Hierarical {
	public static void main(String args[]) {
	     A obj1 = new A();
	     B obj2 = new B();
	     //All classes can access the method of class A
	     obj1.display1();
	     obj1.display2();
	     obj2.display1();
	     obj2.display3();
	  }
}
