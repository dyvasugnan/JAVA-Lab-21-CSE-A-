package java_lab;
import java.util.*;
public class BubbleSort {
	public static void main(String args[]) {
		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements before Swapping");
		for(int i=0;i<n;i++) {
			System.out.println(" "+a[i]);
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Elements after swapping:");
			for(int i=0;i<n;i++) {
				System.out.println(" "+a[i]);
			}
	}

}
