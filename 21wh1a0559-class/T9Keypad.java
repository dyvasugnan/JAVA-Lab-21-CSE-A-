import java.util.Scanner;

public class T9Keypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int result = t9Keypad(s);
            System.out.println(result);
        }
    }

    public static int t9Keypad(String s) {
        int count = 0;
        int[] index = {
            1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1
        };

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                count += 1;
            } else {
                int ind = c - 'a';
                count += index[ind];
            }
        }

        return count;
    }
}
