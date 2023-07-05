import java.lang.*;
import java.io.*;
class StudentData{
public static void main(String args[])throws IOException{
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.print("Name    : ");
String name =br.readLine();
System.out.print("Age     : ");
int age = Integer.parseInt(br.readLine());
System.out.print("Gender  : ");
String gender = br.readLine();
System.out.print("Marks : ");
int marks = Integer.parseInt(br.readLine());
System.out.print("Address : ");
String address = br.readLine();
System.out.println("Name      :"+name);
System.out.println("Age       :"+age);
System.out.println("Marks     :"+marks);
System.out.println("Gender    :"+gender);
System.out.println("Address   :"+address);
}}
