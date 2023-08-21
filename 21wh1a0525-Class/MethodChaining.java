class Test{
	int age;
	String name;
	Test setData(String Name,int Age) {
		age = Age;
		name = Name;
		return this;
	}
	void getData() {
		System.out.println("Name   :"+name);
		System.out.println("Age    :"+age);
	}
}
public class MethodChaining {
	public static void main(String args[]) {
Test s = new Test();
s.setData("shivani",25).setData("bhavani",44).getData();

}}
