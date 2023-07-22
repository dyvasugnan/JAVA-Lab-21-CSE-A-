package labclass;
import java.util.*;
import java.io.*;
public class Validtriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>=y*y+z*z){
	        System.out.print("NO");
	    }
	    else if(y>=x*x+z*z){
	    	System.out.print("NO");
	    }
	    else if(z>=x*x+y*y){
	    	System.out.print("NO");      
	    }
	    else
	    	System.out.print("YES");
	}
}
