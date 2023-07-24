import java.util.Scanner;

public class UltimateSquare {
    public static void solve(long n) {
        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println((n + 1) / 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            solve(n);
        }
    }
}
