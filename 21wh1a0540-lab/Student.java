package javalab.day19062023;
import java.util.*;
public class Student {
	public static void main(String args[]) {
		int n,k=0;
		System.out.print("Enter the number of students");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		int i,j,count=1;
		System.out.print("Enter the marks of each student : ");
		for(i = 0 ;i<n;i++)
		a[i] = sc.nextInt();
		int max;
		int eq = a[0];
		int uni[] = new int[n];
		for(i = 0;i<n;i++){
		count = 0;
		for(j = 0;j<n;j++) {
		if(a[i]==a[j])
		count ++;
		}
		uni[k] = count;
		k++;
		}
		max = 0;
		for(i = 0;i<n;i++){
		if(uni[i]==1) {
		if(a[i] >max)
		max = a[i];
		} }
		if(max==0)
		System.out.print(-1);
		else
		System.out.println(max);

		}

}
