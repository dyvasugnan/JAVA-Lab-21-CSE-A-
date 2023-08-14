import java.util.*;
import java.lang.*;
public class BubbleSort {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n value:");
	int n = sc.nextInt();
	System.out.println("Enter the elements into array: ");
	int a[] = new int[n];
	int i;
	for(i =0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int s=0;
	for(i =0;i<n-1;i++) {
		for(int j =0;j<n-i-1;j++) {
			if(a[j]<a[j+1]) {
				s+=1;
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(i =0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("No.of swaps = "+s);
}
	
}
