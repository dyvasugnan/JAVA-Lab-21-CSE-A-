import java.lang.*;
import java.util.*;
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
public class ObjArr{
	public static void main(String args[]) {
		Student s[]= new Student[5];
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++) {
			name = sc.next();
			age = sc.nextInt();
			s[i] = new Student(name,age);
		}
		for(int i = 0;i<5;i++) {
			s[i].display();
		}
	}
}
