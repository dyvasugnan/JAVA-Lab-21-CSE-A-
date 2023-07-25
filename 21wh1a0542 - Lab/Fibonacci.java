package javaprograms;


	import java.util.Scanner;

	public class FibonacciSeries {
	    public static void printFibonacciSeries(int n) {
	        if (n <= 0) {
	            System.out.println(-1);
	            return;
	        }

	        int first = 0;
	        int second = 1;
	        System.out.print(first + " " + second + " ");

	        for (int i = 3; i <= n; i++) {
	            int next = first + second;
	            System.out.print(next + " ");
	            first = second;
	            second = next;
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read input
	        int n = scanner.nextInt();

	        // Print Fibonacci series
	        printFibonacciSeries(n);

	        scanner.close();
	    }
	}

