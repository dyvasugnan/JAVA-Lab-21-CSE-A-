package labclass;
import java.util.*;
import java.io.*;
class Student{
	int age;
	float marks;
	Student(){
		age=10;
		marks=82.6f;
	}
	void display() {
		System.out.println(age);
		System.out.print(marks);
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		
	}

}
