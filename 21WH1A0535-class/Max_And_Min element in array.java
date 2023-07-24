//Largest and Smallest element in Array
import java.util.*;
class Min_And_Max{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0;i<n;i++)
        a[i] = sc.nextLong();
        long max = a[0];
        long min = a[0];
        for(int j=1;j<n;j++){
            if(a[j]>max)
            max = a[j];
        }
        for(int k=1;k<n;k++){
            if(a[k]<min)
            min = a[k];
        }
        System.out.println("Maximum Element : "+max);
        System.out.println("Minimum Element : "+min);
    }
}