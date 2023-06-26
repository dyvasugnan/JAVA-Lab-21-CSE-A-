package javalab;

import java.util.Scanner;

public class Highmarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		int f[]=new int[n];
		int count=0;
		for(int j=0;j<n;j++) {
			for(int k=0;k<n;k++) {
				if(a[j]==a[k])
					count++;
			}
			f[j]=count;
			count=0;
		}
		int high=0;
		for(int i=0;i<n;i++) {
			if(a[i]>high && f[i]==1)
				high=a[i];
			if(f[i]==1)
				count++;
		}
		if(count!=0)
			System.out.println(high);
		else
			System.out.println(-1);
	}
}
