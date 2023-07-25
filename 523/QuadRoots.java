package javaclss;
import java.util.Scanner;

public class QuadRoots {

	public static void main(String[] args) {
		        
		        double r1, r2, r3, r;
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter the value r1 : ");
		        r1 = s.nextDouble();
		        System.out.println("Enter the value r2 : ");
		        r2 = s.nextDouble();
		        System.out.println("Enter the value r3 : ");
		        r3 = s.nextDouble();
		        
		        r = r2 * r2 - 4 * r1 * r3;
		        if (r > 0.0)
		        {
		            double root1 = (-r2 + Math.pow(r, 0.5)) / (2.0 * r1);
		            double root2 = (-r2 - Math.pow(r, 0.5)) / (2.0 * r1);
		            System.out.println("The roots are" + root1 + "and" + root2 );
		        }
		        else if(r == 0.0)
		        {
		            double root1 = -r2 / 2.0 * r1;
		            System.out.println("The root is" + root1);
		        }
		        else
		        {
		            System.out.println("The roots are imaginary");
		        }
		    }
}
