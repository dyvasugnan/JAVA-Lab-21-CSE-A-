import java.util.Scanner;
import java.util.Arrays;

public class Removesmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            boolean ok = true;
            for (int i = 1; i < n; i++) {
                ok &= (a[i] - a[i - 1] <= 1);
            }
            if (ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}