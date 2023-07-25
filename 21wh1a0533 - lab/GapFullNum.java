package javaclass;
import java.util.*;

public class GapFullNum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int lastDigit = 0, firstDigit = 0, temp = number;

        lastDigit = number % 10;
        while (number > 0) {
            firstDigit = number % 10;
            number = number / 10;
        }

        int ans = (firstDigit * 10) + lastDigit;
        System.out.println("First and last number are : " + ans);

        if (temp % ans == 0) 
            System.out.print("Gapful number");
        else 
            System.out.print("Not a Gapful number");
        
    }
}



