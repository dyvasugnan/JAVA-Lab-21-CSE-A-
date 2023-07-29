package javalab;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
    int year=sc.nextInt();
    
    if(year%400==0 && year%4==0){
        System.out.print("YES");
    }
    else if(year%400==0 && year%100!=0){
    	System.out.print("YES");
    }
    else
    	System.out.print("NO");
}
}