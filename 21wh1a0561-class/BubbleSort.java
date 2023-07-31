package javalab;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		 int n,i,j;
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter array size : ");
	     n = sc.nextInt();
	     int arr[] = new int[n];
	     System.out.println("Enter array elements");
	     for(i=0;i<n;i++)
	        arr[i] = sc.nextInt();
	        System.out.print("Before sorting array is ");
	      for (i=0;i<n;i++){
	         System.out.print(i+"  ");
	      }
	        for(i=0;i<n;i++){
	            for(j=0;j<n-1;j++){
	                if(arr[j] > arr[i]){
	                    int t = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = t;
	                }
	            }
	        }
	        System.out.print("\nAfter sorting array is : ");
	        for(i=0;i<n;i++){
	            System.out.print(arr[i]+"  ");
	        }
	}
}
	


