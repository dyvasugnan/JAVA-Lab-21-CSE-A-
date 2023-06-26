package javalab;
import java.util.*;
public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a1 = 0, a2 = 1, a3;
		System.out.print(a1 + " " + a2 + " ");
		for(int i=1; i<n; i++) {
			a3 = a1 + a2;
			System.out.print(a3 + " ");
			a1 = a2;
			a2 = a3;
		}
	}
}
