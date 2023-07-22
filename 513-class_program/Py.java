package javalab;
import java.util.*;

public class Py {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		double z = Math.sqrt((x*x)+(y*y));
		System.out.println("THe hypotenus is : "+z);
		sc.close();
	}

}
