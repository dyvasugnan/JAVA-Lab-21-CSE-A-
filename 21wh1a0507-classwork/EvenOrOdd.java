package java_codes;

import java.util.*;
public class EvenOrOdd {
	public static void main(String args[]){
       int n;
       System.out.print("Enter the number:");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       if(n%2==0) {
    	   System.out.print("EVEN");
       }
       else {
    	   System.out.print("ODD");
       }
}
}
