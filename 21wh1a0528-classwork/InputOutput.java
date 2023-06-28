import java.io.*;
class InputOutput{
    public static void main(String args[])throws IOException{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String name;
       int age;
       char gender;
       float marks;

       System.out.print("Enter name : ");
       name = br.readLine();

       System.out.print("Enter age : ");
       age = Integer.parseInt(br.readLine());

       
       System.out.print("Enter gender : ");
       gender = br.readLine().charAt(0);

       System.out.print("Enter marks : ");
       marks = Float.parseFloat(br.readLine());

       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
       System.out.println("Gender : "+gender);
       System.out.println("Marks : "+marks);
    }
}