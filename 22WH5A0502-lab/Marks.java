package javalab;

import java.util.Scanner;

public class Marks {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int temp[] = new int[n];
		for(int i=1;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<n;i++) {
		for(int j=1;j<n;j++) {
			if(a[i] == a[j]) {
		       count++;
			}
			temp[i] = count;
			count =0;


		}   
		int large =0;
			for(int j=0;j<temp.length;j++) {
			if(large <a[j] &&  temp[j] == 1) {
			   large = a[j];
			if(temp[j] == 1)   
				count++;
			if(count>0) {
			    System.out.println(-1);
			}
			}
			}
		}
	}
