package labclass;
import java.util.*;
import java.io.*;
public class MinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int min=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]<a[min]) {
				min=i;
			}
		}
		System.out.print(a[min]);

	}

}
