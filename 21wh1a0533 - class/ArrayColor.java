import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                s += a[i];
            }
            if (s % 2 == 0 && secondLargest(a) <= s / 2) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static int secondLargest(int[] a) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int x : a) {
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest) {
                secondLargest = x;
            }
        }
        return secondLargest;
    }
}
