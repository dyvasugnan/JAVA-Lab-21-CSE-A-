package javalab;
import java.util.*;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int digitSum = 0;
        int digitProduct = 1;

        if (number < 0) {
            System.out.println("-1");
        } else {
            while (number > 0) {
                int digit = number % 10;
                digitSum += digit;
                digitProduct *= digit;
                number /= 10;
            }

            if (digitSum == digitProduct) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
