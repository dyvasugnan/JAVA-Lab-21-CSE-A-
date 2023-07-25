package javaclass;
import java.util.*;
public class CricketPension {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc = new Scanner(System.in);
        System.out.println("No of test matches played:");
        int testMatches = sc.nextInt();
        System.out.println("No of odis played:");
	    int ODIs = sc.nextInt();
        System.out.println("Man of the matches:");
        int manOfTheMatch = sc.nextInt();
        System.out.println("Player played for India? ");
        int india = sc.nextInt();
        System.out.println("Player played for IPL?");
        int IPL = sc.nextInt();
        int pension = 0;
        if (testMatches > 10 && ODIs > 100) 
            pension = 50000;
        else if (testMatches > 10) 
            pension = 25000;
        else if (ODIs > 100) 
            pension = 15000;
        else if (india == 1) 
            pension = 10000;
        else if (india == 0 && IPL == 1)
            pension = 8000;
        else if (india == 0 && IPL == 0) 
            pension = 7000;
        if (manOfTheMatch > 0) 
            pension = pension + (manOfTheMatch * 2500);
        
        System.out.println("Pension:"+pension);
    }
}
	
