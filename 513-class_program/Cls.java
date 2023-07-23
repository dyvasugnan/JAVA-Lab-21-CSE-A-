package javalab;

class Human{
	String name;
	int age;
	Human(String name,int age){
		this.name= name;
		this.age = age;
	}
	void show() {
		System.out.println(this.name+" is "+this.age+" years old");
	}
}

public class Cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human("Akshaya",20);
		human.show();

	}

}
