import java.lang.*;
import java.io.*;
class Details{
    public static void main(String args[]) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("enter name : ");
        String s = br.readLine();
        //System.out.println("Name : "+s);
        System.out.print("Enter age : ");
        String a = br.readLine();
        int age = Integer.parseInt(a);
        //System.out.print("Age : "+age);
        System.out.print("Enter gender : ");
        char b = br.readLine().charAt(0);
        //System.out.println("Gender :" +b);
        System.out.print("ENter marks : ");
        String m = br.readLine();
        int marks = Integer.parseInt(m);
        System.out.println("Name : "+s);
        System.out.println("Age : "+age);
        System.out.println("Gender :" +b);
        System.out.println("marks : "+marks);
        }
}
