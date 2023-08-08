import java.util.*;
import java.io.*;

class TryCatchFinally{
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        try{
            int b = 2 /a ;//if a=0 arithmetic exception
            String s = "hello";
            System.out.println(s.charAt(s.length()));//string index out of bounds
            int c[]= new int[2];
            c[3] = a; //array index out of bounds
           System.out.println("End of try block");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds Exception");
        }
        finally{
            System.out.println("After try - catch block ");
        }
    } 
}

