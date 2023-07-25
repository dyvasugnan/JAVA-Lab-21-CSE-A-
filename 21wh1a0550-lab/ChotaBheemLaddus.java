package javalab;
import java.util.*;

public class ChotaBheemLaddus {

    public static int findMaxLaddus(int[] laddus) {
        int maxLaddus = 0;

        for (int i = 0; i < laddus.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (laddus[i] == laddus[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                maxLaddus++;
            }
        }

        return Math.min(maxLaddus, laddus.length / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] ladduStrings = input.split(",");
        int N = ladduStrings.length;
        int[] ladduTypes = new int[N];

        for (int i = 0; i < N; i++) {
            ladduTypes[i] = Integer.parseInt(ladduStrings[i]);
        }

        int result = findMaxLaddus(ladduTypes);
        System.out.println(result);
    }
}
