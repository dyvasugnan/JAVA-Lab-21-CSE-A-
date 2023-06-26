package javaprograms;

import java.util.Scanner;

public class PensionAllotment {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of test matches played: ");
	        int numTestMatches = scanner.nextInt();

	        System.out.print("Enter the number of ODI matches played: ");
	        int numODIMatches = scanner.nextInt();

	        System.out.print("Has the player played for India? (yes/no): ");
	        String playedForIndia = scanner.next().toLowerCase();

	        System.out.print("Has the player played in IPL? (yes/no): ");
	        String playedIPL = scanner.next().toLowerCase();

	        System.out.print("Enter the number of 'Man of the Match' awards: ");
	        int numManOfTheMatchAwards = scanner.nextInt();

	        int pensionAmount = 0;

	        if (numTestMatches > 10 && numODIMatches > 100) {
	            pensionAmount += 50000;
	        } else if (numTestMatches > 10) {
	            pensionAmount += 25000;
	        } else if (numODIMatches > 100) {
	            pensionAmount += 15000;
	        }

	        if (playedForIndia.equals("yes")) {
	            pensionAmount += 10000;
	        } else if (playedIPL.equals("yes")) {
	            pensionAmount += 8000;
	        } else {
	            pensionAmount += 7000;
	        }

	        pensionAmount += numManOfTheMatchAwards * (pensionAmount / 4);

	        System.out.println("Pension Amount: Rs." + pensionAmount);

	        scanner.close();
	    }
	}

