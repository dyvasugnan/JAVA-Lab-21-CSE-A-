package javaprograms;
import java.math.BigInteger;
import java.util.Scanner;
public class FactorialOfNumber {
    public static BigInteger factorial(int n) {
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter number:");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
