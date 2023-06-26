package clss;
import java.util.Arrays;
import java.util.Scanner;
public class RailCompartments {
	 public static int findLongestRailLength(int N, int[] compartments) {
	        Arrays.sort(compartments);
	        int maxRailLength = 1;
	        int currentRailLength = 1;

	        for (int i = 1; i < N; i++) {
	            if (compartments[i] == compartments[i - 1] + 1) {
	                currentRailLength++;
	            } else {
	                maxRailLength = Math.max(maxRailLength, currentRailLength);
	                currentRailLength = 1;
	            }
	        }
	        maxRailLength = Math.max(maxRailLength, currentRailLength);
	        return maxRailLength;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int[] compartments = new int[N];
	        for (int i = 0; i < N; i++) {
	            compartments[i] = scanner.nextInt();
	        }

	        int longestRailLength = findLongestRailLength(N, compartments);

	        
	        System.out.println(longestRailLength);

	        scanner.close();
	    }

}
