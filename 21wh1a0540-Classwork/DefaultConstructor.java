package javaClass;
import java.util.*;
class Test{
	int age;
	String name;
	Test(){
		name = "Sindhu";
		age = 20;	
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("age  : "+age);
	}
}
public class DefaultConstructor {
	   public static void main(String args[]) {
		   Test t = new Test();
		   t.display();
	   }

}
