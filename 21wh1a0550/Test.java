package javaclasswork;
import java.util.Scanner;
public class Test {
	int num;
	   String data;
	   float flt;
	   Test(int num, String data, float flt){
	      this.num = num;
	      this.data = data;
	      this.flt = flt;
	   }
	   public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter an integer value: ");
	      int num = sc.nextInt();
	      System.out.println("Enter a string value: ");
	      String data = sc.next();
	      System.out.println("Enter a floating point value: ");
	      float flt = sc.nextFloat();      
	      Test obj = new Test(num, data, flt);
	      System.out.println(obj.num);
	      System.out.println(obj.data);
	      System.out.println(obj.flt);

	   }
	}
	


