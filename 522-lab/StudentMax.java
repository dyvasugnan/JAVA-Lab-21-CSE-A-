package javalab.day12062023;

//public class StudMax {
	import java.util.Scanner;

	public class StudentMax {
	     String name;
	     int rollNo;
	     double marks;
	     public StudentMax(String name, int rollNo, double marks) {
	         this.name = name;
	         this.rollNo = rollNo;
	         this.marks = marks;
	     }
	     public static void main(String[] args) {
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Enter number of students");
	         int n = sc.nextInt();
	         StudentMax s[] = new StudentMax[n];
	         for (int i = 0; i < n; i++) {
	             System.out.println("Enter student details");
	             String name = sc.next();
	             int rollNo = sc.nextInt();
	             double marks = sc.nextDouble();
	             
	             s[i] = new StudentMax(name, rollNo, marks);
	         }
	         double maxGrade = s[0].marks;
	         int maxIndex = 0;
	         for (int i = 1; i < n; i++) {
	             double currentGrade = s[i].marks;
	             if (currentGrade > maxGrade) {
	                 maxGrade = currentGrade;
	                 maxIndex = i;
	             }
	         }
	         System.out.println("Student with the highest grade:");
	         System.out.println("Name: " + s[maxIndex].name);
	         System.out.println("Roll Number: " + s[maxIndex].rollNo);
	         System.out.println("Grade: " + s[maxIndex].marks);
	     }

	     
}
