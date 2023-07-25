/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class OddOrEven
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0){
		    System.out.println("Even");
		}
		else{
		    System.out.println("Odd");
		}
	}
}
