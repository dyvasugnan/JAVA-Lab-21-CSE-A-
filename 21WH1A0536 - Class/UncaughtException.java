import java.util.Scanner;

public class UncaughtException {
        
    public static void main(String[] args) {
                
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the a and b values: ");
        int a = read.nextInt();
        int b = read.nextInt();
        int c = a / b;
        System.out.println(a + "/" + b +" = " + c);
        
    }
}
