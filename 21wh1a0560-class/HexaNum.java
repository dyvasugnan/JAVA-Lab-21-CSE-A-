package javaclass;
import java.util.*;
public class HexagonalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = sc.nextInt();
		double hex = 2*Math.pow(n, 2)-n;
		System.out.print("nth hexagonal number : "+hex);
	}

}
