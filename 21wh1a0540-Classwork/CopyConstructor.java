package javaClass;
import java.util.*;
class Test1{
	String name;
	int age;
	Test1(String name,int age){
		this.name = name;
		this.age = age;
	}
	Test1(Test1 t){
		age = t.age;
		name = t.name;
	}
	void display() {
		System.out.println("Name   : "+name);
		System.out.println("Age    :"+age);
	}
}

public class CopyConstructor {
	  public static void main(String args[]) {
		  Test1 t1 = new Test1("Sindhu",20);
		  Test1 t2 = new Test1(t1);
		  t1.display();
		  t2.display();
	  }
}
