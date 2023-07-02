package javaclass;
import java.lang.*;
import java.util.*;
class SpyNumber{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=sc.nextInt();
    int sum=0,pro=1;
    int rem;
    while(num>0){
       rem =num%10;
       num=num/10;
       sum=sum+rem;
       pro=pro*rem;
}
if(sum==pro)
System.out.print("Spy number");
else
System.out.print("Not a spy number");
}
}