package javalab;
class Details{
	int age;
	String name;
	Details setData(String Name,int Age) {
		name = Name;
		age = Age;
		
		return this;
	}
	void getData() {
		System.out.println("Name   :"+name);
		System.out.println("Age    :"+age);
	}
}
public class MethodChaining_Ex {

	public MethodChaining_Ex() {
		// TODO Auto-generated constructor stub
		Details d = new Details();
		d.setData("Kushi",19).setData("Nithya",20).getData();
	}

}
