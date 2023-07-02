package javaclss;
import java.util.*;
public class SpyNum {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int product = 1;
    if (n < 0) {
        System.out.println("-1");
    } else {
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }
        if (sum == product) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
	}
}