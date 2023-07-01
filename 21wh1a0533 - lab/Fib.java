package javaclass;
import java.util.Scanner;

public class Fib{
    public static int fibonacci (int num) {
         if (num <= 0) 
             return 0;
         if (num == 1 || num == 2) 
             return 1;
         return fibonacci(num - 1) + fibonacci(num - 2);
}
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner (System. in);
          int n = scanner. nextInt();
          if (n <= 0)
                System.out.println(-1);
          else{
                 for (int i = 0; i < n; i++)
                     System.out.print (fibonacci(i) + " ");
           }
    }
}
