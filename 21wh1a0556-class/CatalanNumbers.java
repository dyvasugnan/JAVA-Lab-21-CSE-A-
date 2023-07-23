import java.util.*;
public class CatalanNumbers {
   public static long fact(int i) {
      if(i <= 1) {
         return 1;
      }
      return i * fact(i - 1);
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      int num = sc.nextInt();
      for(int i = 0; i<=num; i++) {
         long Cn = (fact(2*i))/(fact(i+1)*fact(i));
         System.out.println("C"+i+": "+Cn);
      }
   }
}
