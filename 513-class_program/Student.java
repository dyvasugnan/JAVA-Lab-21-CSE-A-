package javalab;
import java.io.*;
class Student{
public static void main(String args[])throws IOException{
	
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.print("Enter name    : ");
String name =br.readLine();

System.out.print("Enter age     : ");
String a = br.readLine();
int age = Integer.parseInt(a);

System.out.print("Enter gender  : ");
String gender = br.readLine();

System.out.print("Enter marks : ");
int marks = Integer.parseInt(br.readLine());

System.out.print("Enter address : ");
String address = br.readLine();

System.out.println("Name      :"+name);
System.out.println("Age       :"+age);
System.out.println("Marks     :"+marks);
System.out.println("Gender    :"+gender);
System.out.println("Address   :"+address);
}}
