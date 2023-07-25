package javalab;
import java.util.Scanner;

public class StudentMarks {
    String studentName;
    int rollNumber;
    double marks;

    public StudentMarks(String name, int rollNo, double marks) {
        this.studentName = name;
        this.rollNumber = rollNo;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students");
        int numStudents = scanner.nextInt();
        StudentMarks students[] = new StudentMarks[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student details");
            String name = scanner.next();
            int rollNo = scanner.nextInt();
            double marks = scanner.nextDouble();
            students[i] = new StudentMarks(name, rollNo, marks);
        }

        double maxGrade = students[0].marks;
        int maxIndex = 0;

        for (int i = 1; i < numStudents; i++) {
            double currentGrade = students[i].marks;
            if (currentGrade > maxGrade) {
                maxGrade = currentGrade;
                maxIndex = i;
            }
        }

        System.out.println("Student with the highest grade:");
        System.out.println("Name: " + students[maxIndex].studentName);
        System.out.println("Roll Number: " + students[maxIndex].rollNumber);
        System.out.println("Grade: " + students[maxIndex].marks);
    }
}
