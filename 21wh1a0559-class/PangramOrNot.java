import java.util.*;

public class PangramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        Set<Character> uniqueCharacters = new HashSet<>();
        
        for (char ch : S.toCharArray()) {
            char lowerCh = Character.toLowerCase(ch);
            if (lowerCh >= 'a' && lowerCh <= 'z') {
                uniqueCharacters.add(lowerCh);
            }
        }
        
        if (uniqueCharacters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
