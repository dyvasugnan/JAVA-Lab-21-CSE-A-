import java.util.*;
public class Main {
    static String Key(String S, int K) {
        StringBuilder str = new StringBuilder();
        int flag = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) != '-') {
                str.append(Character.toUpperCase(S.charAt(i)));
                flag++;
                if (flag == K && i > 0) {
                    str.append('-');
                    flag = 0;
                }
            }
        }
        return str.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            int K = sc.nextInt();
            String res = Key(S, K);
            System.out.println(res);
        }
    }
