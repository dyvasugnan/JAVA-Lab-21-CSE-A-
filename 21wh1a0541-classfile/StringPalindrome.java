package java21541;
import java.util.*;
class StringPalindrome {
   public static boolean isPalindrome(String input) {
       int start = 0;
       int end = input.length() - 1;
       
       while (start < end) {
           if (input.charAt(start) != input.charAt(end)) {
               return false;
           }
           
           start++;
           end--;
       }
       return true;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (isPalindrome(s)) {
           System.out.println("string palindrome.");
       } else {
           System.out.println(" not  palindrome.");
       }
   }
}
