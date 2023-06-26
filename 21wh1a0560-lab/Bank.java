package javalab;
import java.util.*;
public class Bank {
	int p ;
	public Bank(int amount) {
		// TODO Auto-generated constructor stub
		p = amount;
	}
	void calI(int r) {
		class Inner{
			void interest() {
			int ri = r;
			int t = 3;
			int intrst = p*t*ri / 100;
			System.out.println("Interest : "+intrst);
		}
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password : ");
		String pwd = sc.next();
		if(pwd.equals("adarsha123")) {
			Inner inn = new Inner();
			inn.interest();
		}
		else
			System.out.println("Password incorrect");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(100000);
		b.calI(3);
	}

}
