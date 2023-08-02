import java.io.*;
import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class StandardDeviation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        float mean,squ = 0;
        n = sc.nextInt();
        int[] N = new int[n];
        for(int i=0;i<n;i++){
            N[i] = sc.nextInt();
            sum += N[i];
        }
        mean = sum/n;
        sum = 0;
        for(int i=0;i<n;i++)
            sum += (N[i]-mean)*(N[i]-mean);
        sum /= n;
        System.out.printf("%.2f%n", Math.sqrt(sum));
    }
}
