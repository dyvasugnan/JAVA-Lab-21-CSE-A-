import java.lang.*;
import java.util.Scanner;
class Gapfull{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        //Scanner sc = new Scanner(System.in);
       /* int n = sc.nextInt();
        int a=0,num=n;
        while(num > 0){
            a = num;
            num /= 10;
        }*/
        String s = sc.nextLine();
        int a = s.charAt(0) - '0';
        int n = Integer.parseInt(s);
        int b = n%10;
        int x = a*10+b;
        if(n % x == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
}
