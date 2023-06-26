import java.lang.*;
import java.util.*;
class Gapfull{
public static void main(String args[]){
System.out.print("Enter an integer:");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int x = n % 10;;
String n1 = String.valueOf(n);
int len = n1.length();
int lgt = len - 1;
double power = Math.pow(10, lgt);
int y = (int)(n / power);
int div = y * 10 + x;
int res = n % div;
if(len >= 3 && res == 0){
    System.out.println("Gapfull Number");
}
else{
System.out.println("Not Gapfull");
}
}
}
