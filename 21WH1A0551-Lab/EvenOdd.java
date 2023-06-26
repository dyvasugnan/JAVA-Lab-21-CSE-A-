import java.lang.*;
import java.util.*;
class EvenOdd{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2 == 0)
            System.out.print("Even!");
        else
            System.out.print("Odd!");
    System.out.print("\n");
    }
}
