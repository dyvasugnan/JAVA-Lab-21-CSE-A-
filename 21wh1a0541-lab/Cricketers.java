package java21541;
/*@))).Pension Continuing our journey in mastering the conditional statements &amp; our interest with
cricket.Let us help the Indian cricket&#39;s governing body (BCCI) to automate its plan of
allotting pensions to former players. The rules are given below:
If a player has played more than 10 test matches and 100 ODI&#39;s he receives Rs.50,000.
If a player has played more than 10 test matches, he receives Rs.25,000.
If a player has played more than 100 ODI&#39;s he receives Rs.15,000.
If a player has played for India, he receives Rs.10,000.
The amount is incremented by 1/4th for every &#39;man of the match&#39; award.
If a player has not played for India but played IPL, he receives an amount of Rs.8,000.
If a player has not played for India nor IPL, he receives an amount of Rs.7,000.*/
import java.util.Scanner;
public class Cricketers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Has the player played for India? (yes/no): ");
        String playedForIndia = scanner.nextLine();
        System.out.print("Has the player played in IPL? (yes/no): ");
        String playedIPL = scanner.nextLine();
        System.out.print("Enter the number of Test matches played: ");
        int numTestMatches = scanner.nextInt();
        System.out.print("Enter the number of ODI matches played: ");
        int numODIMatches = scanner.nextInt();
        System.out.print("Enter the number of 'Man of the Match' awards received: ");
        int numManOfTheMatchAwards = scanner.nextInt();
        int pensionAmount = 0;
        if (playedForIndia.equalsIgnoreCase("yes")) {
            pensionAmount += 10000;
        } 
        else if (playedIPL.equalsIgnoreCase("yes")) {
            pensionAmount += 8000;
        } 
        else {
            pensionAmount += 7000;
        }

        if (numTestMatches > 10) {
            pensionAmount += 25000;
        }

        if (numODIMatches > 100) {
            pensionAmount += 15000;
        }

        if (numTestMatches > 10 && numODIMatches > 100) {
            pensionAmount += 50000;
        }
        pensionAmount += (numManOfTheMatchAwards * (pensionAmount / 4));
        System.out.println("Pension amount: Rs." + pensionAmount);
    }
}