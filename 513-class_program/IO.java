package javalab;
import java.io.*;

public class IO {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter string: ");
        String s = br.readLine();
        System.out.print(s);

    }

}
