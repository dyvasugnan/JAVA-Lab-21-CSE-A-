package studyjava;
import java.util.*;
public class Student {
       int age;
       String name;
       float marks;
       Scanner sc = new Scanner(System.in);
       void accept() {
    	   System.out.print("Enter age:");
    	   age = sc.nextInt();
    	   System.out.print("Enter name:");
    	   name = sc.next();
    	   System.out.print("Enter marks:");
    	    marks = sc.nextFloat();
       }
       void display() {
    	   System.out.print(age + " , " + name + " , " + marks);
       }
}
class Main{
	public static void main(String args[]) {
		Student st = new Student();
		st.accept();
		st.display();
	}
}
