//Reverse of an Array
import java.util.*;
class ReverseArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0;i<n;i++)
        a[i] = sc.nextLong();
        for(int i=n-1;i>=0;i--)
        System.out.print(a[i]+" ");
    }
}