//bubblesort and to count no of swaps


import java.util.*;
import java.lang.*;

public class Bubblesort
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = sc.nextInt();
    int mat[] = new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++){
        mat[i] = sc.nextInt();
    }
        int temp,count=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(mat[j] < mat[j+1]){
                    temp = mat[j];
                    mat[j] = mat[j+1];
                    mat[j+1] = temp;
                    count++;
                }
            }
           
        }
        System.out.println("After sorting :");
        for(int i=0;i<n;i++){
          System.out.println(mat[i]);
        }
    System.out.println("count:"+count);
}
}
