package javaclasswork;
import java.util.Scanner;

public class TopperMarks {
	    public static int findTopperMark(int N, int[] marks) {
	        int maxMark = 0;
	        for (int mark : marks) {
	            maxMark = Math.max(maxMark, mark);
	        }
	        int[] markCounts = new int[maxMark + 1];
	        for (int mark : marks) {
	            markCounts[mark]++;
	        }
	        int minCount = Integer.MAX_VALUE;
	        for (int count : markCounts) {
	            if (count > 0) {
	                minCount = Math.min(minCount, count);
	            }
	        }
	        int qualifiedCount = 0;
	        for (int count : markCounts) {
	            if (count > minCount) {
	                qualifiedCount += count;
	            }
	        }

	        if (qualifiedCount == 0) {
	            return -1;
	        }

	        int topperMark = maxMark;
	        while (markCounts[topperMark] <= minCount) {
	            topperMark--;
	        }

	        return topperMark;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int[] marks = new int[N];
	        for (int i = 0; i < N; i++) {
	            marks[i] = scanner.nextInt();
	        }

	        int result = findTopperMark(N, marks);
	        System.out.println(result);
	    }
}
