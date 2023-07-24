import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                sum += a[j];
                if (a[j] > max) {
                    max = a[j];
                }
            }
            double result = max + (double) (sum - max) / (n - 1);
            System.out.println(result);
        }
    }
}
