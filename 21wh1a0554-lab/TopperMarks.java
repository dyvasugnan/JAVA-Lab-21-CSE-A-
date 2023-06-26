package clss;
import java.util.Scanner;
public class TopperMarks {
	public static int findTopperMarks(int[] marks) {
        int maxMarks = -1;

        for (int i = 0; i < marks.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < marks.length; j++) {
                if (i != j && marks[i] == marks[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate && marks[i] > maxMarks) {
                maxMarks = marks[i];
            }
        }

        return maxMarks;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] marks = new int[N];
        for (int i = 0; i < N; i++) {
            marks[i] = scanner.nextInt();
        }
        int topperMarks = findTopperMarks(marks);
        System.out.println(topperMarks);

        scanner.close();
    }
	

}
