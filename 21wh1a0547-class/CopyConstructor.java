package java_lab;
import java.lang.*;
class People{
	int  age;
	String name;
	People(int age,String name){
		this.age  = age;
		this.name = name;
	}
	void display() {
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
	}
	People(People p){
		age = p.age;
		name = p.name;
	}
}
public class CopyConstructor {
	public static void main(String args[]) {
		People anu =new People(20,"Anusha");
		People shashi = new People(anu);
		anu.display();
		shashi.display();
	}

}
