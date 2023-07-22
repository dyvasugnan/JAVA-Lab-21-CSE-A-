package labclass;
import java.util.*;
import java.io.*;
public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		if(y%400==0){
	        System.out.print("YES");
	    }
	    else if(y%100==0){
	    	System.out.print("NO");
	    }
	    else if(y%4==0){
	    	System.out.print("YES");
	    }
	    else{
	    	System.out.print("NO");
	    }

	}

}
