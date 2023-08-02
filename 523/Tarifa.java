package javalab;
import java.util.*;
public class Tarifa {
	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
		int x,n,p;
		x=sc.nextInt();
		n=sc.nextInt();
		    int r=x+(x*n);
		    for(int i=0;i<n;i++){
		        p=sc.nextInt();
		        r=r-p;
		    }
		    System.out.print(r);
		}
	}
