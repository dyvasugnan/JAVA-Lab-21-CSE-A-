package javalab;
import java.util.*;
public class Compartments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of compartments: ");
		int n = sc.nextInt();

		int[] comp = new int[n];
		for (int i = 0; i < n; i++) {
			 comp[i] = sc.nextInt();
		}

		Arrays.sort(comp);
		//find max consecutive numbers in the array
		int maxl = 1;
		int currentl = 1;
		for (int i = 1; i < n; i++) {
			if (comp[i] == comp[i - 1] + 1) {
				 currentl++;
			} else {
				    currentl= 1;
			}
				 maxl = Math.max(maxl, currentl);
			}

		System.out.println("Longest rail length formed: "+ maxl);
		sc.close();
	}
}
