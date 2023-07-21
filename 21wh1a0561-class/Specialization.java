package javalab;
class Parents{
	int i=10;
	public void display(){
		System.out.println("Parent class");
		}
}

class childs extends Parents{
	int j= 20;
	public void display(){
		System.out.println("Child class");
	}
}
public class Specialization {
	public static void main(String[] args) {
		Parents p = new childs();
		childs c = (childs)p;
		c.display(); // child class
		System.out.println(c.i); 
		System.out.println(c.j);
		}
}
