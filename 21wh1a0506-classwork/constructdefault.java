import java.lang.*;
import java.util.*;
class Test{
	int age;
	String name;
	Test(){
		name = "Tanvitha";
		age = 21;	
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
