package javalab.day12062023;
import java.util.*;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        if (n < 0) {
            System.out.println("-1");
        } else {
            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem;
                product = product * rem;
                n = n / 10;
            }
            if (sum == product) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
}
}
