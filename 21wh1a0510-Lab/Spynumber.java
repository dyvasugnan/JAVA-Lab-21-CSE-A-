import java.lang.*;
import java.util.*;
class Spynumber{
public static void main(String args[]){
int num,sum=0,rem,product=1,temp=0,temp2=0;
Scanner sc = new Scanner(System.in);

System.out.print("enter the number : ");
num = sc.nextInt();
while(num !=0){
rem = num%10;
num /=10;
sum = sum + rem;
product = product*rem;
temp = sum;
temp2 = product;
}
if(temp==temp2){
System.out.println("SPYNUMBER");
}
else{
System.out.println("NOT SPYNUMBER");
}
}
}

