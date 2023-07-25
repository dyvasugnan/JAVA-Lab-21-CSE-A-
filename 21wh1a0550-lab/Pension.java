package javalab;
import java.util.Scanner;
public class Pension {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of test matches played: ");
	        int testMatches = sc.nextInt();

	        System.out.print("Enter the number of ODI matches played: ");
	        int ODIMatches = sc.nextInt();

	        System.out.print("Has the player played for India? (true/false): ");
	        boolean playedForIndia = sc.nextBoolean();

	        System.out.print("Has the player played in IPL? (true/false): ");
	        boolean playedIPL = sc.nextBoolean();

	        System.out.print("Enter the number of Man of the Match awards: ");
	        int manOfTheMatchAwards = sc.nextInt();

	        int pensionAmount = 0;

	        if (testMatches > 10 && ODIMatches > 100) {
	            pensionAmount = 50000;
	        } else if (testMatches > 10) {
	            pensionAmount = 25000;
	        } else if (ODIMatches > 100) {
	            pensionAmount = 15000;
	        } else if (playedForIndia) {
	            pensionAmount = 10000;
	        } else if (playedIPL) {
	            pensionAmount = 8000;
	        } else {
	            pensionAmount = 7000;
	        }

	        pensionAmount += (manOfTheMatchAwards * 0.25 * pensionAmount);

	        System.out.println("Pension amount: Rs. " + pensionAmount);
	    }
	}
	
