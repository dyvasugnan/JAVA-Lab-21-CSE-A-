package classprogram;
import java.util.*;
public class SpyNumber {
	public static void main(String args[] ){
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num>0){
		sum = sum+(num%10);
		num = num/10;}
		int pro = 1;
		while(temp>0){
		pro = pro*(temp%10);
		temp = temp/10;}
		if(sum==pro)
		System.out.print("spy number");
		else 
		System.out.print("not a spy number");
		}}

