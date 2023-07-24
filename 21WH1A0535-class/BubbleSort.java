//Bubble sort
import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long temp;
        for(int i=0;i<n;i++)
        a[i] = sc.nextLong();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}