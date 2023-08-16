package java_lab;
import java.lang.*;
import java.util.*;
class Bnk{
	double balance;
	Scanner sc = new Scanner(System.in);
	Bnk(double balance){
		this.balance = balance; 
	}
	void Calc(int r) {
		System.out.println("Enter ur password");
		String pwd = sc.next();
		if(pwd.equals("abcd")) {
			InnerClass inn = new InnerClass();
			inn.updateBal(r);
		}
		else {
			System.out.println("Wrong Password");
		}
	}
	class InnerClass{
		void updateBal(int r) {
			int res = (int)balance * r/100;
			balance  = (double)res;
			System.out.println("Updated Bal:"+balance);
		}
	}
}
public class BankAccount {
	public static void main(String args[] ){
		Bnk ba = new Bnk(10000);
		ba.Calc(9);
	}
}
