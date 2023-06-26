import java.util.*;
class Spy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0,mul=1;
        while(n > 0){
            int rem = n%10;
            sum += rem;
            mul *= rem;
            n = n/10;
        }
        if(sum == mul)
            System.out.println("SPY NUMBER");
        else
            System.out.println("NOT A SPY NUMBER");
        }
}
