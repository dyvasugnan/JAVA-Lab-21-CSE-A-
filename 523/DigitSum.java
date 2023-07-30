package javalab;
import java.util.Scanner;
public class DigitSum {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int digit,sum=0;
		while(n>0) {
			digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
			System.out.print(sum);
	}
}
