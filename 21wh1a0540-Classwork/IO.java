import java.lang.*;
import java.io.*;
class IO{
public static void main(String args[])throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("Enter string : ");
String s = br.readLine();
System.out.print(s);}}
