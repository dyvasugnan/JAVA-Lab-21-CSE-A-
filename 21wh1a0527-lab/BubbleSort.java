import java.lang.*;
import java.util.*;

class Main{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter the value of n: ");
    int n = sc.nextInt ();
    int m[] = new int[n];
      System.out.println ("enter elements: ");
    for (int i = 0; i < n; i++){
	m[i] = sc.nextInt ();
      }
	int tem, cnt = 0;
	for (int i=0;i< n; i++){
	    for (int j=i;j<n-1;j++){
		if (m[j] > m[j + 1]){
		    tem=m[j];
		    m[j]=m[j+1];
		    m[j+1]=tem;
		    cnt++;
		  }
	      }
	  }
	System.out.println("after sorting");
	for(int i=0;i<n;i++){
	    System.out.println(m[i]+" ");
	  }
	System.out.println(cnt);
      }
  }

