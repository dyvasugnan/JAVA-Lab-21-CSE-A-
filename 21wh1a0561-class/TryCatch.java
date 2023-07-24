package javalab;
import java.util.*;

public class TryCatch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
        	System.out.print("Enter a number: ");
        	int num = Integer.parseInt(sc.nextLine());
            int x = 10/num;
            int a[] = {1, 2, 3, 4, 5};
            int index = Integer.parseInt(sc.nextLine());
            System.out.println(a[index]);
            
        }
        catch(ArithmeticException ae) {
            System.out.println("ArithmeticException: " + ae);
        }
        catch(ArrayIndexOutOfBoundsException aie) {
            System.out.println("ArrayIndexOutOfBoundsException: " + aie);
        }
        finally {
            System.out.println("Cleanup operations");
        }
    }
}
