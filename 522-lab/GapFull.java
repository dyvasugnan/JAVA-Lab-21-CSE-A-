package javaclass;
import java.lang.*;
import java.util.Scanner;
class GapFull{
public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
int num = sc.nextInt();
int r=0,rem=0,temp=num;
r=num%10;
while(num>0){
rem =num%10;
num = num/10;
}
int res = (rem*10)+r;
System.out.println("First and last number are : "+res);
if(temp%res == 0)
System.out.print("Gapful number");
else
System.out.print("Not a Gapfull number");
}
}