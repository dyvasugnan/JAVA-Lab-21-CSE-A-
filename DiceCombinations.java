import java.util.Scanner;

public class DiceCombinations {
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (j > i) {
                    break;
                }
                dp[i] = (dp[i] + dp[i - j]) % MOD;
            }
        }

        System.out.println(dp[n]);
    }
}
