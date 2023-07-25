package javalab;
import java.util.Scanner;

public class GapfulNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int inputNumber = scanner.nextInt();
        int lastDigit = 0, firstDigit = 0, temp = inputNumber;

        lastDigit = inputNumber % 10;
        while (inputNumber > 0) {
            firstDigit = inputNumber % 10;
            inputNumber = inputNumber / 10;
        }

        int firstAndLastDigits = (firstDigit * 10) + lastDigit;
        System.out.println("First and last digits are: " + firstAndLastDigits);

        if (temp % firstAndLastDigits == 0)
            System.out.print("Gapful number");
        else
            System.out.print("Not a Gapful number");

    }
}
