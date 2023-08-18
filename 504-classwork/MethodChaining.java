package moulikaLab;
/*Method chaining, also known as cascading, is a programming technique 
 * that allows you to call multiple methods on the same object in a single line 
 * of code. Instead of assigning the result of each method call to a variable
 *  and then calling the next method on that variable,
 *  you directly chain the method calls one after another on the same object.*/

class Student{
	int a,b;	
	Student setData(int a, int b) {
		this.a = a;
		this.b = b;
		return this;
	}	
	Student getData() {
		System.out.println(a+b);
		return this;
	}	
};
public class MethodChaining {
	public static void main(String [] args) {
		Student s1 = new Student();	
		s1.setData(5, 5);
		s1.getData();
		s1.setData(10, 10);
		s1.getData();
	}
}

