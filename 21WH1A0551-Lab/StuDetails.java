import java.lang.*;
import java.io.*;
class StuDetails{
    public static void main(String args[]) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter name: ");
        String s = br.readLine();
        //System.out.print("Name: "+ s+"\n");
        System.out.print("Enter age: ");
        String a = br.readLine();
        int age = Integer.parseInt(a);
        //System.out.print("Age: "+ age+"\n");
        System.out.print("Enter gender: ");
        char g = br.readLine().charAt(0);
        //System.out.print("Gender: "+g+"\n");
        System.out.print("Enter marks: ");
        String m = br.readLine();
        float marks = Float.parseFloat(m);
        System.out.print("Entered Details:\n");
        System.out.print("Name: "+ s+"\n");
        System.out.print("Age: "+ age+"\n");
        System.out.print("Gender: "+g+"\n");
        System.out.print("Marks: "+marks+"\n");
    }
}

