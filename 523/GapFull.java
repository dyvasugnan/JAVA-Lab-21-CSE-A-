package javaclss;
import java.util.Scanner;
public class GapFull {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int a=0,t=n;
		while(t > 0){
		a = t;
		t = t/10;
		}
		int b = n%10;
		int x = a*10+b;
		if(n % x == 0)
		System.out.println("Gapfull number");
		else
		System.out.println("Not a Gapful number");
		}
	}
