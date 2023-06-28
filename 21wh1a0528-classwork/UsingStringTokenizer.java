import java.util.*;
import java.io.*;
class UsingStringTokenizer{
    public static void main(String args[])throws IOException{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String name;
       int age;
       float marks;

       System.out.print("Enter name ,age ,marks separated by commas : ");
       String str = br.readLine();

       StringTokenizer st = new StringTokenizer(str,",");

       String s1=st.nextToken();
       String s2=st.nextToken();
       String s3=st.nextToken();

       s1=s1.trim();
       s2=s2.trim();
       s3=s3.trim();

       name = s1;
       age = Integer.parseInt(s2);
       marks = Float.parseFloat(s3);

       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
       System.out.println("Marks : "+marks);
    }
}