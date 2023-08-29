package Javaclss;
import java.util.*;
class Student {
    private String name;
    private double score;
    public Student(String n, double s) {
        this.name = n;
        this.score = s;
    }
    public String getName() {
        return name;
    }
    public double getScore() {
        return score;
    }
}
public class StudentAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            String name = sc.next();
            System.out.print("Enter student " + (i + 1) + " score: ");
            double score = sc.nextDouble();
            students.add(new Student(name, score));
        }
        double ts = 0;
        for (Student student : students) {
            ts += student.getScore();
        }
        double as = ts / numStudents;
        System.out.println("Average score: " + as);
        System.out.println("Students with scores above average:");
        for (Student student : students) {
            if (student.getScore() > as) {
                System.out.println(student.getName() + " - " + student.getScore());
            }
        }
    }
}
