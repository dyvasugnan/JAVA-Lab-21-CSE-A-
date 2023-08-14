import java.io.*;
import java.lang.*;
import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,j,temp,count=0;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.print("Swap count : "+count);
    }
}
