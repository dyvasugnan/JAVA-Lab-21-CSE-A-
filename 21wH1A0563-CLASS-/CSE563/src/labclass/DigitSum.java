package labclass;
import java.util.*;
import java.io.*;
public class DigitSum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=0,rem;
	while(n>0) {
		rem=n%10;
		s+=rem;
		n=n/10;
	}
	System.out.print(s);
}
}
