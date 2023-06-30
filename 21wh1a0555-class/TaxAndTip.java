package hello;
import java.lang.*;
import java.util.*;
import java.io.*;
public class TaxAndTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int cost_of_meal;
        cost_of_meal = sc.nextInt();
        double tax_and_tip = 0.18*cost_of_meal+0.05*cost_of_meal;
        double Grand_total = cost_of_meal+tax_and_tip;
        System.out.format("%.2f",Grand_total);

	}

}
