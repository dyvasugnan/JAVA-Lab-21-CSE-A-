package clss;
import java.util.*;
class BnkAcc {
	double bal;
	Scanner sc = new Scanner(System.in);
	BnkAcc(double b){
	bal=b;
}
	void calIntrst(int r) {
		System.out.print("Enter your password");
		String pwd=sc.next;
			if(pwd.equals("Admin 123")) {
				Innerclass in=new Innerclass();
				in.updateBal(r);
			}
			else {
				System.out.prinln("Wrong password");
			}
	}
	class Innerclass{
		void updateBal(int r) {
			double int r=bal*r/100;
			bal+=int r;
			System.out.println("Updated Balance"+bal);
		}
	}
}
public class Innerclass Demo{
	public static void main(String[] args) {
		BnkAcc ba=new BnkAcc(10000);
		ba.calIntrst(9);
	}
}