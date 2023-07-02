package javalab;
import java.util.*;
public class TwoDArray {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array sizes : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter array elements ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                  System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }  
    }
}
