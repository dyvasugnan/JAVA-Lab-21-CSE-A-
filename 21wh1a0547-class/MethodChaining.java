package java_lab;
import java.lang.*;
class Student{
	int a,b;
	Student SetData(int a,int b) {
		this .a = a;
		this.b= b;
		return this;
	}
	Student GetData() {
		System.out.println(a);
		System.out.println(b);
        return this;
	}
}
public class MethodChaining {
	public static void main(String args[]) {
		Student s = new Student();
		s.SetData(10, 20);
		s.GetData();
	}

}
