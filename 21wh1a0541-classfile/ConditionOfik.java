package java21541;
import java.util.Scanner;
public class ConditionOfik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int k = 0; k <= num; k++) {
                if (i == (k + 1) * k) {
                    System.out.println("i: " + i + ", k: " + k);
                }
            }
        }
    }
}
