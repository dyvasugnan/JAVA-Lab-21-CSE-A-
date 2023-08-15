package javalab;
import java.util.*;

public class ChatLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "hello";
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == t.charAt(i)) {
                i++;
                if (i == t.length()) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}
