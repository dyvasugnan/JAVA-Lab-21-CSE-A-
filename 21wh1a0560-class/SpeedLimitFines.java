package javaclass;
import java.util.*;
public class SpeedLimitFines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		if(speed <= 90)
			System.out.println("0 No warning");
		else if(speed<=110)
			System.out.println((speed-90)*300 + " Warning");
		else
			System.out.print((speed-90)*500 + " License removed");
	}

}
