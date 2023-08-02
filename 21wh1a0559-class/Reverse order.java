import java.io.*;
import java.util.*;

public class Reverse_order {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] N = new int[n];;
        for(int i=0;i<n;i++)
            N[i] = sc.nextInt();
        for(int i=n-1;i>=0;i--)
            System.out.println(N[i]);
    }
}
