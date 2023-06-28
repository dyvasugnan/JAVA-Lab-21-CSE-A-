//Gapfull Number
import java.util.*;
class Gapfull{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = n;
        long count=0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        if(count>=3){
            long n1 = n % (long)Math.pow(10,1);
            long n2 = n % (long)Math.pow(10,(count-1));
            long n3 = (n2*10)+n1;
            if(n%n3==0)
            System.out.println("Gapfull Number");
            else
            System.out.println("Not a Gapfull Number");
        }
        else
        System.out.println("Not a Gapfull Number");
    }
}