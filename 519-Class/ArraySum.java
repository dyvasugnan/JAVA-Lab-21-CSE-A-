package java_codes;
import java.util.*;

public class ArraySum {
	 public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("enter value of n ");
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        int sum=0;
	        System.out.print("enter the array elements ");
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	            sum+= a[i];
	        }
	        System.out.println("sum of array elements is " + sum);
	    }
}
