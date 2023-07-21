package javaclss;
import java.util.*;
public class BottleDeposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,k;
		double total;
		n=sc.nextInt();
		k=sc.nextInt();
		total=n*0.10+k*0.25;
		System.out.print(total);
	}

}
