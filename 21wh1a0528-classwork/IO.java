import java.io.*;
class IO{
    public static void main(String args[])throws IOException{
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);

       String name;
       int age;
       char gender;
       float marks;

       System.out.print("Enter name : ");
       name = br.readLine();

       System.out.print("Enter age : ");
       String i=br.readLine();
       age = Integer.parseInt(i);

       System.out.print("Enter marks : ");
       String f=br.readLine();
       marks = Float.parseFloat(f);

       System.out.print("Enter gender : ");
       gender = (char)br.read();

       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
       System.out.println("Gender : "+gender);
       System.out.println("Marks : "+marks);
    }
}