package javalab;
import java.util.Scanner;  
public class Area1{
       public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
       double radius= sc.nextDouble();
       double perimeter;
       double area;
       
       perimeter = 2 * Math.PI * radius;
       area = Math.PI * radius *radius;
       
       System.out.println(perimeter);
       System.out.println(area);
       }
}
       
       
       
