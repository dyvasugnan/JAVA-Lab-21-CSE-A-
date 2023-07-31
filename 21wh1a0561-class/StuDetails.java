package javalab;
import java.io.*;
public class StuDetails {
	 public static void main(String args[])throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter student name : ");
	        String name = br.readLine();
	        System.out.print("Enter age : ");
	        String sage = br.readLine();
	        System.out.print("Enter gender : ");
	        char gen = br.readLine().charAt(0);
	        System.out.print("Enter marks : ");
	        String smarks = br.readLine();
	        System.out.print("Enter CGPA : ");
	        String scgpa = br.readLine();
	        int age = Integer.parseInt(sage);
	        int marks=Integer.parseInt(smarks);
	        float cgpa = Float.parseFloat(scgpa);
	        System.out.print("Student name : "+name+"\nAge : "+age+"\nGender : "+gen+"\nMarks : "+marks+"\nCGPA : "+cgpa);
	        }
}
