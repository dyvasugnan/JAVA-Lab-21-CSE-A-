import java.lang.*;
import java.util.Scanner;
class GapFullNum{
public static void main(String args[]){
int num,f,l,p,r,temp,count = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter Number : ");
num = sc.nextInt();
temp = num;
while(temp>0){
temp = temp/10;
count ++;
}
if(count<3)
System.out.print("Not a gapfullnumber");
p =(int) Math.pow(10,count-1);
f = num%10;
l = num/p;
r = l*10+f;
if(num%r==0)
System.out.print("GIven number is a gapfull number");
else 
System.out.print("Given number is not a gapfull number");

}}
