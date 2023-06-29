package classprogram;
import java.util.*;
import java.lang.*;
public class CricketPension {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tm,od;
		boolean mom,pfi,pfipl;
		double money=0 ;
		System.out.print("he played for ipl : Enter true or false");
		pfi = sc.nextBoolean();
		System.out.print("he palyed for india : Enter true or false");
		pfipl = sc.nextBoolean();
		System.out.print("Enter the number of test matches : ");
		tm = sc.nextInt();
		System.out.print("Enter the number of the ods : ");
		od = sc.nextInt();
		if(pfi==false&&pfipl==true)
		money = 8000;
		else if(pfi==false&&pfipl==false)
		money = 7000;
		else if(pfi==true&&pfipl==false)
		money = 10000;
		else{
		 if(tm>10&&od==100)
		money = 50000;
		else if(tm>10)
		money = 2500;
		else if(od>100)
		money = 15000;}
		System.out.println("THe money he received is : "+money);
		System.out.print("he is the man of the match ?:Enter true or false");
		 mom = sc.nextBoolean();

		if(mom==true){
		System.out.print("Enter how many : ");
		int c = sc.nextInt();
		double mones = money+money/4;
		System.out.print("THe money is : "+mones*c);}
		else 
		System.out.print("The money is : "+money);

		}
		}

