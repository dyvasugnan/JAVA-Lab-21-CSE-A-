import java.util.*;

class ExceptionHandling
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        try{
            x = sc.nextInt();
            y = sc.nextInt();
            int z = x / y;
            System.out.println(z);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Error: Division by zero is not possible");
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
}