package javaClass;
import java.util.*;
class Bank{
	Scanner sc = new Scanner(System.in);
	void display(int r) {
		class Inner {
			float b = 10000;
			void show(int r) {
				float t = b+(b*(r/100));
				System.out.print("The balance is :"+t);
			}
		}
		System.out.print("Enter the password : ");
		String pws = sc.next();
		if(pws.equals("abcd")==true) {
			Inner i = new Inner();
			i.show(r);
		}
			
	}
}

public class BA {
	class Student{
		int age;
		String name;
		Student(String name,int age){
			this.name = name;
			this.age = age;
			
		}
		void display() {
			System.out.println("Name : "+name);
			System.out.println("Age  :"+age);
		}
	}
}
