package java_codes;
import java.util.*;
public class Cricket {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testMatches = sc.nextInt();
        int ODI = sc.nextInt();
        int manOfTheMatch = sc.nextInt();
        int india = sc.nextInt();
        int IPL = sc.nextInt();
        int pension = 0;
        if(testMatches > 10 && ODI > 100)
        pension = 50000;
        else if(testMatches>10)
        pension = 25000;
        else if(ODI > 100)
        pension = 15000;
        else if(india == 1)
        pension = 10000;
        else if(india == 0 && IPL == 1)
        pension = 7000;
        if(manOfTheMatch > 0)
        pension = pension + (manOfTheMatch * 2500);
        System.out.println(pension);
    }
}
