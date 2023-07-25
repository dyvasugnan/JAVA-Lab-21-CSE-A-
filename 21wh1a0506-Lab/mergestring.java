package javalab.day12062023;
import java.util.*;

public class StringMerge {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string s1:");
        String str1 = scanner.nextLine();
        System.out.println("Enter string s2:");
        String str2 = scanner.nextLine();
        StringBuilder mergedString = new StringBuilder();
        int i = 0;
        int j = 0;
        
        while (i < str1.length() && j < str2.length()) {
            mergedString.append(str1.charAt(i));
            i++;
            mergedString.append(str2.charAt(j));
            j++;
        }
        
        if (i < str1.length()) {
            mergedString.append(str1.substring(i));
        }
        
        if (j < str2.length()) {
            mergedString.append(str2.substring(j));
        }
        
        System.out.println(mergedString.toString());
    }
}
