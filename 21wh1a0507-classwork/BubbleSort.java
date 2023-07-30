package java_codes;
import java.util.*;
public class BubbleSort {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int z = sc.nextInt();
		int a[]=new int[z];
		System.out.print("Enter "+z+"numbers: ");
		for(int i=0;i<z;i++){
		a[i]=sc.nextInt();
		}
		  //bubble sort
		 
		System.out.println("Array before sorting: ");
		for(int i: a){
		System.out.println(i);
		}
		for(int i=0;i<z-1;i++){
		for(int j=0;j<z-1-i;j++){
		if(a[j]>a[j+1]){
		int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		}
		}
		}
		 
		System.out.println("Array after sorting is: ");
		for(int i:a){
		System.out.println(i);
		}
		}
}
