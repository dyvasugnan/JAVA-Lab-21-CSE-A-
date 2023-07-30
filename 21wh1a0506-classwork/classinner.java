package javaclass;

public class InnerClass {
	public static void main(String[] args) {
	OuterClass.Inner obj1 = new OuterClass().new Inner();
	obj1.show();
	OuterClass obj2 = new OuterClass();
	System.out.print("The char enetered is :"+ obj2.x);
  }
}
class OuterClass{
	char x = 'A';
	OuterClass(){
		System.out.println("Constructor of outer");
	}
	class Inner{
		void show(){
			System.out.println("Inner class");
		}
	}
}
