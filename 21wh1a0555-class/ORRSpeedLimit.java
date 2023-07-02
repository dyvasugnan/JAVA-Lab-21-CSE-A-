package hello;
import java.lang.*;
import java.util.*;
public class ORRSpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if(speed<=90){
            System.out.print("0 No punishment");
        }
        else if(speed>=91 && speed<=110){
            System.out.print(+(speed-90)*300);
            System.out.print(" ");
            System.out.print("Warning");
        }
        else{
            System.out.print(+(speed-90)*500 );
            System.out.print(" ");
            System.out.print("License removed");
        }

	}

}
