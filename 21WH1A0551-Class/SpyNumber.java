package practice;
import java.lang.*;
import java.io.*;
import java.util.*;
public class SpyNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum=0,product=1;
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            product = product*num;
            num = num/10;
        }
        if(sum==product){
            System.out.println("It is a spy number");
        }
        else{
            System.out.println("It is not a spy number");
        }
    }
}

