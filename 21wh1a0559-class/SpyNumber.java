import java.util.*;
import java.lang.*;
class SpyNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0,product = 1;
        while(n>0){
            sum += n%10;
            product *= n%10;
            n /= 10;
        }
        if(sum == product)
            System.out.println("True");
        else if(n<0)
            System.out.println("-1");
        else
            System.out.println("False");
   }
}
