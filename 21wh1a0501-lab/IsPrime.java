package javalab;
import java.util.*;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int flag = 0, i;
		if(n <= 2) {
			System.out.println("YES");
		}
		else
		for(i = 2; i * i < n; i++) {
			if(n % i == 0) {
				flag = 1;
				break;
			}
		}
	if(flag == 1)	
	{
		System.out.println("NO");
	}
	else {
		System.out.println("YES");
	}

}
}
