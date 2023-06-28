//Spy Number
import java.util.*;
class SpyNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rem;
        long sum=0;
        long product=1;
        if(n<0)
        System.out.println(-1);
        else{
        while(n!=0){
            rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n/10;
        }
        if(sum==product)
        System.out.println("Spy Number");
        else
        System.out.println("Not a Spy Number");
    }}
}
