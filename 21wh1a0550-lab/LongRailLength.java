package javalab;
import java.util.Arrays;
import java.util.Scanner;
public class LongRailLength {
	public static int findLongestRail(int N, int[] compartments) {
        Arrays.sort(compartments);
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < N; i++) {
            if (compartments[i] == compartments[i - 1] + 1) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

         maxLength = Math.max(maxLength, currentLength);

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] compartments = new int[N];
        for (int i = 0; i < N; i++) {
            compartments[i] = sc.nextInt();
        }

        int result = findLongestRail(N, compartments);
        System.out.println(result);
    }
}

