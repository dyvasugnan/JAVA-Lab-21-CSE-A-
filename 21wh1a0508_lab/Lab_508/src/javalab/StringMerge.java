package javalab;

import java.util.Scanner;

public class StringMerge {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder mergedString = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            mergedString.append(s1.charAt(i));
            i++;
            mergedString.append(s2.charAt(j));
            j++;
        }
        if (i < s1.length()) {
            mergedString.append(s1.substring(i));
        }
        if (j < s2.length()) {
            mergedString.append(s2.substring(j));
        }
        System.out.println(mergedString.toString());
    }

}
