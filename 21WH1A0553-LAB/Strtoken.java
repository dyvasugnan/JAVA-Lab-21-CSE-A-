import java.util.*;
import java.io.*;
class Strtoken{
public static void main(String args[]) throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("Enter Details : ");
String s = br.readLine();
StringTokenizer st = new StringTokenizer(s," ");
String s1 = st.nextToken();
String s2 = st.nextToken();
String s3 = st.nextToken();
s1 = s1.trim();
s2 = s2.trim();
s3 = s3.trim();
int age = Integer.parseInt(s2);
System.out.println("Name : "+s1+"\nAge : "+age+"\nGender : "+s3);
}
}

