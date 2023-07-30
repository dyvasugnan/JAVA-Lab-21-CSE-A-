import java.util.*;
public class Pension {
	    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int test_matches = sc.nextInt();
	        int ODI = sc.nextInt();
	        int manOfTheMatch = sc.nextInt();
	        int india = sc.nextInt();
	        int IPL = sc.nextInt();
	        int p = 0;
	        if(test_matches > 10 && ODI > 100)
	        p = 50000;
	        else if(test_matches>10)
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