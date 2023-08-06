package java_lab;
import java.util.*;
public class SpyNumber {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n<0) {
	    	System.out.println(-1);
	    }
	    else {
	    int temp = n;
	    int r1=0,r2=0,r3=1;
	    while(n!=0) {
	    	r1 = n%10;
	    	r2 += r1;
	    	r3 *= r1;
	    	n = n/10;
	    }
	    if(r2 == r3) {
	    	System.out.println("true");
	    }
	    else {
	    	System.out.println("false");
	    }
	    }
	}
}


