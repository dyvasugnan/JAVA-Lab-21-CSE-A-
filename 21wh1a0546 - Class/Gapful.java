/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Gapful
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	    String s = Integer.toString(x);
	    int length = s.length();
	    if(length >= 3){
	        int first = x / (int)(Math.pow(10,(length-1)));
	        int last = x % 10;
	        int div = (first * 10) + last;
	        if(x % div == 0){
	            System.out.println("Gapful number");
	        }
	        else{
	            System.out.println("Not gapful number");
	        }
	    }
	    else{
	    System.out.println("Not gapful number");
	    }
	}
}
