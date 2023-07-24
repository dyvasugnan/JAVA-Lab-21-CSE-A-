import java.util.*;
public class Exception{
    public static void main(String[] args) {
        int a=3;
        int b=0;
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        try{
            int r=a/b;
             arr[3]=4;
        }
        catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("b cant be Zero");
        }
        catch(ArrayIndexOutOfBoundException e){
            System.out.println("index out of bound ");
        }
        finally{
            System.out.println("Executed!!");
        }
    }
} 