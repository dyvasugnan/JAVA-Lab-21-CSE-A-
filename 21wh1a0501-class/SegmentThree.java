import java.util.Scanner;

public class SegmentThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int result = Integer.MAX_VALUE;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr[i] %= 3;
            }

            int[][] pattern = {
                    {1, 1, 1}, {2, 2, 2}, {0, 0, 0},
                    {0, 1, 2}, {0, 2, 1}, {1, 0, 2},
                    {1, 2, 0}, {2, 0, 1}, {2, 1, 0}
            };

            for (int ind = 0; ind < 9; ind++) {
                int count = 0;
                for (int i = 0; i < n; i++) {
                    count += (3 + pattern[ind][i % 3] - arr[i]) % 3;
                }
                result = Math.min(count, result);
            }
            System.out.println(result);
        }
    }
}
