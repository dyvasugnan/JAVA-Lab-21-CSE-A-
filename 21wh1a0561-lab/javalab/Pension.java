package javalab;
import java.util.Scanner;
public class Pension {
	public static void main(String[] args) {
		int odi,ipl,test,man,amount;
		Scanner sc = new Scanner(System.in);
		System.out.print("no.of odi played: ");
		odi = sc.nextInt();
		System.out.print("no.of ipl played: ");
		ipl = sc.nextInt();
		System.out.print("no.of test matches played: ");
		test = sc.nextInt();
		System.out.print("no.of man of the matches played: ");
		man = sc.nextInt();
		if(test>10&&odi>100){
		  amount = 50000 + (50000/4 * man);
		  System.out.print("amount:" +amount);
		 }
		 else if(test>10){
		  amount = 25000 + (25000/4 * man);
		  System.out.print("amount:" +amount);
		 }
		 else if(odi>100){
		  amount = 15000 + (15000/4 * man);
		  System.out.print("amount:" +amount);
		 }
		 else if(ipl == 0){
		  amount = 10000 + (10000/4 * man);
		  System.out.print("amount:" +amount);
		 }
		 else if(test==0&&odi==0){
		  amount = 8000 + (8000/4 * man);
		  System.out.print("amount:" +amount);
		 }
		 else{
		  amount = 7000+(7000/4 * man);
		 }
	}		 
}
