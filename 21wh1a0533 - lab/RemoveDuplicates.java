package javaclass;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() < 2) {
            System.out.println(s);
        } else {
            char prev = s.charAt(0);
            System.out.print(prev);

            for (int i = 1; i < s.length(); i++) {
                char current = s.charAt(i);
                if (current != prev) {
                    System.out.print(current);
                    prev = current;
                }
            }
        }
    }
}


