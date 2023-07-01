package hello;
import java.lang.*;
import java.util.*;
class EvenNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0,even=2;
        for(int i=0;i<n;i++){
            sum = sum+even;
            even = even+2;
        }
        System.out.print(+sum);

	}

}
