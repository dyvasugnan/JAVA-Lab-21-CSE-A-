package javalab;
import java.util.*;

public class Fibonacci_Series {
    public static void main(String args[]) {
        int n, x = 0, y = 1, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = sc.nextInt();
        System.out.print("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            temp = x + y;
            x = y;
            y = temp;
        }
    }
}
