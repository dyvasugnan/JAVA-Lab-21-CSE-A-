package javalab;
import java.util.Scanner;
public class Cinema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M,sum=0,c=0;
	    N=sc.nextInt();
	    M=sc.nextInt();
	    int[] a = new int[M];
	    for(int i=0;i<M;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<M;i++){
	        if(sum+a[i]<=N){
	            sum = sum+a[i];
	        }
	        else{
	            c++;
	        }
	}
	System.out.print(c);;
	}

}
