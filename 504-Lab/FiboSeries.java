package moulikaLab;

import java.util.*;

public class FiboSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int f0 = 0;
		int f1=1;
		int f2;
		if(n>=1) {
			System.out.print(f0);
		}
		if(n>=2) {
			System.out.print("," + f1);
		}
		for(int i=3; i<=n; i++) {
			f2 = f0+f1;
			System.out.print("," + f2);
			f0=f1;
			f1=f2;
			
		}
	}

}
