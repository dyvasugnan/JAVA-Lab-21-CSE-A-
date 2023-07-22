package labclass;
import java.util.*;
import java.io.*;
public class SumOfEvenNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0,i=1;
	    while(i<=n){
	        s+=2*i;
	        i++;
	    }
	    System.out.print(s);

	}

}
