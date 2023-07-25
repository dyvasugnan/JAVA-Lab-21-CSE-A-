package javaclss;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		  int i,n,count, j;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the n value : ");
	      n=sc.nextInt();
	      System.out.println("Prime number ");
	      for(i=2;i<=n;i++){
	         count=0;
	         for(j=1;j<=i;j++){
	            if(i%j==0){
	               count++;
	            }
	         }
	         if(count==2)
	         System.out.println(i);
	         
	      }
	}
}
