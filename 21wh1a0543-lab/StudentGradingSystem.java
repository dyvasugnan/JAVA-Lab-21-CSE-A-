package javaprograms;

import java.util.Scanner;

class Student {
	    String name;
	    int rollNumber;
	    double grade;

	    public Student(String name, int rollNumber, double grade) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.grade = grade;
	    }
	}

	public class StudentGradingSystem {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter number of students:");
	        int numStudents = scanner.nextInt();

	        Student highestGradeStudent = null;

	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter student details:");
	            scanner.nextLine(); // Clear the newline character from the previous input

	            System.out.print("Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Roll Number: ");
	            int rollNumber = scanner.nextInt();

	            System.out.print("Grade: ");
	            double grade = scanner.nextDouble();

	            Student student = new Student(name, rollNumber, grade);

	            if (highestGradeStudent == null || student.grade > highestGradeStudent.grade) {
	                highestGradeStudent = student;
	            }
	        }

	        System.out.println("Student with the highest grade:");
	        System.out.println("Name: " + highestGradeStudent.name);
	        System.out.println("Roll Number: " + highestGradeStudent.rollNumber);
	        System.out.println("Grade: " + highestGradeStudent.grade);

	        scanner.close();
	    }
	}

