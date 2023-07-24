import java.util.HashMap;
import java.util.Scanner;

public class ChristmasSpruce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] c = new int[n];
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 1; i < n; i++) {
            p[i] = scanner.nextInt() - 1;
            mp.put(p[i], mp.getOrDefault(p[i], 0) + 1);
        }
        
        for (int i = 0; i < n; i++) {
            if (mp.getOrDefault(i, 0) == 0) {
                c[p[i]]++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (mp.getOrDefault(i, 0) > 0 && c[i] < 3) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
