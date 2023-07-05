package javaClass;
import java.util.*;

class Demo{
	String name;
	int age;
	Demo(String name,int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name  : "+name);
		System.out.println("Age   :"+age);
	}
}

public class ParameterisedConstructor {
	  public static void main(String args[]) {
		   Demo d = new Demo("Sindhu",20);
		   d.display();
	   }
}
