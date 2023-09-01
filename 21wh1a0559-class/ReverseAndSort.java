import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseAndSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> lst = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] s = scanner.nextLine().split("\\.");
            StringBuilder reversed = new StringBuilder();
            for (int j = s.length - 1; j >= 0; j--) {
                reversed.append(s[j]);
                if (j > 0)
                    reversed.append(".");
            }
            lst.add(reversed.toString());
        }
        Collections.sort(lst);
        for (String x : lst)
            System.out.println(x);
    }
}
