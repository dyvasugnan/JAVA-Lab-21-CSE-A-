package javalab;
import java.util.HashMap;
import java.util.Map;

public class PairsWithSum {
    public static void findPairsWithSum(int[] arr, int targetSum) {
        Map<Integer, Integer> ht = new HashMap<>();  // Hash map to store elements and their indices
        
        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];
            if (ht.containsKey(complement)) {
                System.out.println("Pair: (" + complement + ", " + arr[i] + ")");
            }
            ht.put(arr[i], i);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 9, 5};
        int targetSum = 9;
        findPairsWithSum(arr, targetSum);
    }
}
