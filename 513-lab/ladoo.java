package javalab;
import java.util.*;

public class ladoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] lado = sc.nextLine().split(",");
		int n = lado.length;
		int maxLaddus = n / 2;
		int[] count = new int[50]; 
		int unique = 0;
		for (String i : lado) {
			int type = Integer.parseInt(i);
			if (count[type] == 0) {
			     unique++;
			}
			    count[type]++;
			}
			if (unique <= maxLaddus) {
			    System.out.println(unique);
			} else {
				System.out.println(maxLaddus);
			}

	}

}
