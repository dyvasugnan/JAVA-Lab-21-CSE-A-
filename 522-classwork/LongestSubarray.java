import java.util.*;
public class LongestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxLength =maxx(arr);
            System.out.println(maxLength);
        }
    }
    private static int maxx(int[]a) {
        int maxLen = 0;
        int preSum = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, -1);
        for (int i = 0; i < a.length; i++) {
            preSum += a[i];
            if (prefixSumMap.containsKey(preSum)) {
                maxLen = Math.max(maxLen, i - prefixSumMap.get(preSum));
            } 
            else {
            prefixSumMap.put(preSum, i);
            }
        }
        return maxLen;
    }
}
