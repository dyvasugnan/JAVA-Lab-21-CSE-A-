package java_codes;
import java.util.*;
public class Student {
	 public static void main(String args[]){
		    
		    Scanner sc = new Scanner(System.in);
		        System.out.println("Enter your name: ");
		        String name = sc.nextLine();
		        
		        System.out.println("Enter age: ");
		        int age = sc.nextInt();

		        System.out.println("Enter Gender: ");
		        char gen = sc.next().charAt(0);

		        System.out.println("Enter marks: ");
		        int mark = sc.nextInt();

		        System.out.println(" Name: " + name);
		        System.out.println(" Age: "+ age);
		        System.out.println(" Gender: "+ gen);
		        System.out.println(" Marks: "+ mark);
		    }
}
