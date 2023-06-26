package javalab;
import java.util.*;
public class HighestScore {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Student Marks: ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int flag =0;
		for(int i=0; i<n; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		int i =n-1;
		while(i > 0) {
			if(a[i] != a[i-1]){
				if(i < n-1 && a[i] != a[i+1]) {
					flag = 1;
					System.out.println("Highest Marks : "+a[i]);
					break;
				}
				else 
					i--;
			}
			else
				i--;
		}

		if(flag == 0 && a[1] != a[0]) {
			System.out.println(a[0]);
			flag = 1;
		}
		if(flag == 0) {
			System.out.println("-1");
		}
	}
}
