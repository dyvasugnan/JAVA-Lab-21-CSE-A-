package javaclass;

//Parent class
class Base{
 void show(int num1) {
     System.out.println("num1: " + num1);
 }
}

//Child class inheriting from the parent class
class Derived extends Base {
 void display(int num2){
     System.out.println("num2: " + num2);
 }
}

//Main class
class SingleInheritance{
 public static void main(String args[]) {
     // Create an instance of the child class
     Derived d = new Derived();

     // Call methods from the parent class
     d.show(10);

     // Call methods specific to the child class
     d.display(20);
 }
}

