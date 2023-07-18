package javaclass;
import java.util.*;
public class TaxAndTip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int meal = sc.nextInt();
		float totalCost = meal + (meal*0.18f) + (meal*0.05f);
		System.out.print(totalCost);
	}

}
