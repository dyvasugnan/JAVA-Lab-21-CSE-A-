package cs;

import java.util.*;

public class string_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.println("Enter the size");
		String arr[] = new String[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.next();
		}
		int j=0;
		while(j<n){
		for(int i=0;i<n-j-1;i++){
			if(arr[i].compareTo(arr[i+1])>0){
				String temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
		}
		j++;
		}

		for(String x: arr)
			System.out.println(x);

		
	}
}
