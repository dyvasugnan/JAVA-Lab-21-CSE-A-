import java.util.*;
import java.math.BigInteger ;
class Factorial{
        static BigInteger factorial(int n){
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=n;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String args[]){
        int n=20;
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
}