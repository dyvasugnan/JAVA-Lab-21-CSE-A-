package grade;
import java.util.Scanner;
public class StudentGrade {
	private String name;
    private int rollNumber;
    private double grade;

    public StudentGrade(String name, int rollNumber, double grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        StudentGrade[] students = new StudentGrade[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student details:");
            scanner.nextLine(); 

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

            System.out.print("Grade: ");
            double grade = scanner.nextDouble();

            students[i] = new StudentGrade(name, rollNumber, grade);
        }
        StudentGrade studentWithHighestGrade = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() > studentWithHighestGrade.getGrade()) {
                studentWithHighestGrade = students[i];
            }
        }
        System.out.println("Student with the highest grade:");
        System.out.println("Name: " + studentWithHighestGrade.getName());
        System.out.println("Roll Number: " + studentWithHighestGrade.getRollNumber());
        System.out.println("Grade: " + studentWithHighestGrade.getGrade());

        scanner.close();
        
    }
}
