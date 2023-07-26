import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] elements = new int[n];

            for (int i = 0; i < n; i++) {
                elements[i] = sc.nextInt();
            }

            Arrays.sort(elements);

            if (isPossibleToServe(elements, d)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isPossibleToServe(int[] elements, int d) {
        int largestElement = elements[elements.length - 1];
        int sumOfTwoSmallest = elements[0] + elements[1];

        return (largestElement <= d || sumOfTwoSmallest <= d);
    }
}
