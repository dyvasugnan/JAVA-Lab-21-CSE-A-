package clss;
import java.util.Scanner;
public class SpyNumber {
	public static boolean isSpyNumber(int number) {
        if (number < 0) {
            return false;
        }
        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }

        return sumOfDigits == productOfDigits;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isSpy = isSpyNumber(number);
        System.out.println(isSpy);

        scanner.close();
    }
}
