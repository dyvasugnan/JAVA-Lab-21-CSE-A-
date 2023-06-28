import java.util.Scanner;

class Student{
    String name;
    int id;
    double marks;
    Student(String name,int id,double marks){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

}

public class HighestGrade {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student details");
            String name = sc.next();
            int id = sc.nextInt();
            double marks = sc.nextDouble();
            
            s[i] = new Student(name, id, marks);
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
        System.out.println("Student with the highest grade");
        System.out.println("Name: " + s[maxIndex].name);
        System.out.println("Roll Number: " + s[maxIndex].id);
        System.out.println("Grade: " + s[maxIndex].marks);
    }

    }
