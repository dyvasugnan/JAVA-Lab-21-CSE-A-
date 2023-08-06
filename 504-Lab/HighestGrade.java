package moulikaLab;

import java.util.*;

class Student1{
	String name;
	int id;
	double cgpa;
	Student1(String name, int id, double cgpa){
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}
}


public class HighestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of students: ");
		int t = sc.nextInt();
		Student1 s[] = new Student1[t];
		for(int i=0; i<t; i++) {
			System.out.println("Enter the details of student "+(i+1));
			String name = sc.next();
			int id = sc.nextInt();
			double cgpa = sc.nextDouble();
			s[i] = new Student1(name, id, cgpa);
		}
		int max = 0;
		for(int i=0; i<t; i++) {
			if(s[max].cgpa < s[i].cgpa) {
				max = i;
			}
		}
		System.out.println("Details of Student with highest grade: ");
		System.out.println(s[max].name);
		System.out.println(s[max].id);
		System.out.println(s[max].cgpa);
		
		
	}

}
