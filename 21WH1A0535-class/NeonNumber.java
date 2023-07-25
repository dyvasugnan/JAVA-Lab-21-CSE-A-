//Neon Number
import java.util.*;
class NeonNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n1 = n*n;
        long rem;
        long sum=0;
        while(n1!=0){
            rem = n1%10;
            sum = sum + rem;
            n1 = n1/10;
        }
        if(sum==n)
        System.out.println("Neon Number");
        else
        System.out.println("Not a Neon Number");
    }
}