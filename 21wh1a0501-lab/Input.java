import java.lang.*;
import java.util.*;
import java.io.*;
class Input{
public static void main(String args[]){
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("Enter name:");
String str = br.readLine();
System.out.println("Enter age:");
String str1 = br.readLine();
int x = Integer.parseInt(str1);
System.out.println("Enter Gender:");
String str2 = br.readLine();
char ch = str2.charAt(0);
System.out.println("Enter marks:");
String str3 = br.readLine();
int y = Integer.parseInt(str3);
System.out.println("Name : " + str);
System.out.println("Age : " + x);
System.out.println("Gender : " + ch);
System.out.println("Marks : " + str3);
}
}
