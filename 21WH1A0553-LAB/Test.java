package javalab;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    System.out.print("Enter no. of students: ");
		    int n = sc.nextInt();
		    System.out.print("Enter student marks: ");
		    int a[] = new int [n];
		    for (int i=0;i<n;i++)
		    	a[i] = sc.nextInt();
		    Arrays.sort(a);
		    int i = n-1,flag=0;
		    while(i>0) {
	              if(a[i] != a[i-1]) {
	            	  if(i < n && a[i] != a[i+1]) {
	                      flag = 1;
	                      System.out.print("Highest Marks : "+a[i]);
	                      break;
	            	  }
	            	  else 
	            		  i--;
	              }
	              else
	            	   i--;
		     }
              i = 0;
              if(flag == 0 && a[i] != a[i+1]){
            	  flag = 1;
            	  System.out.print("Highest Marks : "+a[i]);
              }
              if(flag == 0)
            	  System.out.print("-1");
	}
}
		    
		    