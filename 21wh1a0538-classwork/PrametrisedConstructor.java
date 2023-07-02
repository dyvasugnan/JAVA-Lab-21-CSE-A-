package classprogram;
class Test{
	String name;
	int age;
	Test(String name,int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name  : "+name);
		System.out.println("Age   :"+age);
	}
}
public class PrametrisedConstructor {
   public static void main(String args[]) {
	   Test t = new Test("likhitha",18);
	   t.display();
   }
}
