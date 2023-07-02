package hello;
import java.lang.*;
import java.io.*;
import java.util.*;
public class FindAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n;
        double sum=0,count=0;
        boolean condition = true;
        while(condition){
            n = sc.nextInt();
            if(n==0){
                break;
            }
            sum += n;
            count++;
        }
        double res=sum/count;
        System.out.print(String.format("%.2f",res));

	}

}
