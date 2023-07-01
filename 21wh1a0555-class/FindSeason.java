package hello;
import java.lang.*;
import java.util.*;

public class FindSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String mnth = sc.next();
        int day = sc.nextInt();
        if((mnth.equals("march") && day>=20) || (mnth.equals("april")) ||(mnth.equals("may")) ||(mnth.equals("june") && day<21)){
            System.out.print("spring");
        }
        else if((mnth.equals("june") && day>=21) || (mnth.equals("july")) ||(mnth.equals("august")) || (mnth.equals("september") && day<22)){
            System.out.print("summer");
        }
        else if((mnth.equals("september") && day>=22) || (mnth.equals("october")) || (mnth.equals("november"))||(mnth.equals("december") && day<21)){
            System.out.print("fall");
        }
        else{
            System.out.print("winter");
        }
	}
}