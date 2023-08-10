package java_lab;
import java.util.*;
public class PrimeNumsRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i==0  || i==1)
				continue;
			int flag=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.println(i);
			}
		}
	}

}
