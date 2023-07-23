package javalab;
import java.util.*;

public class Studmax {
	
	     String name;
	     int rollNo;
	     double marks;
	     public Studmax(String name, int rollNo, double marks) {
	         this.name = name;
	         this.rollNo = rollNo;
	         this.marks = marks;
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Studmax s[] = new Studmax[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student details: ");
            String name = sc.next();
            int rollNo = sc.nextInt();
            double marks = sc.nextDouble();
            
            s[i] = new Studmax(name, rollNo, marks);
        }
        
        double max = s[0].marks;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            double current = s[i].marks;
            if (current > max) {
                max = current;
                maxIndex = i;
            }
        }
        System.out.println("Student with the highest grade:");
        System.out.println("Name: " + s[maxIndex].name);
        System.out.println("Roll Number: " + s[maxIndex].rollNo);
        System.out.println("Grade: " + s[maxIndex].marks);

	}

}
