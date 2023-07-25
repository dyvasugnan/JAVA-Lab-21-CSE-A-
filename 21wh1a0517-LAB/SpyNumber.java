package javalab;

import java.util.*;

public class SpyNumber {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = sc.nextInt();

        int temp = num;
        int pdt = 1;
        int sum = 0;

        while(temp>0){
            int last_digit = temp%10;
            pdt *= last_digit;
            sum += last_digit;
            temp /= 10;
        }

        if(sum == pdt){
            System.out.println("True");
        }
        else{
        System.out.println("False");
        }

    }
}