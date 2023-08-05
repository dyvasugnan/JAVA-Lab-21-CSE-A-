package javalab;

import java.util.*;
import java.lang.*;

public class Reverse_Number {
  public static void main(String[] args) {
    int num = 12, reversed = 0;
    System.out.println("Original Number: " + num);
    while(num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    System.out.println("Reversed Number: " + reversed);
  }
}