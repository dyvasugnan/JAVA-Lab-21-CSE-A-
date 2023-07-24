import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    reverseStr = "";
    int len = str.length();
    for (int i = (len - 1); i >=0; i--) {
     reverseStr = reverseStr + str.charAt(i);
    }

    if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println( "Palindrome String.");
    }
    else {
      System.out.println("not a Palindrome String.");
    }
  }
}