package javaclss;
import java.util.*;
public class StringMerge {
	public static String mergeStrings(String s1, String s2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            mergedString.append(s1.charAt(i)).append(s2.charAt(j));
            i++;
            j++;
        }

        mergedString.append(s1.substring(i)).append(s2.substring(j));

        return mergedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        String merged = mergeStrings(s1, s2);
        System.out.println("Merged string: " + merged);

        scanner.close();
    }
}

