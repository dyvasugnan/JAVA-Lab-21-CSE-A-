package classnotes_programs;

import java.util.Scanner;

class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, facto = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=2; i <=n; i++) {
			facto = facto * i;
		}
		System.out.print(facto);
		

	}

}
