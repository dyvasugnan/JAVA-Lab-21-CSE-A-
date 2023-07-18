package javaclass;
import java.util.*;
public class ReceptionParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int guests = sc.nextInt();
		int gifts = sc.nextInt();
		if(gifts % guests == 0)
			System.out.println("0");
		else {
			int additionalGifts = guests - gifts % guests;
			System.out.println(additionalGifts);
	}
	}

}
