package labclass;
import java.util.*;
import java.io.*;
public class IsPerfect {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum +=i;	
		}
	}
	if(n==sum) {
		System.out.print("True");
	}
	else
		System.out.print("False");
}
}
