package javaclss;
import java.util.*;
public class Fibanocci {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,j;
        System.out.print("Enter n : ");
        n = sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        System.out.print(f0+ " "+f1+" ");
        for(int i = 2;i<n;i++){
            f2 = f1+f0;
            System.out.print(f2+ " ");
            f0= f1;
            f1=f2;
        }
	}
}


