package classprogram;
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
s.setData("likhitha",18).setData("Vasavi",78).getData();

}}
