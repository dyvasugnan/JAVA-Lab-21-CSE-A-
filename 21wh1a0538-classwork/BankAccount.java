package classprogram;
import java.util.*;
class Bank{
	Scanner sc = new Scanner(System.in);
	void display(int r) {
		class Inner {
			float b = 10000;
			void show(int r) {
				float t = b+(b*(r/100));
				System.out.print("The balance is :"+t);
			}
		}
		System.out.print("Enter the password : ");
		String pws = sc.next();
		if(pws.equals("abcd")==true) {
			Inner i = new Inner();
			i.show(r);
		}
			
	}
}
public class BankAccount {
public static void main(String args[]) {
	Bank b = new Bank();
	b.display(700);
}
}
