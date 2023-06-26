import java.lang.*;
import java.util.Scanner;
class Add{
    public static void main(String args[]){
        System.out.print("Enter two Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("Sum : "+add);
        }
}
