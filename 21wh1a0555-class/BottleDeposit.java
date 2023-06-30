package hello;
import java.lang.*;
import java.util.*;
public class BottleDeposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int container1,container2;
        container1 = sc.nextInt();
        container2 = sc.nextInt();
        double deposit = container1*0.10 + container2*0.25;//in dollars
        System.out.println("$%.2f"+deposit);
	}

}
