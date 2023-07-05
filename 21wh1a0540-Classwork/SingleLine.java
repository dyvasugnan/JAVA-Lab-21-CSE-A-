import java.lang.*;
import java.io.*;
import java.util.*;
class SingleLine{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("Enter data separated by comma");
String s = br.readLine();
StringTokenizer str = new StringTokenizer(s,",");
String name = str.nextToken();
String s2 = str.nextToken();
String s3= str.nextToken();
int rollno = Integer.parseInt(s2);
int marks = Integer.parseInt(s3);
System.out.println("Name     : "+name);
System.out.println("Rollno   : "+rollno);
System.out.println("Marks    : "+marks);
}
}
