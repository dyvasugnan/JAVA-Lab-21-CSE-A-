package javalab;
class Test{
	String Name;
	int Age;
	Test(String Name,int Age){
		this.Name= Name;
		this.Age=Age;
	}
	Test(Test T){
		Name = T.Name;
		Age = T.Age;
	}
	void display() {
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
	}
}
public class CopyConstructor {
	public static void main(String args[]) {
	  Test T= new Test("Sucharitha", 21);
	  Test T2 = new Test(T);
	  T.display();
	  T2.display();
  }
}