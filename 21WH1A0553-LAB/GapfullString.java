import java.lang.*;
import java.util.Scanner;
class GapfullString{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
String s = sc.nextLine();
int a = s.charAt(0) - '0';
int n = Integer.parseInt(s);
int b = n%10;
int x = a*10+b;
if(n % x == 0)
System.out.println("Gapfull number");
else
System.out.println("Not a Gapful number");
}
}

