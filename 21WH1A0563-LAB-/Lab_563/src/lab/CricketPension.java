package lab;
import java.util.*;
public class CricketPension {
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int testMatches = sc.nextInt();
	        int ODI = sc.nextInt();
	        int manOfTheMatch = sc.nextInt();
	        int india = sc.nextInt();
	        int IPL = sc.nextInt();
	        int p = 0;
	        if(testMatches > 10 && ODI > 100)
	        p = 50000;
	        else if(testMatches>10)
	        p = 25000;
	        else if(ODI > 100)
	        p = 15000;
	        else if(india == 1)
	        p = 10000;
	        else if(india == 0 && IPL == 1)
	        p = 7000;
	        if(manOfTheMatch > 0)
	        p += (manOfTheMatch * 2500);
	        System.out.println(p);
	    }
	}
