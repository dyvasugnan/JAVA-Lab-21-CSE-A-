import java.io.*;
import java.util.*;
public class CrossPattern {
    public static void Pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j || i + j == N - 1) {
                    System.out.print("X");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            Pattern(N);
        }

        scanner.close();
    }
}
