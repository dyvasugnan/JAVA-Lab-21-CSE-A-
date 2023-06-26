import java.lang.*;
import java.io.*;
class ReadString{
    public static void main(String args[]) throws IOException{
        System.out.print("Enter a String: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.print("Entered String: "+s+"\n");

    }
}
