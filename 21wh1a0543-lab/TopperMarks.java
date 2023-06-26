package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopperMarks {
	public static int findTopperMark(int N, int[] marks) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int maxFrequency = 0;

        for (int mark : marks) {
            frequency.put(mark, frequency.getOrDefault(mark, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequency.get(mark));
        }

        for (int mark : marks) {
            if (frequency.get(mark) == maxFrequency) {
                return mark;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        int[] marks = new int[N];
        for (int i = 0; i < N; i++) {
            marks[i] = scanner.nextInt();
        }

        // Find the topper mark
        int topperMark = findTopperMark(N, marks);

        // Print the result
        System.out.println(topperMark);

        scanner.close();
    }

}
