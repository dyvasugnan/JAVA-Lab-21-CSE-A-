package javalab;
import java.util.*;
public class ArraySum {
	  public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("enter array size : ");
	        int n = sc.nextInt();
	        int arr[] = new int[n],sum=0;
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	            sum = sum+arr[i];
	        }
	        System.out.println("Sum of array elements is : "+sum);
	        System.out.println(arr.length);
	    }
}
