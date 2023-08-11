package javalab;

import java.util.Scanner;

public class SumOfSquares {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of values: ");
        int n = sc.nextInt();
        
        int sumOfSquares = 0;
        
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sumOfSquares += num * num;
        }
        
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}

