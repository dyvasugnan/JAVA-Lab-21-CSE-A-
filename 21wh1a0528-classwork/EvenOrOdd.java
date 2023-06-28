import java.lang.*;
import java.util.Scanner;
class EvenOrOdd{
    public static void main(String args[]){
        System.out.print("Enter an integer : ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}