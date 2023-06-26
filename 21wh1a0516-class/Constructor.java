package cs;

import java.lang.*;
import java.util.*;

class Student{
	int age;
	String name;
	Student(){
		age = 19;
		name = "Ashwitha";
	}
	Student(int x, String s){
		age = x;
		name = s;
	}
	Student(Student obj){
		age = obj.age;
		name = obj.name;
	}
	void display(){
		System.out.println(age+" "+name);
	}
}
public class Constructor {
	public static void main(String[] args) {
		Student obj = new Student(20, "Ashwitha");
		Student co = new Student(obj);
		co.display();
		
	}
}
