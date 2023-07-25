package javaclass;

import java.util.*;

public class CricketPension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("No of test matches played:");
        int numTestMatches = scanner.nextInt();
        System.out.println("No of ODIs played:");
        int numODIs = scanner.nextInt();
        System.out.println("Man of the matches:");
        int numManOfTheMatch = scanner.nextInt();
        System.out.println("Player played for India? ");
        int playedForIndia = scanner.nextInt();
        System.out.println("Player played for IPL?");
        int playedForIPL = scanner.nextInt();
        int pension = 0;
        if (numTestMatches > 10 && numODIs > 100) 
            pension = 50000;
        else if (numTestMatches > 10) 
            pension = 25000;
        else if (numODIs > 100) 
            pension = 15000;
        else if (playedForIndia == 1) 
            pension = 10000;
        else if (playedForIndia == 0 && playedForIPL == 1)
            pension = 8000;
        else if (playedForIndia == 0 && playedForIPL == 0) 
            pension = 7000;
        if (numManOfTheMatch > 0) 
            pension += (numManOfTheMatch * 2500);
        
        System.out.println("Pension:" + pension);
    }
}
