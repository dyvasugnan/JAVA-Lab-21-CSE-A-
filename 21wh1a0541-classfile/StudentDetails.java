package java21541;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StudentDetails {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter name: ");
        String name = br.readLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter marks: ");
        double marks = Double.parseDouble(br.readLine());
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
