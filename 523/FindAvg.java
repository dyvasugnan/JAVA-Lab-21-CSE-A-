package javaclss;
import java.util.*;
public class FindAvg {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n;
	int count=0;
	float sum=0;
	boolean condition = true;
	while(condition) {
		n=sc.nextInt();
		if(n!=0) {
			sum += n;
			count +=1;
		}
		else {
			break;
		}
	}
	System.out.print(sum/count);
}
	
}
