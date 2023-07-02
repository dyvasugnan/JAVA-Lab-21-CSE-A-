package classprogram;
class Test{
	String name;
	int age;
	Test(String name,int age){
		this.name = name;
		this.age = age;
	}
	Test(Test t){
		age = t.age;
		name = t.name;
	}
	void display() {
		System.out.println("Name   : "+name);
		System.out.println("Age    :"+age);
	}
}
public class CopyConstructor {
  public static void main(String args[]) {
	  Test t = new Test("LIKHITHA",18);
	  Test t2 = new Test(t);
	  t.display();
	  t2.display();
  }
}
