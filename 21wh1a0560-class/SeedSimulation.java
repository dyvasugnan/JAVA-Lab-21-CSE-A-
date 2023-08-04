import java.io.*;
import java.util.*;
import java.util.Arrays;

public class SeedSimulation {

    public static void main(String[] args) {
        int n,s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        int[] seq = new int[n];
        for(int i=0;i<n;i++)
            seq[i] = sc.nextInt();
        Arrays.sort(seq);
        for(int i=0;i<n;i++){
            if(s == seq[i])
                s *= 3;
        }
        System.out.print(s);
    }
}
