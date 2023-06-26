import java.lang.*;
import java.io.*;
import java.util.*;
class Same_line{
    public static void main(String args[])throws IOException{
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        System.out.println("Enter Name,Age,Gender,Marks");
        String str = b.readLine();
        StringTokenizer s = new StringTokenizer(str,",");
        String s1 = s.nextToken();
        String s2 = s.nextToken();
        String s3 = s.nextToken().trim();
        String s4 = s.nextToken().trim();
         
        s1=s1.trim();
        s2=s2.trim();
       
        String Name = s1;
        int Age = Integer.parseInt(s2);
        String Gender = s3;
        float Marks = Float.parseFloat(s4);

        System.out.println("Name"+s1);
        System.out.println("Age"+s2);
        System.out.println("Gender"+s3);
        System.out.println("Marks"+s4);

       
        }
        }
