package classprogram;
import java.util.*;
public class BubblesortDes {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the n value : ");
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i = 0;i<n;i++)
	        a[i] = sc.nextInt();
	        int count = 0;
	        for(int i = 0;i<n;i++){
	            for(int j = 0;j<n-i-1;j++){
	                if(a[j]<a[j+1]){
	                    int t = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = t;
	                    count++;
	                }
	            }
	        }
	        System.out.print("Sorted array in desending order : ");
	        for(int i = 0;i<n;i++)
	        System.out.println(a[i]+" ");
	        System.out.print("The number of swaps are :"+count);
	    }
	}