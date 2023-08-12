package javalab;
import java.util.Scanner;
public class RangeDigitSum {
public static void main(String[] arg) {
	Scanner sc = new Scanner(System.in);
	int a,b,s=0,j;
	a=sc.nextInt();
	b=sc.nextInt();
	for(int i=a;i<=b;i++) {
		j=i;
		while(j>0) {
			s+=j%10;
			j=j/10;
		}
	}
	System.out.print(s);
}
}

