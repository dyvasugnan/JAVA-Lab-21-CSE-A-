package java21541;
import java.util.Scanner;
class SpyNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();
        System.out.print(n);
        if (n < 0) {
            System.out.println("Invalid");
        }
        else {
            int sumOfDigits = 0;
            int productOfDigits = 1;

            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                sumOfDigits += digit;
                productOfDigits *= digit;
                temp /= 10;
            }
            System.out.println();

            if(sumOfDigits == productOfDigits){

                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}