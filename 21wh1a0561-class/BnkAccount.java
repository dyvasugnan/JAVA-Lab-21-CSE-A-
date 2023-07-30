package javalab;
import java.util.Scanner;
public class Account{
    void calculateInterest(){
		Scanner sc=new Scanner(System.in);
		String password=sc.next();
		if(password.equals("admin123")){
			class Inner{
				void calculateInterestRate(){
					int bal=sc.nextInt();
					int rate=sc.nextInt();
					int interest=(rate*bal)/100;
					System.out.println(interest);
					bal=bal+interest;
					System.out.println(bal);
				}
			}
			Inner in=new Inner();
			in.calculateInterestRate();
		}
		else {
			System.out.println("Invalid");
		}
	}
}
public class BnkAccount {
	public static void main(String[] args) {
		Account a=new Account();
		a.calculateInterest();

	}
}