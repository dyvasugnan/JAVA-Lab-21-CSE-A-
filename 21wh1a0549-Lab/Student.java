import java.lang.*;
import java.io.*;
class Student{
public static void main(String args[])throws IOException
{
    BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter name:");
    String name=x.readLine();
    System.out.println("Enter age:");
    int age=Integer.parseInt(x.readLine());
    System.out.println("Enter gender:");
    String gender=x.readLine();
    System.out.println("Enter marks:");
    float marks=Float.parseFloat(x.readLine());
    System.out.println(name);
    System.out.println(age);
    System.out.println(gender);
    System.out.println(marks);
}
}
