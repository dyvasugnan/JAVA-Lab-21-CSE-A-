package javaclass;
import java.util.*;
public class SpyNum {
    public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number:");
		        int number = scanner.nextInt();
		        int sum = 0;
		        int product = 1;
		        int remainder;

		        while (number > 0) {
		            remainder = number % 10;
		            number = number / 10;
		            sum = sum + remainder;
		            product = product * remainder;
		        }

		        if (sum == product) 
		            System.out.print("Spy number");
		        else 
		            System.out.print("Not a spy number");
		        
		    }
		}



