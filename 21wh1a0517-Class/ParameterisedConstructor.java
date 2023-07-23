package javalab;

class Detail{
	String name;
	int age;
	Detail(String name,int age){
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
	   Detail d = new Detail("Kushi",19);
	   d.display();
   }
}
