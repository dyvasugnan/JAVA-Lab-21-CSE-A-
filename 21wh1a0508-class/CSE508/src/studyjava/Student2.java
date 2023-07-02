package studyjava;
//import java.lang.*;
//import java.util.Scanner;

public class Student2 {
 int age;
 String name;
 float marks;
    Student2( int a,String s,float m) {
    	 age=  a;
    	 name =s;
      marks = m;
 }
 void display() {
	 System.out.print(age+ " ,"+ name+" , "+ marks);
 }
}
  class Main2 {
	 public static void main(String args[]) {
		 Student2 sc = new Student2(21,"udaya",88.6f);
		 sc.display();
	 }
  }

 

