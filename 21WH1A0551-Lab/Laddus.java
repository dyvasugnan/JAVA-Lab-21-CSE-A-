package javalab;
import java.util.*;
public class Laddus {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.print("Enter laddus : ");
		int a[] = new int [n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		int count=1;
		for(int i=1;i<n;i++) {
			if(a[i] != a[i-1])
				count++;
			if(count >= n/2)
				break;
		}
		System.out.println("Number of Laddus : "+count);

	}

}
