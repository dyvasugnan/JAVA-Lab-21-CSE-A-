import java.lang.*;
import java.io.*;
class Read{
    public static void main(String args[]) throws IOException{
        System.out.print("enter a string : ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println("string is : "+s);
        }
}
