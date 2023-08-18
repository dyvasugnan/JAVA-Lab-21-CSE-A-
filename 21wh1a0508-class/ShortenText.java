import java.util.*;
public class Main {
    static String sms(String s) {
        s = s.replace(".", "").replace(",", "").replace("?", "").replace("!", "").toLowerCase();
        s = s.replace("and", "&").replace("ate", "8").replace("at", "@").replace("you", "U");
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < T; i++) {
            String test = sc.nextLine();
            String text = sms(test);
            System.out.println(text);
        }
    }
}
