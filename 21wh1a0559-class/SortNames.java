import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < students; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        Collections.sort(names, Collections.reverseOrder());

        for (String x : names) {
            System.out.println(x);
        }
    }
}
