package javalab;
import java.util.*;

public class Palindrome {
	public static void main(String args[]) {
	
    int num = 3773  , reversedNum = 0, remainder;
    int originalNum = num;
    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}
	