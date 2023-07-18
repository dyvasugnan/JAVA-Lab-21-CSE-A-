class A {
    void m1(){
      System.out.println("Superclass method");	 
    }
   }
   class B extends A{
    void m2(){
      System.out.println("Subclass method");	 
    }
   }
   class Specialization{
   public static void main(String[] args) 
   {
    A a; 
     a = new B(); 
     B b = (B)a;
     b.m1();
     b.m2();
     }
   }