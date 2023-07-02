package labclass;
import java.util.*;
import java.lang.*;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int Num = sc.nextInt();
		if(Num%2==0)
		System.out.print("Even number\n");
		else
		System.out.print("Odd number\n");
	}
}
