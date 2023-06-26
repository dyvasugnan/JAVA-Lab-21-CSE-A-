import java.lang.*;
import java.util.Scanner;
class GapFull{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = s.charAt(0) - '0';
        int n = Integer.parseInt(s);
        int b = n%10;
        int newnum = a*10 + b;
        if(n%newnum == 0)
            System.out.print("It is a GapFull number");
        else
            System.out.print("It is not a GapFull number");

        System.out.print("\n");
    }
}
