package javalab;
import java.util.*;
public class Sample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		System.out.print("Enter elements : ");
		int a[] = new int [n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int i,count=1;
		for(i=1;i<n;i++) {
			if(a[i] != a[i-1])
				count++;
			if(count >= n/2)
				break;
		}
		System.out.println("No. of Laddus : "+count);
 	}
}
