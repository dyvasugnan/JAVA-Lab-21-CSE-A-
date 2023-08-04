package java_lab;
import java.util.*;
import java.lang.*;
public class NumSeries {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = sc.nextInt();
	        for(int i=1;i<=num;i++){
	            for(int k=1;k<=num;k++){
	                int x=k*(k+1);
	                if(i==x)
	                System.out.println(+x);
	            }
	        }
	        
	    }

}
