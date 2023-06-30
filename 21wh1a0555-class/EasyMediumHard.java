package hello;
import java.lang.*;
import java.util.*;

 class EasyMediumHard {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int n = sc.nextInt();
	        if(a>0 && b>0 && c>0 && a+b+c>=n && n>=3){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }

	}

}
