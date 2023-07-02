package javalab.day19062023;
import java.util.*;
public class AdgDupChar {
	  public static String dupliRemove(String s) {
	        if (s.length() < 2) {
	            return s;
	        }
	        if (s.charAt(0) == s.charAt(1)) {
	            return dupliRemove(s.substring(1));
	        } else {
	            return s.charAt(0) + dupliRemove(s.substring(1));
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();
	        System.out.println(dupliRemove(s));
	    }
}
