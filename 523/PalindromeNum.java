package javaclss;
import java.util.*;
public class PalindromeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,temp,r,sum=0;
        n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.print("PALINDROME NUMBER");
        }
        else
        System.out.print("NOT A PALINDROME NUMBER");
    }
}
