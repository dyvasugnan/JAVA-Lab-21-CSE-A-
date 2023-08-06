package java_lab;
import java.util.*;
public class Pension {
	public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter no.of Test Matches played: ");
				int a = sc.nextInt();
				System.out.println("Enter no.of ODI's played");
				int b = sc.nextInt();
				System.out.println("If the player played for India enter 1 else 0");
				int c = sc.nextInt();
				System.out.println("If the player played for Ipl enter 1 else 0");
				int d = sc.nextInt();
				int e =0;
				if(a>10 && b>100) {
					e = 50000;
				}
				else if(a>10) {
					e = 25000;
				}
				else if(b>100) {
					e = 15000;
				}
				else if(c==1) {
					e = 10000;
				}
				else if(c==0 && d==1) {
					e = 8000;
				}
				else if(c==0 && d==0) {
					e = 7000;
				}
				System.out.println("Enter the no.of man of matches won: ");
				int f = sc.nextInt();
				for(int i=0; i<f; i++) {
					e+=e/4;
				}
				System.out.println("Pension of cricter is "+e);
	}

}
