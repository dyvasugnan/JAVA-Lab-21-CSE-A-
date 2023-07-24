import java.util.*;

public class CountCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                arr.add(scanner.nextInt());
            }
            int k = scanner.nextInt();
            int l = 0;
            int ele = Collections.max(arr);
            for (int i = 0; i < 3; i++) {
                l += (ele - arr.get(i));
            }
            if (l <= k && (l - k) % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
