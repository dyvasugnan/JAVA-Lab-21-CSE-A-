import java.lang.*;
import java.util.Scanner;
class EvenOdd{
    public static void main(String args[]){
       System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 == 0)
            System.out.println("EVEN Number");
        else
            System.out.println("ODD Number");
    }
}
