package hello;
import java.lang.*;
import java.util.*;
class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }

	}

}
