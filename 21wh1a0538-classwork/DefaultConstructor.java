package classprogram;
class Test{
	int age;
	String name;
	Test(){
		age = 10;
		name = "likhitha";
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("age  : "+age);
	}
}
public class DefaultConstructor {
   public static void main(String args[]) {
	   Test t = new Test();
	   t.display();
   }
}
