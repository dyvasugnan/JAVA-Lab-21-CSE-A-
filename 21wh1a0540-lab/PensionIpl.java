package javalab.day12062023;
import java.util.*;
public class PensionIpl {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 1->testmatches,2->odis,3->man of the match,4->for ind,5->for ipl");
	        int testMatches = sc.nextInt();
	        int ODIs = sc.nextInt();
	        int manOfTheMatch = sc.nextInt();
	        int india = sc.nextInt();
	        int IPL = sc.nextInt();
	        int pension = 0;
	        if (testMatches > 10 && ODIs > 100) {
	            pension = 50000;
	        } else if (testMatches > 10) {
	            pension = 25000;
	        } else if (ODIs > 100) {
	            pension = 15000;
	        } else if (india == 1) {
	            pension = 10000;
	        } else if (india == 0 && IPL == 1) {
	            pension = 8000;
	        } else if (india == 0 && IPL == 0) {
	            pension = 7000;
	        }
	        if (manOfTheMatch > 0) {
	            pension = pension + (manOfTheMatch * 2500);
	        }
	        System.out.println(pension);
	    }

}
