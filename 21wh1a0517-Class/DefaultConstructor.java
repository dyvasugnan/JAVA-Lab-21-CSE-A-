package javalab;

class Details{
	int Age;
	String Name;
	Details(){
		Age = 19;
		Name = "kushi";
	}
	void display() {
		System.out.println("Name : "+Name);
		System.out.println("age  : "+Age);
	}
}
public class DefaultConstructor {
   public static void main(String args[]) {
	   Details d = new Details();
	   d.display();
   }
}