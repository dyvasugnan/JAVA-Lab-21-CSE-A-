package java21541;
import java.util.Scanner;
public class GapfulNum {
    // Function to check if a number is Gapful
    public static boolean isGapful(int number) {
        String strNumber = Integer.toString(number);
        if (strNumber.length() < 3) {
            return false;
        }
        
        String firstDigit = strNumber.substring(0, 1);
        String lastDigit = strNumber.substring(strNumber.length() - 1);
        String combinedDigits = firstDigit + lastDigit;
        int divisor = Integer.parseInt(combinedDigits);
        
        return number % divisor == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isGapful(number)) {
            System.out.println(number + " is a Gapful number.");
        } else {
            System.out.println(number + " is not a Gapful number.");
        }
    }
}
