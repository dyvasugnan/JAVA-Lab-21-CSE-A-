import java.lang.*;
import java.io.*;
class ReadInt{
    public static void main(String args[]) throws IOException{
        System.out.print("Enter a integer: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        int i = Integer.parseInt(s);
        System.out.print("Entered number: "+i+"\n");
    }
}
