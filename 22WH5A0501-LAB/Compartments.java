package javalab;

import java.util.Scanner;

public class Compartments {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cid[]=new int[n];
		for(int i=0;i<n;i++)
			cid[i]=sc.nextInt();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(cid[j]>cid[j+1]) {
					int temp=cid[j];
					cid[j]=cid[j+1];
					cid[j+1]=temp;
				}
			}
		}
		//int a=cid[0];
		int count=0;
		int highest=0;
		for(int i=0;i<n-1;i++) {
			if(cid[i]==cid[i+1]+1)
				count++;
			else {
				count=0;
				//a=cid[i];
			}
			if(highest>count)
				highest=count;
		}
		System.out.println(highest);
	}
}
