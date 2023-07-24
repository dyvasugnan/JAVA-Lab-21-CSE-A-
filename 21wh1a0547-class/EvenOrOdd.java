import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number");
        int num=sc.nextInt();
        if(num % 2==0){
            System.out.println("Even");
        }
        else
        System.out.println("Odd");
    }
}
