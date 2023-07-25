//Automorphic number
import java.util.*;
class AutomorphicNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long n1 = n * n;
        long temp = n;
        long rem;
        long count=0;
        while(n!=0){
            rem = n % 10;
            count++;
            n = n/10;
        }
        long n2 = n1 % (long)Math.pow(10,count);
        if(n2==temp)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not a Automorphic Number");
    }
}