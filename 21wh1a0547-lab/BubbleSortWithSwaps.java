package java_lab;
import java.util.*;
public class BubbleSortWithSwaps {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements to be entered:");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++){
	   a[i] = sc.nextInt();
	}
	int count = 0;
	for(int i=0;i<n-1;i++){
	   for(int j=0;j<n-i-1;j++){
	       if(a[j]>a[j+1]){
	           count += 1;
	           int temp = a[j];
	           a[j] = a[j+1];
	           a[j+1] = temp;
	       }
	   }
	}
	System.out.println("No.of swaps : " +count);
	for(int i=0;i<n;i++){
	   System.out.print(a[i]+ " ");
	}
	}
	}


