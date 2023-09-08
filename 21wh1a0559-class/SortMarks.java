import java.util.*;

public class SortMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < students; i++) {
            int num = sc.nextInt();
            marks.add(num);
        }

        Collections.sort(marks, Collections.reverseOrder());

        for (int x : marks) {
            System.out.println(x);
        }
    }
}
