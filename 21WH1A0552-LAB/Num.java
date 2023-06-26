import java.lang.*;
import java.io.*;
class Num{
    public static void main(String args[]) throws IOException{
        System.out.print("ENter a number :" );
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        int x = Integer.parseInt(s);
        System.out.println("Number : "+x);
    }
}
