package javaclass;
//Grandparent class
class A {
 void show1() {
     System.out.println("Base class");
 }
}

//Parent class inheriting from the grandparent class
class B extends A {
 void show2() {
     System.out.println("Derived class");
 }
}
//Child class inheriting from the parent class
class C extends B {
 void show3() {
     System.out.println("Derived class");
 }
}
class MultiLevel{
public static void main(String[] args) {
     C c = new C();
     c.show1();
     c.show2();
     c.show3();
 }
}

