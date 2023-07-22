package labclass;
import java.util.*;
import java.io.*;
public class MaxOfArray {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int max=0;
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		if(a[i]>a[max]) {
			max=i;
		}
	}
	System.out.print(a[max]);
}
}
