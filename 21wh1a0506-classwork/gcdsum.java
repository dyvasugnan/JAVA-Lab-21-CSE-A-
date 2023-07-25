package javalab;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            while (true) {
                long x = n;
                long sum = 0;
                while (x > 0) {
                    long p = x % 10;
                    sum += p;
                    x /= 10;
                }
                if (gcd(n, sum) > 1) {
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
    }
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
