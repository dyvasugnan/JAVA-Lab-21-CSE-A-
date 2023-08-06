package java_lab;
import java.util.*;
class Student1{
	String name;
	int id;
	double marks;
	Student1(String name, int id, double marks){
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
}


public class HighestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of students: ");
		int t = sc.nextInt();
		Student1 s[] = new Student1[t];
		for(int i=0; i<t; i++) {
			System.out.println("Enter the details of student "+(i+1));
			String name = sc.next();
			int id = sc.nextInt();
			double marks = sc.nextDouble();
			s[i] = new Student1(name, id, marks);
		}
		int max = 0;
		for(int i=0; i<t; i++) {
			if(s[max].marks < s[i].marks) {
				max = i;
			}
		}
		System.out.println("Details of Student with highest grade: ");
		System.out.println(s[max].name);
		System.out.println(s[max].id);
		System.out.println(s[max].marks);
		
		
	}

}

