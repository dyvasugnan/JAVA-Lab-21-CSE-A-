
import java.util.*;

class SortStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many names ? ");
        int n = sc.nextInt();
        sc.nextLine();

        String names[] = new String[n];
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        
        String temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
        
        System.out.println("The sorted order : ");
        for (String i : names) {
            System.out.println(i);
        }
    }
}
